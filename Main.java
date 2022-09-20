import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String name;
        System.out.print("Introduzca su nombre: ");
        name = sc.nextLine();

        String age;
        System.out.print("Introduzca su edad: ");
        age = sc.nextLine();


        System.out.print("Hola " +name+" tienes "+age+" años " );


    }
}