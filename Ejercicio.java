import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;  

public class Ejercicio
{

    public static void main(String[] arg){
        //limpiar terminal
        System.out.print('\u000C');
        Scanner intr = new Scanner(System.in);
        int exe;
        
        do{
            System.out.println("\nIntroduce 1 para conocer el número mayor.\nIntroduce 2 para saber si un caracter esta en un texto.\nIntroduce 3 para generar una vocal aleatoria\nIntroduce 4 para saber la fecha actual.\nIntrodue 0 para cerrar el programa.");
            exe = intr.nextInt();
            switch(exe){
            case 1:
                int num1, num2;
                
                System.out.println("\nIntroduce dos números enteros");
                num1 = intr.nextInt();
                num2 = intr.nextInt();
                
                if(num1>num2){
                    System.out.println("El número "+ num1 + " es mayor que "+ num2);
                }
                else if(num2>num1){
                    System.out.println("El número "+ num2 + " es mayor que "+ num1);
                }
                else{
                    System.out.println("Los números "+ num1 + " y "+ num2 + " son iguales");
                }
                break;
        
            case 2:
                String texto;
                boolean f = false;
                String caracter;
                Scanner line = new Scanner(System.in);
                    
                    do{
                        System.out.println("\nIntroduce un texto");
                        texto = line.nextLine();
                        f = (texto.length()>1);
                        if(!f){
                            System.out.println("Debe escribir un texto más largo");
                        }
                    }while(f == false);
                    do{
                        System.out.println("Introduce un caracter");
                        caracter = line.nextLine();
                        if(caracter.length()>1){
                            f = false;
                            System.out.println("Debe escribir un solo caracter");
                        }
                    }while(f == false);
                    
                    if(texto.contains(caracter)){
                        System.out.println("El texto contiene el caracter "+ caracter);
                    }
                    else{
                        System.out.println("El texto no contiene el caracter "+ caracter);
                    }
                    
                break;
                
            case 3:
                char[] vocales = new char[] {'a','e','i','o','u'};
                Random eleccion = new Random();
                int index = eleccion.nextInt(5);
                System.out.println("Vocal "+ vocales[index]);
                break;

            case 4:
                LocalDateTime fecha = LocalDateTime.now();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
                String fecha_formateada = fecha.format(formato);  
                System.out.println(fecha_formateada);
                break;
                
            default:
                if(exe!=0) {
                System.out.println("Introduce un valor correcto");
                }
            }
        }
        while(exe != 0);
        System.out.println("El programa se ha cerrado");
        intr.close();
    }

}

