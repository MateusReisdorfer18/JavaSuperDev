package br.com.poo.model;

public class Pessoa {
    int id;
    String nome;
    Integer idade;
    boolean isNegativado;

    public Pessoa() {}

    public Pessoa (int id) { this.id = id; }

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public boolean isNegativado() { return isNegativado; }

    public void setNegativado(boolean isNegativado) { this.isNegativado = isNegativado; }

    public Integer getIdade() { return idade; }

    public void setIdade(Integer idade) { this.idade = idade; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public void switchIsNegativado() { this.isNegativado = !this.isNegativado; }

    public String validarSituacao() {
        if(this.isNegativado) {
            return "Cadastro Ativo para %s";
        }

        return "Cadastro negativado para %s";
    }
}
