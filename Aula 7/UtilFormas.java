import java.util.ArrayList;

public class UtilFormas {
    /*
    public static void imprimeArea(Circulo param)
    {
        System.out.println("Área do circulo = " + param.getArea());
    }

    public static void imprimeArea(Quadrado param)
    {
        System.out.println("Área do quadrado = " + param.getArea());
    }
    */
    public static void imprimeArea(Forma forma)
    {
        if (forma instanceof Retangulo)
            System.out.println("Retangulo = " + forma.getArea());
        else if (forma instanceof Circulo)
            System.out.println("Circulo = " + forma.getArea());
        else if (forma instanceof Quadrado)
            System.out.println("Quadrado = " + forma.getArea());
        else if (forma instanceof Triangulo)
            System.out.println("Triangulo = " + forma.getArea());
    }

    public static void imprimeFormas(ArrayList<Forma> list)
    {
        System.out.println("Lista de Figuras");
        System.out.println("*******************");
        for (Forma forma : list) {
            System.out.println("Área = " + forma.getArea());
        }
    }

}
