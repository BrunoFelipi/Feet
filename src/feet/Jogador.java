package feet;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

    private int id;
    private String nome;
    private int idade;
    private int forca;
    private String posicao;
    private int energia;
    private String pais;
    private String habilidade;
    private boolean craque;
    private String titular;
    private String melhorPe;
    private Time time;
    private int golsTemporada;
    private int golsTotal;
    private int assistenciasTemporada;
    private int assistenciasTotal;
    private int qtdCartaoAmareloTemporada;
    private int qtdCartaoVermehoTemporada;
    private int qtdCartaoAmareloTotal;
    private int qtdCartaoVermehoTotal;
    private double valorPasse;
    private int agressividade;
    private List<Premio> listaPremio;

    public Jogador(int id, String nome, int idade, int forca, String posicao, String pais, String habilidade, boolean craque, String titular,
            String melhorPe, Time time, int agressividade) {
        setId(id);
        setNome(nome);
        setIdade(idade);
        setForca(forca);
        setPosicao(posicao);
        setPais(pais);
        setHabilidade(habilidade);
        setCraque(craque);
        setTitular(titular);
        setMelhorPe(melhorPe);
        setTime(time);
        setGolsTemporada(0);
        setGolsTotal(0);
        setAssistenciasTemporada(0);
        setAssistenciasTotal(0);
        setQtdCartaoAmareloTotal(0);
        setQtdCartaoVermehoTotal(0);
        setQtdCartaoAmareloTemporada(0);
        setQtdCartaoVermehoTemporada(0);
        setAgressividade(agressividade);
        this.listaPremio = new ArrayList<>();
    }

    public int getGolsTotal() {
        return golsTotal;
    }

    public void setGolsTotal(int golsTotal) {
        this.golsTotal = golsTotal;
    }

    public int getAssistenciasTotal() {
        return assistenciasTotal;
    }

    public void setAssistenciasTotal(int assistenciasTotal) {
        this.assistenciasTotal = assistenciasTotal;
    }

    public int getGolsTemporada() {
        return golsTemporada;
    }

    public void setGolsTemporada(int golsTemporada) {
        this.golsTemporada = golsTemporada;
    }

    public int getAssistenciasTemporada() {
        return assistenciasTemporada;
    }

    public void setAssistenciasTemporada(int assistenciasTemporada) {
        this.assistenciasTemporada = assistenciasTemporada;
    }

    public int getQtdCartaoAmareloTemporada() {
        return qtdCartaoAmareloTemporada;
    }

    public void setQtdCartaoAmareloTemporada(int qtdCartaoAmareloTemporada) {
        this.qtdCartaoAmareloTemporada = qtdCartaoAmareloTemporada;
    }

    public int getQtdCartaoVermehoTemporada() {
        return qtdCartaoVermehoTemporada;
    }

    public void setQtdCartaoVermehoTemporada(int qtdCartaoVermehoTemporada) {
        this.qtdCartaoVermehoTemporada = qtdCartaoVermehoTemporada;
    }

    public int getQtdCartaoAmareloTotal() {
        return qtdCartaoAmareloTotal;
    }

    public void setQtdCartaoAmareloTotal(int qtdCartaoAmareloTotal) {
        this.qtdCartaoAmareloTotal = qtdCartaoAmareloTotal;
    }

    public int getQtdCartaoVermehoTotal() {
        return qtdCartaoVermehoTotal;
    }

    public void setQtdCartaoVermehoTotal(int qtdCartaoVermehoTotal) {
        this.qtdCartaoVermehoTotal = qtdCartaoVermehoTotal;
    }

    public double getValorPasse() {
        return valorPasse;
    }

    public void setValorPasse(double valorPasse) {
        this.valorPasse = valorPasse;
    }

    public int getAgressividade() {
        return agressividade;
    }

    public void setAgressividade(int agressividade) {
        this.agressividade = agressividade;
    }

    public List<Premio> getListaPremio() {
        return listaPremio;
    }

    public void setListaPremio(List<Premio> listaPremio) {
        this.listaPremio = listaPremio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public boolean isCraque() {
        return craque;
    }

    public void setCraque(boolean craque) {
        this.craque = craque;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getMelhorPe() {
        return melhorPe;
    }

    public void setMelhorPe(String melhorPe) {
        this.melhorPe = melhorPe;
    }

    @Override
    public String toString() {
        return getNome();
    }
}
