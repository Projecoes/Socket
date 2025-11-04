import java.io.Serializable;

public class Aluno implements Serializable {
    private String nome;
    private double nota;
    private int id;

    public Aluno(String nome, double nota, int id) {
        this.nome = nome;
        this.nota = nota;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Nota: " + nota;
    }
}
