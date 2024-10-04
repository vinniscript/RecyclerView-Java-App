package br.com.fabriciocurvello.recycleview_classroom.model;

public class Disciplina {

    private String nomeDisciplina;
    private String professor;
    private String diaSemana;
    private String sala;

    // Método construtor
    public Disciplina(String nomeDisciplina, String professor, String diaSemana, String sala) {
        this.sala = sala;
        this.diaSemana = diaSemana;
        this.professor = professor;
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
