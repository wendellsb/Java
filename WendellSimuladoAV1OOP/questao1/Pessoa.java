/*
    Nome: Wendell Santos Barbosa
    Mat: 10881
    Questão - 1
*/
public abstract class Pessoa{
    private String nome;

    //construtor
    protected Pessoa() 
    {
        
    }
    protected Pessoa(String nome)
    {
        this.setNome(nome);
    }

    //getters/setters
    public String getNome() 
    {
        return nome;
    }
    public void setNome(String nome) 
    {
        this.nome = nome;
    }
}
