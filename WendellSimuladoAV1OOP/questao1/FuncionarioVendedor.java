/*
    Nome: Wendell Santos Barbosa
    Mat: 10881
    Questão - 1
*/
public class FuncionarioVendedor extends Funcionario{
    private Double quantidadeVendida;
    private Double taxaComissao;

    //construtor
    protected FuncionarioVendedor(String nome, String matricula) 
    {
        super(nome, matricula);
    }

    //getters/setters
    public Double getQuantidadeVendida() 
    {
        return quantidadeVendida;
    }
    public void setQuantidadeVendida(Double quantidadeVendida) 
    {
        this.quantidadeVendida = quantidadeVendida;
    }

    public Double getTaxaComissao() 
    {
        return taxaComissao;
    }
    public void setTaxaComissao(Double taxaComissao) {

        this.taxaComissao = taxaComissao;
    }

    
    @Override
    public Double calculaSalario() {
        return (this.quantidadeVendida * this.taxaComissao);
    }

}
