package pooaula06;

public class Aluno {
    private String nome;
    private int ra;
    private String curso;

    public Aluno(String nome, int ra, String curso) {
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
    }

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
