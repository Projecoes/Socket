import java.io.*;
import java.net.Socket;

public class ClienteTCP {
    public static void main(String[] args) {
        BufferedReader doUsuario = new BufferedReader(new InputStreamReader(System.in));

        try {
            Socket socketCliente = new Socket("localhost", 6789);

            ObjectOutputStream paraServidor = new ObjectOutputStream(socketCliente.getOutputStream());
            ObjectInputStream doServidor = new ObjectInputStream(socketCliente.getInputStream());


            int id = 1;
            while (true) {
                System.out.println("Digite o nome do aluno (ou SAIR para finalizar): ");
                String nome = doUsuario.readLine();
                if (nome.equalsIgnoreCase("sair")) {
                    paraServidor.writeObject(null);
                    break;
                }

                System.out.println("Digite a nota do aluno: ");
                double nota = Double.parseDouble(doUsuario.readLine());

                Aluno aluno = new Aluno(nome, nota, id++);

                paraServidor.writeObject(aluno);

                String respostaServidor = (String) doServidor.readObject();
                System.out.println("Do servidor: " + respostaServidor);
            }
            socketCliente.close();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}