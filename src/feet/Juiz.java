package feet;

public class Juiz {
    
    private int id;
    private String nome;
    private int tecnica;
    private String pais;
    private int rigor;
    private int idade;

    public Juiz(int id, String nome, int tecnica, String pais, int rigor, int idade) {
        this.id = id;
        this.nome = nome;
        this.tecnica = tecnica;
        this.pais = pais;
        this.rigor = rigor;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTecnica() {
        return tecnica;
    }

    public void setTecnica(int tecnica) {
        this.tecnica = tecnica;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getRigor() {
        return rigor;
    }

    public void setRigor(int rigor) {
        this.rigor = rigor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    

}
