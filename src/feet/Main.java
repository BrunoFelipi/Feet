package feet;

import feet.bancodedados.BancoDeDados;
import feet.estadios.Estadio;
import feet.times.Time;
import feet.tecnicos.Tecnico;
import feet.jogadores.Jogador;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        
        BancoDeDados bd = new BancoDeDados();
        
        Tecnico t = new Tecnico(bd.getNextIdTecnico(), "Tite", "Brasileiro", 60, null);        
        Estadio e = new Estadio(bd.getNextIdEstadio(), "Maracanã", 20000, 20000, 10000, 20000, "Brasil");
        
        Time time = new Time(bd.getNextIdJogador(),"Metropolitano","Santa Catarina","Brasil",e,t);
        
        t.setTime(time);
        
        Jogador jogador = new Jogador(bd.getNextIdJogador(), "Tripodi", 30, 20, "Atacante", "Argentina", "Finalização", true, "titular", "Esquerdo", time, 30);
        
        time.addJogador(jogador);
        bd.addJogador(jogador);
        
        bd.addEstadio(e);
        bd.addTecnico(t);
        bd.addTime(time);
        
        new Inicio(bd).setVisible(true);
        
    }
    
}
