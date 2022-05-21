package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
       
       // int opcion, numero1, numero2;
        int suma = 0,resta = 0, multiplicacion=1,division=1, potencia = 0, raizCuadradaA = 0,raizCuadradaB = 0;
                
        //Funciones padre = new Funciones ();
        //FuncionesEspecificas hija = new FuncionesEspecificas ();
        
        Scanner entrada = new Scanner(System.in);
       
        int calculadora[] = new int [2]; 
        
        for (int i=0; i<calculadora.length; i++) {
            System.out.print("("+(i+1)+") Ingresa un número: ");
            calculadora[i] = entrada.nextInt();
        }
        
        for (int i=0; i<calculadora.length;i++) {
            suma=suma+calculadora[i];
            resta=calculadora[0]-calculadora[1];
            multiplicacion=multiplicacion*calculadora[i];
            division=calculadora[0]/calculadora[1];
            potencia= (int) Math.pow(calculadora[0],calculadora[1]);
            raizCuadradaA= (int) Math.sqrt(calculadora[0]);
            raizCuadradaB= (int) Math.sqrt(calculadora[1]);
        }
        
        System.out.print("La Suma es: "+ suma+"\n");
        System.out.print("La Resta es: "+ resta+"\n");
        System.out.print("La Multiplicación es: "+multiplicacion+"\n");
        System.out.print("La División es: "+ division+"\n");
        System.out.print("La Potencia es: "+potencia+"\n");
        System.out.print("La Raiz Cuadrada de tu primer número es: "+raizCuadradaA+"\n");
        System.out.print("La Raiz Cuadrada de tu segundo número es: "+raizCuadradaB+"\n");
        
      /*  System.out.println("----------------------------------------------------");
        System.out.println("    Bienvenido a mi Calculadora   ");
        System.out.println("    1. Suma");
        System.out.println("    2. Resta");
        System.out.println("    3. Multiplicación ");
        System.out.println("    4. División ");
        System.out.println("    5. Potencia ");
        System.out.println("    6. Raíz Cuadrada");
        System.out.println("----------------------------------------------------");
        System.out.print("Ingresa el número de la opción que quieres: "); opcion = entrada.nextInt();
        
               switch(opcion){
               
               case 1 -> {
                   System.out.print("Ingresa un número: "); numero1 = (int) entrada.nextFloat();
                   System.out.print("Ingresa un número: "); numero2 = (int) entrada.nextFloat();
                   System.out.println("La suma es: "+ hija.suma(numero1, numero2));
            }   
               
               case 2 -> {
                   System.out.print("\nIngresa un número: "); numero1 = (int) entrada.nextFloat();
                   System.out.print("\nIngresa un número: "); numero2 = (int) entrada.nextFloat();
                   System.out.println("La resta es: "+ hija.resta(numero1, numero2));
            }   
               
               case 3 -> {
                   System.out.print("\nIngresa un número: "); numero1 = (int) entrada.nextFloat();
                   System.out.print("\nIngresa un número: "); numero2 = (int) entrada.nextFloat();
                   System.out.println("La multiplicación es: "+ hija.multiplicacion(numero1, numero2));
            }  
               
               case 4 -> {
                   System.out.print("\nIngresa un número: "); numero1 = (int) entrada.nextFloat();
                   System.out.print("\nIngresa un número: "); numero2 = (int) entrada.nextFloat();
                   System.out.println("La división es: "+ hija.division(numero1, numero2));
            }  
               
               case 5 -> {
                   System.out.print("\nIngresa número de base: "); numero1 = entrada.nextInt();
                   System.out.print("\nIngresa número de exponente: "); numero2 = entrada.nextInt();
                   System.out.println("La Potencia es: "+ hija.potencia(numero1, numero2));
            }  
               
               case 6 -> {
                   System.out.print("\nIngresa un número: "); numero1 = (int) entrada.nextFloat();
                   System.out.println("La Raíz Cuadrada es: "+ hija.raizCuadrada(numero1));
            }  
               
               default -> System.out.println("No ingresaste una opción válida");
               
           } */
        
    }
    
}
