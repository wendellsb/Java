/*
    Nome: Wendell Santos Barbosa
    Mat: 10881
    Questão - 1
*/
//importando o array
import java.util.ArrayList;
public class FuncionarioTester{

    public static void main(String[] args) 
    {
        //Funcionarios vendedores
        FuncionarioVendedor fv1=new FuncionarioVendedor("Wendell Santos", "2828");
        fv1.setQuantidadeVendida(178.00);
        fv1.setTaxaComissao(40.00);
        FuncionarioVendedor fv2=new FuncionarioVendedor("Juliany Alvim", "2323");
        fv2.setQuantidadeVendida(166.00);
        fv2.setTaxaComissao(40.00);

        //****************************
        //****************************
        
        //Funcionarios horistas
        FuncionarioHorista fh1=new FuncionarioHorista("Marcelo Barbosa", "4545");
        fh1.setHorasTrabalhadas(335.00);
        fh1.setValorHora(30.00);
        FuncionarioHorista fh2=new FuncionarioHorista("Maria Aparecida", "4444");
        fh2.setHorasTrabalhadas(310.00);
        fh2.setValorHora(30.00);

        //criando lista
        ArrayList<Funcionario>listaFuncionarios=new ArrayList<Funcionario>();
        listaFuncionarios.add(fv1);
        listaFuncionarios.add(fv2);
        listaFuncionarios.add(fh1);
        listaFuncionarios.add(fh2);

        for(Funcionario funcionario : listaFuncionarios) 
        {
            System.out.println("Nome do funcionário(a): " + funcionario.getNome());
            System.out.println("Salario: " + funcionario.calculaSalario() + " reais");
            System.out.println("****************************");
        }
    }
}
