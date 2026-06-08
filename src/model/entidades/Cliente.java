package model.entidades;

public class Cliente {

    private Long id;
    private String nome;
    private String placaCarro;
    private String telefone;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String placaCarro, String telefone) {
        this.id = id;
        this.nome = nome;
        this.placaCarro = placaCarro;
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
