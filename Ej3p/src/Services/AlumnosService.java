package Services;

import Models.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnosService {
    private Scanner rd = new Scanner(System.in);
    public static ArrayList<Alumno> listaAlumnos = new ArrayList();


    public void crearAlumno() {
        char x='s';
        ArrayList<Integer> notasList;
        Alumno student;

        System.out.println("Desea agregar un alumno? (s/n)");

        while (x == 's') {
            x = rd.next().charAt(0);
            if (x == 'n') {
                break;
            }
            notasList = new ArrayList<>();
            student = new Alumno();
            int note;

            System.out.println("Ingrese el nombre del alumno");
            student.setNombre(rd.next().toLowerCase());
            System.out.println("Ingrese la primera nota");
            note = rd.nextInt();
            notasList.add(note);
            System.out.println("Ingrese la segunda nota");
            notasList.add(rd.nextInt());
            System.out.println("Ingrese la tercera nota");
            notasList.add(rd.nextInt());
            student.setNotas(notasList);
            listaAlumnos.add(student);

            System.out.println("Desea agregar otro alumno?");

        }

    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public double notaFinal(Alumno st) {
        Alumno student = listaAlumnos.get(listaAlumnos.indexOf(st));
        ArrayList<Integer> studentNotes = st.getNotas();
        double suma = 0;
        for (Integer x : studentNotes) {
            suma += (double) x;
        }

        double promedio = suma / 3;

        return promedio;
    }

}
