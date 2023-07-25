//Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//la lista ordenada.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        List<String> razasList = new ArrayList();
        String input;
        char x = 's';
        System.out.println("Agregar una raza a la lista? (s/n)");
        do {
            x=rd.next().charAt(0);
            if (x!='n'){
                System.out.println("Ingrese la raza");
                input = rd.next();
                razasList.add(input.toLowerCase());
                System.out.println("Desea agregar otra raza?");
            }
        } while (x!='n');

        for (String elems: razasList) {
            System.out.println(elems);
        }

        System.out.println("Ingrese una raza a eliminar");
        input = rd.next();
        input = input.toLowerCase();

        if (razasList.contains(input)){
            razasList.remove(input);
            System.out.println(input+" fue eliminado de la lista");
        }else{
            System.out.println(input+" no se encuentra en la lista");
        }

        sort(razasList);

        System.out.println("Lista de razas ordenadas:");
        for (String elems: razasList) {
            System.out.println(elems);
        }
    }
}