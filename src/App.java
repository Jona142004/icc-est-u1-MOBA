import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        MetodoOrdenamiento mO = new MetodoOrdenamiento();
        //int[] arreglo = {1,2,3,4,5};
        //int[] arreglo = {5,8,9,3,8};
        //mO.sortBumbbleAva(arreglo);
        //mO.printlnArreglo(arreglo);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el tamanio del arreglo");
        int tam = 0;
        do{
            System.out.print("Ingrese el tamanio del arreglo");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada invalida");
                System.out.println("Ingrese el tamanio del arreglo");
                
            }
            tam = scanner.nextInt();
            if (tam <= 0) {
                System.out.println("El tamanio debe ser entero postivo mayor que cero");
                
            }
        }while (tam <= 0);
        int [] arreglo = new int[tam];
        for (int i =0; i < tam; i++){
           int valor; 
            System.out.println("Ingrese el valor de la posicion " + i);
            valor = scanner.nextInt();
            arreglo[i] = valor;
        }
        
        System.out.println("Arreglo:");
        
        for (int i =0; i < tam; i++){
            System.out.print(arreglo[i]);
            if (i!= tam - 1){
                System.out.print(",");
            }
        }
        
            
        
        scanner.close();
        }
}
