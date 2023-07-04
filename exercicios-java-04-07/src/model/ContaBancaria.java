package model;

public class ContaBancaria {

    private Integer numeroConta;

    private Double saldo;

    public void depositar(Double valor){
        saldo += valor;
    }

    public void sacar(Double valor){
        saldo -= valor;
    }
}
