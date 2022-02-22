public class HerancaTester {
    

    public static void main(String[] args) {
        //Pessoa pessoa = new Pessoa("Wendell");
        //Pessoa pessoa = new Pessoa();
        //pessoa.fazerAniversario();

        //aluno
        Aluno aluno = new Aluno("Wendell");
        //aluno.setNome("Aluno novo");
        aluno.fazerAniversario();


        //professor
        Professor professor = new Professor();
        professor.setSalario(100.0f);
        professor.setNome("Salgado");
        System.out.println("Salario do Professor " + professor.getNome() + " : "+ professor.getSalario());
        professor.receberAumento();
        System.out.println("Salario com aumento: " + professor.getSalario());

        aluno.saudacao();
        professor.saudacao();
    }
}
