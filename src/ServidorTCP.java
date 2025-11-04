import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServidorTCP {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        ServerSocket socketRecepcao = null;

        try {
            socketRecepcao = new ServerSocket(6789);
            while (true) {
                System.out.println("Servidor aguardando conexão...");
                Socket socketConexao = socketRecepcao.accept();
                System.out.println("Servidor conectado com cliente...");

                //le o fluxo do socket
                ObjectInputStream doCliente = new ObjectInputStream(socketConexao.getInputStream());
                ObjectOutputStream paraCliente = new ObjectOutputStream(socketConexao.getOutputStream());

                while (true) {
                    Aluno aluno = (Aluno) doCliente.readObject();

                    if (aluno == null) {
                        break;
                    }

                    alunos.add(aluno);
                    System.out.println("Aluno inserido com sucesso!");
                    System.out.println("Alunos já inseridos: ");
                    for (Aluno al : alunos) {
                        System.out.println(al);
                    }
                    paraCliente.writeObject("Aluno inserido com sucesso!");
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
