import java.util.Scanner;

public class verificarValor {
    public static void main(String[] args){
       Scanner inputValores = new Scanner(System.in); 
       System.out.println("Insira o primeiro valor: ");
       int valor1 = inputValores.nextInt();
       System.out.println("\nInsira o segundo valor: ");
       int valor2 = inputValores.nextInt();

       System.out.println("\n");

       //A estrutura de condição pode ser feito da seguinte maneira:
       System.out.println(valor1 > valor2 ? + valor1 + " é maior." : + valor2 + " é maior.");

       if(valor1 > valor2){
           System.out.println("\nO primeiro valor é maior: "+valor1+" > "+valor2 +".");
       }else{
        System.out.println("\nO segundo valor é maior: "+valor2+" > "+valor1 +".");
       }
    }
}