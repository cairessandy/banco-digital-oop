package src.entidades;

public class Cliente {
    // Atributos
    private String nome; 
    private String cpf;

    public Cliente() {
    }
    
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    
    
}
