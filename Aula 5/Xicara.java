public class Xicara {
    
    private String cor;
    private Boolean cheia;

    //construtor
    public Xicara() {
        this.cor = "amarelo";
        this.cheia = false;
    }


    //getters/setters
    public String getCor() {
        return cor;
    }

    public Boolean getCheia()
    {
        return cheia;
    }

    //metodos -> enchendo e esvaziando a xicara
    public void encher()
    {
        this.cheia = true;
    }
    public void beberTudo()
    {
        this.cheia = false;
    }
    public void verificar()
    {
        System.out.println("Cor: " + this.getCor());
        System.out.println("Cheia:" + this.getCheia());
    }
}
