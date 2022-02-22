public class Bike {
    //atributos da classe
    //private String marca;
    private Integer qtdMarchas;
    private String cor;

    //estado
    private Integer marchaAtual = 1;
    private Boolean andando = false;

    //construtor
    public Bike(){
        //this.marca = "caloi";
        this.qtdMarchas = 5;
        this.setCor("vermelha");
    }

    public Boolean getAndando() {
        return andando;
    }

    public void setAndando(Boolean andando) {
        this.andando = andando;
    }

    public Bike(String cor){
        //this.marca = "caloi";
        this.qtdMarchas = 5;
        this.setCor(cor);
    }


    //caracteristica ou metodos
    public void andar()
    {
        System.out.println("Estou andando com " + this.marchaAtual + " marchas");
        this.setAndando(true);
    }

    public void frear()
    {
        System.out.println("Freiando...3, 2, 1!");
        this.setAndando(false);
    }

    public void aumentarMarcha()
    {
        if(this.marchaAtual == this.qtdMarchas)
        {
            System.out.println("Já estou na marcha maxima");
        }
        else
            this.marchaAtual++;
    }

    public void diminuirMarcha()
    {
        if(this.marchaAtual == 1)
        {
            System.out.println("Já estou na marcha minima");
        }
        else
            this.marchaAtual--;
    }

    public String getCor() {
        return "bike da cor: " + cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
   
}