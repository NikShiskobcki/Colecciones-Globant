//Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//productos que venderemos y el precio que tendrán. Además, se necesita que la
//aplicación cuente con las funciones básicas.
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.

import Models.Producto;
import Services.ProdService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int op = 1;

        System.out.println("Bienvenido!Ingrese una opcion");
        while (op != 0){
            System.out.println("1- Ingresar un producto");
            System.out.println("2- Imprimir lista de productos");
            System.out.println("3-Modificar el precio de un producto");
            System.out.println("4-Eliminar un producto");
            System.out.println("0- Salir");

            op = rd.nextInt();

            switch (op){
                case 1:
                    ProdService.crearProducto();
                    break;
                case 2:
                    ProdService.printProductos();
                    break;
                case 3:
                    ProdService.modifyPrice();
                    break;
                case 4:
                    ProdService.deleteProduct();
                    break;
                default:
                    break;
            }
        }
    }
}