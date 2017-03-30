package feet;

public class Estadio {

    private int id;
    private String nome;
    private int capacidadeTotal;
    private int capacidadeGeral;
    private int capacidadeCadeiras;
    private int capacidadeArquibancada;
    private int capacidadeCamarote;
    private double valorIngressoGeral;
    private double valorIngressoCadeiras;
    private double valorIngressoArquibancada;
    private double valorIngressoCamarote;
    private String pais;
    
    public Estadio(int id, String nome, int capacidadeGeral, int capacidadeCadeiras, int capacidadeArquibancada, 
            int capacidadeCamatore, String pais) {
        this.id = id;
        this.nome = nome;
        this.capacidadeGeral = capacidadeGeral;
        this.capacidadeCadeiras = capacidadeCadeiras;
        this.capacidadeArquibancada = capacidadeArquibancada;
        this.capacidadeCamarote = capacidadeCamatore;
        this.pais = pais;
        setCapacidadeTotal();
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

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public void setCapacidadeTotal() {
        System.out.println("Arquibancada: " + getCapacidadeArquibancada() + "\nCadeiras: " + getCapacidadeCadeiras() +
                "\nCamarote: " + getCapacidadeCamarote() + "\nGeral: " + getCapacidadeGeral());
        this.capacidadeTotal = getCapacidadeArquibancada() + getCapacidadeCadeiras() + getCapacidadeCamarote() 
                + getCapacidadeGeral();
    }

    public int getCapacidadeGeral() {
        return capacidadeGeral;
    }

    public void setCapacidadeGeral(int capacidadeGeral) {
        this.capacidadeGeral = capacidadeGeral;
    }

    public int getCapacidadeCadeiras() {
        return capacidadeCadeiras;
    }

    public void setCapacidadeCadeiras(int capacidadeCadeiras) {
        this.capacidadeCadeiras = capacidadeCadeiras;
    }

    public int getCapacidadeArquibancada() {
        return capacidadeArquibancada;
    }

    public void setCapacidadeArquibancada(int capacidadeArquibancada) {
        this.capacidadeArquibancada = capacidadeArquibancada;
    }

    public int getCapacidadeCamarote() {
        return capacidadeCamarote;
    }

    public void setCapacidadeCamarote(int capacidadeCamarote) {
        this.capacidadeCamarote = capacidadeCamarote;
    }

    public double getValorIngressoGeral() {
        return valorIngressoGeral;
    }

    public void setValorIngressoGeral(double valorIngressoGeral) {
        this.valorIngressoGeral = valorIngressoGeral;
    }

    public double getValorIngressoCadeiras() {
        return valorIngressoCadeiras;
    }

    public void setValorIngressoCadeiras(double valorIngressoCadeiras) {
        this.valorIngressoCadeiras = valorIngressoCadeiras;
    }

    public double getValorIngressoArquibancada() {
        return valorIngressoArquibancada;
    }

    public void setValorIngressoArquibancada(double valorIngressoArquibancada) {
        this.valorIngressoArquibancada = valorIngressoArquibancada;
    }

    public double getValorIngressoCamarote() {
        return valorIngressoCamarote;
    }

    public void setValorIngressoCamarote(double valorIngressoCamarote) {
        this.valorIngressoCamarote = valorIngressoCamarote;
    }
    
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    @Override
    public String toString() {
        return getNome();
    }

}
