package model;

public class Livro {
    private String titulo;
    private String autor;
    private Integer anoPublicacao;

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
