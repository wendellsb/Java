/*
    Nome: Wendell Santos Barbosa
    Mat: 10881
    Questão - 1
*/
public class FuncionarioHorista extends Funcionario{
    private Double horasTrabalhadas;
    private Double valorHora;

    //construtor
    protected FuncionarioHorista() 
    {
    }
    protected FuncionarioHorista(String nome, String matricula) 
    {
        super(nome, matricula);
    }



    //getters/setters
    public Double getHorasTrabalhadas() 
    {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(Double horasTrabalhadas) 
    {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHora() 
    {
        return valorHora;
    }
    public void setValorHora(Double valorHora) 
    {
        this.valorHora = valorHora;
    }

    @Override
    public Double calculaSalario() {
        return (this.horasTrabalhadas * this.valorHora);
    }

}
