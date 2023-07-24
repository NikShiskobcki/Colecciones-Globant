//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//salir, se mostrará todos los perros guardados en el ArrayList.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
                razasList.add(input);
                System.out.println("Desea agregar otra raza?");
            }
        } while (x!='n');

        for (String elems: razasList) {
            System.out.println(elems);
        }
    }
}