package br.com.abc.javacore.associacao.exercicio1;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void print(){
        System.out.println("-------------- Relatório de Professor --------------");
        System.out.println("Nome do professor: "+this.nome);
        System.out.println("Especialidade do professor: "+this.especialidade);
        if(seminarios != null && seminarios.length !=0){
            System.out.println("Seminarios participantes:");
            for (Seminario sem : seminarios) {
                System.out.println(sem.getTitulo());
            }
            return;
        }
        System.out.println("Professor não vinculado a nenhum seminario");
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
