package model;

public class Funcionario {
    private String nome;

    private String cargo;

    private Double salario;

    public void aumentarSalario(Integer porcentagem){
        salario += (salario * (porcentagem / 100));
    }
}
