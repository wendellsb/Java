/*
    Nome: Wendell Santos Barbosa
    Mat: 10881
    Questão - 1
*/
public class Carro extends Veiculo{
    private String nome;
    
    public Carro()
    {

    }
    public Carro(String nome){
        this.nome = "Camaro";
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    String ligar() {
        return "Carro ligado a 30KM/H";
    }

}