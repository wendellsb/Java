/*
    Nome: Wendell Santos Barbosa
    Mat: 10881
    Questão - 1
*/
public class Veiculo{
    private String cor;
    private Integer marcha;
    
    public Veiculo()
    {

    }
    public Veiculo(String cor, Integer marcha){
        this.cor = "preto";
        this.marcha = 5;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getMarcha() {
        return marcha;
    }
    public void setMarcha(Integer marcha) {
        this.marcha = marcha;
    }

    String ligar() {
        return "Veiculo ligado";
    }
    String desligar() {
        return "veiculo desligado";
    }

}
