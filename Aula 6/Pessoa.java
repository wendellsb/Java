public abstract class Pessoa {
    private String nome;
    private String sexo;
    private Integer idade;


    public Pessoa()
    {
        this.setNome("");
        this.setSexo("");
        this.setIdade(0);
    }

    public Pessoa(String nome)
    {
        this.setNome(nome);
        this.setSexo("m");
        this.setIdade(0);
    }

    public abstract void saudacao();


    public void fazerAniversario()
    {
        System.out.println("Oi, aqui é o " + this.getNome() + " hoje é meu aniversario!");
    }

    //metodos acessores: getters/setters
    //nome
    public String getNome() {
        if(sexo.equalsIgnoreCase("f"))
            return "Sra. " + nome;
        else    
            return "Sr. " + nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //sexo
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //idade
    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    




}
