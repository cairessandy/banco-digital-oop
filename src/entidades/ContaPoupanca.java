package src.entidades;

public class ContaPoupanca extends Conta {
    private Double taxaJuros;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        this.taxaJuros = 0.5;
    }

    @Override
    public void imprimirExtrato() {
       System.out.println("\nConta Poupança");
       super.imprimirInfo();
       System.out.println("Taxa de juros: " + taxaJuros);
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

}
