// Andres Mejia
package lab3p1_andresmejia;
import java.util.Scanner;

public class Lab3P1_AndresMejia {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        int opcion;
        
        do{
            System.out.println("******** Menu ********");
            System.out.println("1 -> Ejercicio 1");
            System.out.println("2 -> Ejercicio 2");
            System.out.println("3 -> Ejercicio 3");
            System.out.println("4 -> Salir de sistema");
            System.out.println("Ingrese su opcion: ");
            opcion=read.nextInt();
            
            
            switch(opcion){
                case 1:{
                    String palabra;
                    
                    int contador, contador2;
                    contador=0;
                    contador2=0;
                    System.out.println("Ingrese una palabra: ");
                    palabra=read.next().toLowerCase();
                    for(int i=0; i<palabra.length();i++){
                        char letra=palabra.charAt(i);
                        if(letra =='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u'){
                            contador++;
                            if(i+1<palabra.length()){
                            char truco=palabra.charAt(i+1);
                            if(truco=='a' || truco=='e' ||truco=='i' || truco=='o' ||truco=='u'){
                                contador2=contador+1;
                            }
                            }
                        }
                    }
                    if(contador2==2){
                        System.out.println("La palabra es diptongo. ");
                    }
                    else{
                        System.out.println("La palabra no es diptongo. ");
                    }
                    
                    
                    
                    break;
                }
                case 2:{
                    double limite, sumatoria; 
                    sumatoria=0;
                    
                    System.out.println("Ingrese el limite de la sumatoria: ");
                    limite=read.nextInt();
                    
                    while(limite<=0){
                        System.out.println("Ingrese un valor mayor a 0: ");
                        limite=read.nextInt();
                    }
                    
                    for(int i=0; i<limite; i++){
                        sumatoria= (Math.pow(-1,i))/(2*i+1)+sumatoria;
                    }
                    sumatoria=4*sumatoria;
                    System.out.println("El resultado es: "+sumatoria);
                    
                    break;
                }
                case 3:{
                    int filas, haragan;
                    
                    System.out.println("Ingrese un numero IMPAR: ");
                    filas=read.nextInt();
                    
                    
                    while(filas%2==0){
                        System.out.println("Numero tiene que ser IMPAR: ");
                        filas=read.nextInt();
                        
                    }
                    for(int i=0; i<filas/2;i++){
                        for(int k=0; k<i;k++){
                            System.out.print(" ");
                        }
                        for(int j=0; j<filas;j++){
                            if(j>=i&&j<filas-i){
                                System.out.print("*");
                            }
                        }
                        System.out.println("");
                    }
                    int medio = ((filas+1)/2)-1;
                    for(int z=0; z<(filas/2)+1;z++){
                     for(int y=0;y<filas;y++){
                            if(y==medio|| (y<=medio+z&&y>=medio-z)){
                                System.out.print("*");
                            }else{
                                System.out.print(" ");
                            }
                        }
                        
                        System.out.println();
                    }
                    
                    break;
                }
            }
            
            
        } while(opcion!=4);
        
        
    }
    
}
