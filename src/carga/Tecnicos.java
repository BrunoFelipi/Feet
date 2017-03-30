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
        getBd().addTecnico(new Tecnico("Oswaldo de Oliveira", "Brasil", 40, null));
        getBd().addTecnico(new Tecnico("Renato Gaúcho", "Brasil", 57, null));
        getBd().addTecnico(new Tecnico("Tite", "Brasil", 54, null));
        getBd().addTecnico(new Tecnico("Muricy Ramalho", "Brasil", 50, null));
        getBd().addTecnico(new Tecnico("Paulo Autuori", "Brasil", 43, null));
        getBd().addTecnico(new Tecnico("Joel Santana", "Brasil", 44, null));
        getBd().addTecnico(new Tecnico("Cuca", "Brasil", 50, null));
        getBd().addTecnico(new Tecnico("Abel Braga", "Brasil", 30, null));
        getBd().addTecnico(new Tecnico("Levir Culpi", "Brasil", 50, null));
        getBd().addTecnico(new Tecnico("Marcelo de Oliveira", "Brasil", 40, null));
        getBd().addTecnico(new Tecnico("Dorival Junior", "Brasil", 50, null));
        getBd().addTecnico(new Tecnico("Roger Machado", "Brasil", 55, null));
        getBd().addTecnico(new Tecnico("Celso Roth", "Brasil", 48, null));
        getBd().addTecnico(new Tecnico("Argel Fucks", "Brasil", 30, null));
        getBd().addTecnico(new Tecnico("Cristóvão Borges", "Brasil", 20, null));
        getBd().addTecnico(new Tecnico("Milton Mendes", "Brasil", 45, null));
        getBd().addTecnico(new Tecnico("Vagner Mancini", "Brasil", 50, null));
        getBd().addTecnico(new Tecnico("Eduardo Baptista", "Brasil", 52, null));
        getBd().addTecnico(new Tecnico("Jair Ventura", "Brasil", 50, null));
        
        // Técnicos Colombianos
        getBd().addTecnico(new Tecnico("Juan Carlos Osorio", "Colômbia", 50, null));
        getBd().addTecnico(new Tecnico("Reynaldo Rueda", "Colômbia", 50, null));
        getBd().addTecnico(new Tecnico("Leonel Alvarez", "Colômbia", 50, null));
        getBd().addTecnico(new Tecnico("Jorge Luis Pinto", "Colômbia", 50, null));
        getBd().addTecnico(new Tecnico("Satiago Sachi Escobar", "Colômbia", 50, null));
        getBd().addTecnico(new Tecnico("Eduardo Lara", "Colômbia", 50, null));
        getBd().addTecnico(new Tecnico("Diego Edison Umaña", "Colômbia", 50, null));
        getBd().addTecnico(new Tecnico("Hernan Dario Bolillo Gomez", "Colômbia", 50, null));
        getBd().addTecnico(new Tecnico("Luis Fernando Suarez", "Colômbia", 50, null));
        getBd().addTecnico(new Tecnico("Alexis Garcia", "Colômbia", 50, null));
        
        
        // Técnicos Chilenos
        
        // Técnicos Argentinos
        
    }
    
}
