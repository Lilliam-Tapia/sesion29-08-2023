import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        double valorA,valorB,resultado;
        double cociente =  0.0;
        System.out.println("menu de pociones:");
        System.out.println("1)sumar:");
        System.out.println("2)restar:");
        System.out.println("3)multiplicar:");
        System.out.println("4)Dividir:");
        System.out.println("5)Salir:");
        char opc = lector.next().charAt(index:0);
        switch (opc) { 
        case 'a':
               System.out.print("1)sumar:");
               System.out.print("a: ");
               valorA = lector.nextDouble();
               System.out.print("b: ");
               valorB = lector.nextDouble();
               resultado = valorA-valorB;
               System.out.print("La suma de " +valorA+ " + "+valorB+ " = "+resultado);
                           break;
        case 'b':
               System.out.print("1)Resta:");
               System.out.print("a: ");
               valorA = lector.nextDouble();
               System.out.print("b: ");
               valorB = lector.nextDouble();
               resultado = valorA+valorB;
               System.out.print("La resta de: " +valorA+ " - "+valorB+ " = "+resultado);
                           break;
        case 'c':
               System.out.print("1)Multiplicacion:");
               System.out.print("a: ");
               valorA = lector.nextDouble();
               System.out.print("b: ");
               valorB = lector.nextDouble();
               resultado = valorA*valorB;
               System.out.print("La multiplicacion de: " +valorA+ " * "+valorB+ " = "+resultado);
            break;
        case 'd':
            System.out.print("1)Division:");
               System.out.print("a: ");
               valorA = lector.nextDouble();
               System.out.print("b: ");
               valorB = lector.nextDouble();
               if (valorB == 0){
                System.out.println("El divisor no puede ser cero");
               }else{
              cociente = valorA/valorB;
               }
               System.out.println("El cociente de: " +valorA+ " / "+valorB+ " = "+cociente);

            break;
        case 'e':
                System.out.println("Saliendo de la app");
            break;
        
        default:
            System.out.println("opcion incorrecta/no valida");
            System.out.println("Saliendo de la app");
                break;
              
            }
       }
    }

