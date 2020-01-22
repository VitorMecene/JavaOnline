package br.com.abc.javacore.associacao.exercicio1;

public class Aluno {
    private String nome;
    private String idade;
    private Seminario seminario;

    public Aluno() {
    }

    public Aluno(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void print(){
        System.out.println("-------------- Relatório de Alunos --------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        if (this.seminario != null)
            System.out.println("Seminario Inscrito: "+this.seminario.getTitulo());
        else
            System.out.println("Aluno não tem seminario");
    }




    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
