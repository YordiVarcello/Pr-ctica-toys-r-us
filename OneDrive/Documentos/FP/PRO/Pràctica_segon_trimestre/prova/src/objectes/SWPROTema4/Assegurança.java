package objectes.SWPROTema4;

public class Assegurança {
    String marca;
    String model;
    String matricula;
    int numPolissa;
    String dataInicial;
    String dataFinal;
    Conductor conductor;

    public Assegurança(String marca, String model, String matricula, int numPolissa, String dataInicial, String dataFinal, Conductor conductor) {
        this.marca = marca;
        this.model = model;
        this.matricula = matricula;
        this.numPolissa = numPolissa;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.conductor = conductor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumPolissa() {
        return numPolissa;
    }

    public void setNumPolissa(int numPolissa) {
        this.numPolissa = numPolissa;
    }

    public String getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
}
