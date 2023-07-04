package model;

public class Pessoa {

    private String nome;
    private Integer idade;
    private Double altura;

    public Boolean verificarMaioridade(){
        return idade >= 18;
    }
}
