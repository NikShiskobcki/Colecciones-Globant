package Services;
import Models.Producto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ProdService {
    public static HashMap<String, Double> productosHashMap = new HashMap();
    public static Scanner rd = new Scanner(System.in);
    
    public static void crearProducto(){
        Producto product = new Producto();
        System.out.println("Ingrese nombre del producto");
        String name = rd.nextLine().toLowerCase();
        System.out.println("Ingrese precio del producto");
        double price = rd.nextDouble();
        rd.nextLine();

        product.setName(name);
        product.setPrice(price);
        
        productosHashMap.put(name, price);
    }
    
    public static void printProductos(){
        for (Map.Entry<String,Double> entry: productosHashMap.entrySet()) {
            System.out.println("{ " + entry.getKey() + ", "+ entry.getValue() + " }");
        }
        System.out.println("");
    }

    public static void modifyPrice(){
        System.out.println("Ingrese nombre del producto que desea modificar");
        String name = rd.nextLine().toLowerCase();
        if (productosHashMap.containsKey(name)){
            System.out.println("Ingrese el nuevo precio");
            double newPrice = rd.nextDouble();
            rd.nextLine();
            productosHashMap.put(name, newPrice);
        }else{
            System.out.println("El producto no existe");
        }
    }

    public static void deleteProduct(){
        System.out.println("Ingrese el nombre del elemento que desea eliminar");
        String name = rd.nextLine().toLowerCase();
        if (productosHashMap.containsKey(name)){
            productosHashMap.remove(name);
            System.out.println("El producto fue eliminado");
        }else{
            System.out.println("El producto no existe");
        }
    }



    

}
