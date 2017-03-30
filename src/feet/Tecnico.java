package feet;

public class Tecnico {

    private int id;
    private String nome;
    private int experiencia;
    private String pais;
    private int ofensivo;
    private Time time;
    private int pontuacao;
    private double valorPasse;
    
    public Tecnico(int id, String nome, String pais, int ofensivo, Time time) {
        this.id = id;
        this.nome = nome;
        this.pais = pais;
        this.ofensivo = ofensivo;
        this.experiencia = 0;
        this.time = time;
        this.pontuacao = 0;
        this.valorPasse = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public double getValorPasse() {
        return valorPasse;
    }

    public void setValorPasse(double valorPasse) {
        this.valorPasse = valorPasse;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getOfensivo() {
        return ofensivo;
    }

    public void setOfensivo(int ofensivo) {
        this.ofensivo = ofensivo;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
    
    @Override
    public String toString() {
        return getNome();
    }    
}
