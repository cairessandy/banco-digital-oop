package src.entidades;

import src.exceptions.TransacaoException;
import src.interfaces.IConta;

public abstract class Conta implements IConta{
    private static final Integer AGENCIA_PADRAO = 1;
    private static Integer SEQUENCIAL = 1000;

    protected Integer agencia;
    protected Integer numero;
    protected Double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public void sacar(double valor){
        if(valor <= saldo && valor > 0){
            saldo -= valor;
        } else {
            throw new TransacaoException("Saldo insuficiente"); 
        }
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
        } else {
            throw new TransacaoException("Valor inválido"); 
        }
    }

    public void transferir(double valor, IConta conta){
        sacar(valor);
        conta.depositar(valor);
    }

    protected void imprimirInfo(){
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Agência : " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

}
