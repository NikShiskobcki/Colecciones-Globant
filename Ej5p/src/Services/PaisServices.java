package Services;
import Models.Pais;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisServices {
    public static HashSet<Pais> listaPaises = new HashSet<>();



    public static void crearPaises(){
        Scanner rd = new Scanner(System.in);
        char op = 's';

        while (op == 's'){
            System.out.println("Ingrese nombre del pais");
            String name = rd.nextLine();
            Pais p = new Pais(name.toLowerCase());
            listaPaises.add(p);
            System.out.println("desea ingresar otro pais?(s/n)");
            op = rd.next().charAt(0);
            rd.nextLine();
        }
        for (Pais p: listaPaises) {
            System.out.println(p.toString());
        }

    }

    public static HashSet<Pais> getListaPaises() {
        return listaPaises;
    }

    public static void buscarPais(){
        Scanner rd = new Scanner(System.in);
        System.out.println("Ingrese pais para eliminar");
        String str = rd.nextLine().toLowerCase();
        int flag=0;
        Iterator<Pais> it = listaPaises.iterator();

        while (it.hasNext()){
            if (it.next().getName().equals(str)){
                it.remove();
                System.out.println(str+" fue eliminado de la lista");
                flag = 1;
                break;
            }
        }
        if (flag == 0){
            System.out.println(str+ " no se encuentra en la lista");
        }else{
            for (Pais p:listaPaises) {
                System.out.println(p.toString());
            }
        }
    }
}
