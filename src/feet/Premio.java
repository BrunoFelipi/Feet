package feet;

public class Premio {

    private String descricao;
    private int ano;
    private Jogador jogador;
    private String imagemTrofeu;
    private int qtdForcaJogadorGanha;
    private int qtdPasseJogadorGanha;

    public Premio(String descricao, int ano, Jogador jogador, String imagemTrofeu, int qtdForcaJogadorGanha, int qtdPasseJogadorGanha) {
        this.descricao = descricao;
        this.ano = ano;
        this.jogador = jogador;
        this.imagemTrofeu = imagemTrofeu;
        this.qtdForcaJogadorGanha = qtdForcaJogadorGanha;
        this.qtdPasseJogadorGanha = qtdPasseJogadorGanha;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public String getImagemTrofeu() {
        return imagemTrofeu;
    }

    public void setImagemTrofeu(String imagemTrofeu) {
        this.imagemTrofeu = imagemTrofeu;
    }

    public int getQtdForcaJogadorGanha() {
        return qtdForcaJogadorGanha;
    }

    public void setQtdForcaJogadorGanha(int qtdForcaJogadorGanha) {
        this.qtdForcaJogadorGanha = qtdForcaJogadorGanha;
    }

    public int getQtdPasseJogadorGanha() {
        return qtdPasseJogadorGanha;
    }

    public void setQtdPasseJogadorGanha(int qtdPasseJogadorGanha) {
        this.qtdPasseJogadorGanha = qtdPasseJogadorGanha;
    }
    
    
    
}
