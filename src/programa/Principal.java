package src.programa;

import src.entidades.Banco;
import src.entidades.Cliente;
import src.entidades.Conta;
import src.entidades.ContaCorrente;
import src.entidades.ContaPoupanca;
import src.exceptions.TransacaoException;

/**
 * <h1>Implementação do Banco Digital</h1>
 * @author Sandy Caires
 * @since 21/06/2024
 * @version 1.0
 */

public class Principal {
    public static void main(String[] args) {
        Banco banco = new Banco("Bamco B20");

        try{
            Cliente cliente1 = new Cliente("Simon", "888.888.888-88");
            Conta conta1 = new ContaPoupanca(cliente1);
            banco.adicionarConta(conta1);
            conta1.depositar(100);
            conta1.sacar(50);
            conta1.imprimirExtrato();


            Cliente cliente2 = new Cliente("Dalila", "555.555.555-55");
            Conta conta2 = new ContaCorrente(cliente2);
            banco.adicionarConta(conta2);
            conta2.depositar(500.0);
            conta2.transferir(100, conta1);
            conta2.imprimirExtrato();
            
            conta1.imprimirExtrato();

            System.out.println("\nQuantidade de contas no banco: " + banco.obterQauntidadeContas());
            banco.imprimirNomeClientes();

            //banco.mostrarContas();

        } 
        catch(TransacaoException e){
          System.out.println(e.getMessage());
        } 
        catch(Exception e){
          System.out.println(e.getMessage());
        }
    }
}

