package carga;

import feet.BancoDeDados;
import feet.Tecnico;

/**
 *
 * @author bruno
 */
public class Tecnicos {

    private BancoDeDados bd;
    
    public Tecnicos(BancoDeDados bd){
        this.bd = bd;       
    }

    public BancoDeDados getBd() {
        return bd;
    }

    public void setBd(BancoDeDados bd) {
        this.bd = bd;
    }
    
    private void cargaTecnicos(){
        // Técnicos Brasileiros
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Oswaldo de Oliveira", "Brasil", 40, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Renato Gaúcho", "Brasil", 57, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Tite", "Brasil", 54, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Muricy Ramalho", "Brasil", 50, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Paulo Autuori", "Brasil", 43, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Joel Santana", "Brasil", 44, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Cuca", "Brasil", 50, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Abel Braga", "Brasil", 30, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Levir Culpi", "Brasil", 50, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Marcelo de Oliveira", "Brasil", 40, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Dorival Junior", "Brasil", 50, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Roger Machado", "Brasil", 55, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Celso Roth", "Brasil", 48, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Argel Fucks", "Brasil", 30, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Cristóvão Borges", "Brasil", 20, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Milton Mendes", "Brasil", 45, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Vagner Mancini", "Brasil", 50, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Eduardo Baptista", "Brasil", 52, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Jair Ventura", "Brasil", 50, null));
        
        // Técnicos Colombianos
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Juan Carlos Osorio", "Colômbia", 50, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Reynaldo Rueda", "Colômbia", 50, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Leonel Alvarez", "Colômbia", 50, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Jorge Luis Pinto", "Colômbia", 50, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Satiago Sachi Escobar", "Colômbia", 50, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Eduardo Lara", "Colômbia", 50, null));
        
        
        
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Diego Edison Umaña", "Colômbia", 50, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Hernan Dario Bolillo Gomez", "Colômbia", 50, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Luis Fernando Suarez", "Colômbia", 50, null));
        getBd().addTecnico(new Tecnico(getBd().getNextIdTecnico(), "Alexis Garcia", "Colômbia", 50, null));
        
        
        // Técnicos Chilenos
        
        // Técnicos Argentinos
        
    }
    
}
