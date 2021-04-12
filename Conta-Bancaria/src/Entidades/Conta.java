package Entidades;

/* Métodos */
public class Conta {

    private int numeroConta;
    private String cliente;
    private double saldo;

    /* Construtores */

    public Conta(int numeroConta, String cliente){
        this.numeroConta = numeroConta;
        this.cliente = cliente;
    }

    public Conta(int numeroConta, String cliente, double depositoInicial){
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        deposito(depositoInicial);
    }

    /* Getters e Setters */

    public int getNumeroConta(){
        return numeroConta;
    }

    public String getCliente(){
        return cliente;
    }
    public void setCliente(String cliente){
        this.cliente = cliente;
    }

    public double getSaldo(){
        return saldo;
    }

        /* Métodos */

    public void deposito(double montante){
       saldo += montante;
    }

    public void saque(double montante){
        saldo -= montante + 5.0;
    }

    public String toString(){
        return "Conta: "
                + numeroConta
                +", Cliente: "
                +cliente
                +", Saldo: R$ "
                +String.format("%.2f", saldo);
    }




}
