import java.util.Scanner;

public class String{

public static void main(String args[]){

        String[] nombre;
        Scanner teclado = new Scanner(System.in);
        String input = "";
        input = teclado.nextLine();
        nombre = input.split(" ");
        for(int i=0; i<nombre.length; i++)
	{
        System.out.println("Nombre "+ (i+1) + nombre[1]);

	String[] prof;
        String input2 = "";
        input2 = teclado.nextLine();
        prof = input2.split(" ");
        for(int j=0; j<prof.length; j++);
        {
        System.out.println("Profesion " + (j+1) + prof[1]);

        String[] pais;
        String input3 = "";
        input3 = teclado.nextLine();
        pais = input3.split(" ");
        for(int k=0; k<pais.lenght; k++)
        {
        System.out.println("Pais " + (k+1) + pais[1]);


        }
}
}
}
}
