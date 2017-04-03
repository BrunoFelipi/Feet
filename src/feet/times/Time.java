package feet.times;

import feet.estadios.Estadio;
import feet.titulos.Titulo;
import feet.tecnicos.Tecnico;
import feet.jogadores.Jogador;
import java.util.ArrayList;
import java.util.List;

public class Time {

    private int id;
    private String nome;
    private int forca;
    private String estado;
    private String pais;
    private Estadio estadio;
    private Tecnico tecnico;
    private List<Jogador> listaJogadores;
    private List<Titulo> listaTitulos;
    private int pontuacao;
    private double caixa;
    
    public Time(int id, String nome, String estado, String pais, Estadio estadio, Tecnico tecnico) {
        setId(id);
        setNome(nome);
        setForca(0);
        setEstado(estado);
        setPais(pais);
        setEstadio(estadio);
        setTecnico(tecnico);
        this.listaJogadores = new ArrayList<>();
        this.listaTitulos = new ArrayList<>();
        setPontuacao(0);
        setCaixa(0);
    }

    public List<Titulo> getListaTitulos() {
        return listaTitulos;
    }

    public void setListaTitulos(List<Titulo> listaTitulos) {
        this.listaTitulos = listaTitulos;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public double getCaixa() {
        return caixa;
    }

    public void setCaixa(double caixa) {        
        if(this.forca < 10){
            this.caixa = 1000000;    
        } else if(this.forca < 20){
            this.caixa = 2000000;    
        } else if(this.forca < 40){
            this.caixa = 4000000;    
        } else if(this.forca < 60){
            this.caixa = 6000000;    
        } else {
            this.caixa = 10000000;    
        }        
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

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public List<Jogador> getListaJogadores() {
        return listaJogadores;
    }

    public void setListaJogadores(List<Jogador> listaJogadores) {
        this.listaJogadores = listaJogadores;
    }

    public void addJogador(Jogador j){
        getListaJogadores().add(j);
    }
    
    public void removeJogador(Jogador j){
        getListaJogadores().remove(j);
    }
    
    @Override
    public String toString() {
        return getNome();
    }    
}
