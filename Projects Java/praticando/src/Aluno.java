public class Aluno {
    private String nome;
    private int codigo;
    private int codigoSala;

    Aluno(String nome, int codigo, int codigoSala) {
        this.nome = nome;
        this.codigo = codigo;
        this.codigoSala = codigoSala;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public int getCodigoSala() {
        return this.codigoSala;
    }

    public void setCodigoSala(Integer codigoSala) {
        this.codigoSala = codigoSala;
    }

    public String toString() {
        return "{Nome: " + this.nome + " " +
                "Código: " + this.codigo + " " +
                "Código Sala: " + this.codigoSala + "}";
    }
}
