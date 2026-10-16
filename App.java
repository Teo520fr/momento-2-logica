import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       
int cantidadProductos;
String nombreProducto;
double costoBase;
int CategoriaAlta = 0;
double CostoAcomulado= 0;
double promedio;
        

        Scanner leer = new Scanner (System.in); 

        
 System.out.println("cuantos productos desea ingresar ");
 cantidadProductos = leer.nextInt();

 for (int i = 1; i <= cantidadProductos; i++) {
    System.out.println("Ingrese el nombre del producto: " + i + ":");
    nombreProducto = leer.next();

    System.out.println("Ingrese el costo base del producto: ");
     costoBase = leer.nextDouble();

     CostoAcomulado = CostoAcomulado + costoBase;

     if (costoBase < 10000) {
        System.out.println("categoria baja");
     } else if (costoBase >= 10000 && costoBase <= 50000){
        System.out.println("categoria media");
     } else {
        System.out.println("categoria alta ");
        CategoriaAlta++;
     } 

     
 }


    }
}