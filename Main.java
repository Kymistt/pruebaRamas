import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String name;
        System.out.print("Introduzca su nombre: ");
        name = sc.nextLine();

        int dia;
        System.out.print("Introduzca su dia de nacimiento: ");
        dia = sc.nextInt();


        System.out.print("Hola " +name+" naciste el dia "+dia );


    }
}