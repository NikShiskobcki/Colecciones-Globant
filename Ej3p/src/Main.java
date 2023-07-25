//Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
//alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
//con sus 3 notas.
//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.


import java.util.ArrayList;
import java.util.Scanner;
import Models.Alumno;
import Services.AlumnosService;
import Services.AlumnosService.*;
public class Main {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        AlumnosService service = new AlumnosService();


        service.crearAlumno();

        ArrayList<Alumno> alumnosLista = service.getListaAlumnos();

        for (Alumno st: alumnosLista) {
            System.out.println(st.toString());
        }

        System.out.println("Ingrese el nombre del alumno para buscar el promedio");
        String student = rd.nextLine().toLowerCase();

        for (Alumno st: alumnosLista) {
            if (st.getNombre().equals(student)){
                double avg = service.notaFinal(st);
                System.out.println("El promedio del alumno "+ student+ " es de "+avg);
                break;
            }else{
                System.out.println("El alumno no se encuentra en la lista de alumnos");
            }
        }

        System.out.println("Lista de alumnos:");
        for (Alumno st: alumnosLista) {
            System.out.println(st.toString());
        }

    }
}