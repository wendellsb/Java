/*
    Nome: Wendell Santos Barbosa
    Mat: 10881
    Questão - 1
*/
public abstract class Funcionario extends Pessoa{
    private String matricula;
    private Funcionario gerente;

    //construtor
    protected Funcionario() 
    {
        
    }
    protected Funcionario(String nome, String matricula) 
    {
        super(nome);
        this.setMatricula(matricula);
    }

    public Double calculaSalario() 
    {
        return null;
    }

    //getters/setters
    public String getMatricula() 
    {
        return matricula;
    }
    public void setMatricula(String matricula) 
    {
        this.matricula = matricula;
    }

    public Funcionario getGerente() 
    {
        return gerente;
    }
    public void setGerente(Funcionario gerente) 
    {
        this.gerente = gerente;
    }
}
