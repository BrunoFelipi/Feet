package feet.bancodedados;

import feet.estadios.Estadio;
import feet.times.Time;
import feet.tecnicos.Tecnico;
import feet.jogadores.Jogador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno
 */
public class BancoDeDados {

    private List<Time> listaTimes;
    private List<Jogador> listaJogadores;
    private List<Tecnico> listaTecnicos;
    private List<Estadio> listaEstadios;

    public BancoDeDados() {
        this.listaTimes = new ArrayList<>();
        this.listaJogadores = new ArrayList<>();
        this.listaTecnicos = new ArrayList<>();
        this.listaEstadios = new ArrayList<>();
    }

    public List<Time> getListaTimes() {
        return listaTimes;
    }

    public void setListaTimes(List<Time> listaTimes) {
        this.listaTimes = listaTimes;
    }

    public List<Jogador> getListaJogadores() {
        return listaJogadores;
    }

    public void setListaJogadores(List<Jogador> listaJogadores) {
        this.listaJogadores = listaJogadores;
    }

    public List<Tecnico> getListaTecnicos() {
        return listaTecnicos;
    }

    public void setListaTecnicos(List<Tecnico> listaTecnicos) {
        this.listaTecnicos = listaTecnicos;
    }

    public List<Estadio> getListaEstadios() {
        return listaEstadios;
    }

    public void setListaEstadios(List<Estadio> listaEstadios) {
        this.listaEstadios = listaEstadios;
    }
    
    public void addTime(Time time){
        this.getListaTimes().add(time);
    }
    
    public void removeTime(Time time){
        this.getListaTimes().remove(time);
    }
    
    public void addJogador(Jogador jogador){
        this.getListaJogadores().add(jogador);
    }
    
    public void removeJogador(Jogador jogador){
        this.getListaJogadores().remove(jogador);
    }
    
    public void addTecnico(Tecnico tecnico){
        this.getListaTecnicos().add(tecnico);
    }
    
    public void removeTecnico(Tecnico tecnico){
        this.getListaTecnicos().remove(tecnico);
    }
    
    public void addEstadio(Estadio estadio){
        this.getListaEstadios().add(estadio);
    }
    
    public void removeEstadio(Estadio estadio){
        this.getListaEstadios().remove(estadio);
    }
    
    public void addJogadorInTime(Jogador j, Time t){
        
        for(Time time : getListaTimes()){
            if(time.equals(t)){
                time.addJogador(j);
            }
        }
        
    }
    
    public void removeJogadorInTime(Jogador j, Time t){
        
        for(Time time : getListaTimes()){
            if(time.equals(t)){
                time.removeJogador(j);
            }
        }
        
    }
    
    public void addTecnicoInTime(Tecnico tec, Time t){
        
        for(Time time : getListaTimes()){
            if(time.equals(t)){
                time.setTecnico(tec);
            }
        }        
    }
    
    public void removeTecnicoInTime(Time t){
        
        for(Time time : getListaTimes()){
            if(time.equals(t)){
                time.setTecnico(null);
            }
        }        
    }
    
    public void removeAllJogadoresTime(Time t){
        
        for(Time time : getListaTimes()){            
            for(int i=0; i < time.getListaJogadores().size(); i++){                
                time.getListaJogadores().get(i).setTime(null); 
                time.getListaJogadores().remove(time.getListaJogadores().get(i));
            }
        }
    }
    
    public int getNextIdTime(){
        
        if(this.getListaTimes().isEmpty()){
            return 1;
        }
        return this.getListaTimes().get(this.getListaTimes().size() -1).getId() + 1;
    }
    
    public int getNextIdJogador(){
        
        if(this.getListaJogadores().isEmpty()){
            return 1;
        }
        return this.getListaJogadores().get(this.getListaJogadores().size() -1).getId() + 1;
    }
    
    public int getNextIdEstadio(){
        
        if(this.getListaEstadios().isEmpty()){
            return 1;
        }
        return this.getListaEstadios().get(this.getListaEstadios().size() -1).getId() + 1;
    }
    
    public int getNextIdTecnico(){
        
        if(this.getListaTecnicos().isEmpty()){
            return 1;
        }
        return this.getListaTecnicos().get(this.getListaTecnicos().size() -1).getId() + 1;
    }
}
