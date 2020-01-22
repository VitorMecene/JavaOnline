package br.com.abc.javacore.associacao.exercicio1;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void print(){
        System.out.println("-------------- Relatório de Seminários --------------");
        System.out.println("Titulo: "+this.titulo);
        if (this.local != null)
            System.out.println("Professor palestrante: "+this.professor.getNome());
        else
            System.out.println("Nenhum professor cadastrado para esse seminario");

        if (this.local != null)
            System.out.println("Local - Rua: "+this.local.getRua()+", Bairro: "+this.local.getBairro());
        else
            System.out.println("Nenhum local cadastrado para esse seminario");

        if (alunos != null && alunos.length != 0){
            System.out.println("Alunos participantes:");
            for(Aluno aluno : alunos){
                System.out.println(aluno.getNome());
            }
            return;
        }
        System.out.println("Nenhum aluno cadastrado");
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
