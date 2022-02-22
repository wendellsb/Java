import java.util.Scanner;
public class LerNome {

    public static void main(String[] args){

        String nome= "";
        int idade= 0;
        Scanner teclado = new Scanner(System.in);

        // solicita o nome pelo teclado
        System.out.println("Entre com o nome:");

        //ler o nome
        nome = teclado.next();

        //ler idade
        System.out.println("Qual a sua idade?");
        //idade = Integer.parseInt(teclado.next());
        idade = teclado.nextInt();


        //Imprime saudação
        System.out.println("Olá " + nome + ", boa noite!");
        System.out.println("Voce tem " + idade + " anos de idade!");

        //testa idade
        if(idade < 18) {
            System.out.println("Voce não pode emtrar!");
        }
        else {
            System.out.println("Entrada permitida!");
        }

        for(int i=0; i<10; i++)
        {
            System.out.println(i);
        }

        teclado.close();
    }

}