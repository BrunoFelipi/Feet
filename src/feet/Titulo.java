package feet;

public class Titulo {

    private String descricao;
    private int ano;
    private Time time;
    private String imagemTrofeu;
    private int qtdPontuacaoTimeGanha;
    private int qtdPontuacaoTecnicoGanha;
    private int qtdPasseTecnicoGanha;
    private int qtdForcaJogadoresGanham;
    private int qtdPasseJogadoresGanham;

    public Titulo(String descricao, int ano, Time time, String imagemTrofeu, int qtdPontuacaoTimeGanha, int qtdPontuacaoTecnicoGanha, int qtdPasseTecnicoGanha, int qtdForcaJogadoresGanham, int qtdPasseJogadoresGanham) {
        this.descricao = descricao;
        this.ano = ano;
        this.time = time;
        this.imagemTrofeu = imagemTrofeu;
        this.qtdPontuacaoTimeGanha = qtdPontuacaoTimeGanha;
        this.qtdPontuacaoTecnicoGanha = qtdPontuacaoTecnicoGanha;
        this.qtdPasseTecnicoGanha = qtdPasseTecnicoGanha;
        this.qtdForcaJogadoresGanham = qtdForcaJogadoresGanham;
        this.qtdPasseJogadoresGanham = qtdPasseJogadoresGanham;
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

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getImagemTrofeu() {
        return imagemTrofeu;
    }

    public void setImagemTrofeu(String imagemTrofeu) {
        this.imagemTrofeu = imagemTrofeu;
    }

    public int getQtdPontuacaoTimeGanha() {
        return qtdPontuacaoTimeGanha;
    }

    public void setQtdPontuacaoTimeGanha(int qtdPontuacaoTimeGanha) {
        this.qtdPontuacaoTimeGanha = qtdPontuacaoTimeGanha;
    }

    public int getQtdPontuacaoTecnicoGanha() {
        return qtdPontuacaoTecnicoGanha;
    }

    public void setQtdPontuacaoTecnicoGanha(int qtdPontuacaoTecnicoGanha) {
        this.qtdPontuacaoTecnicoGanha = qtdPontuacaoTecnicoGanha;
    }

    public int getQtdPasseTecnicoGanha() {
        return qtdPasseTecnicoGanha;
    }

    public void setQtdPasseTecnicoGanha(int qtdPasseTecnicoGanha) {
        this.qtdPasseTecnicoGanha = qtdPasseTecnicoGanha;
    }

    public int getQtdForcaJogadoresGanham() {
        return qtdForcaJogadoresGanham;
    }

    public void setQtdForcaJogadoresGanham(int qtdForcaJogadoresGanham) {
        this.qtdForcaJogadoresGanham = qtdForcaJogadoresGanham;
    }

    public int getQtdPasseJogadoresGanham() {
        return qtdPasseJogadoresGanham;
    }

    public void setQtdPasseJogadoresGanham(int qtdPasseJogadoresGanham) {
        this.qtdPasseJogadoresGanham = qtdPasseJogadoresGanham;
    }
    
    
    
}
