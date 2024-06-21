package src.entidades;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> listaContas;

    public Banco(String nome) {
        this.nome = nome;
        this.listaContas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        listaContas.add(conta);
    }

    public void mostrarContas(){
        listaContas.stream()
        .forEach(e -> e.imprimirExtrato());
    }

    public List<Cliente> listarClientes(){
        List<Cliente> todosClientes = new ArrayList<>();
        for(Conta c : listaContas){
            todosClientes.add(c.getCliente());
        }
        return todosClientes;
    }

    public void imprimirNomeClientes(){
        List<Cliente> todosClientes = listarClientes();
        System.out.println("\nLista com o nome de todos os clientes do banco: ");
        todosClientes.stream().forEach(e -> System.out.println(e.getNome()));
    }

    public int obterQauntidadeContas(){
        return listaContas.size();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getListaContas() {
        return listaContas;
    }

    
}



