package Services;
import Models.Pelicula;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaServ {
    private Scanner rd = new Scanner(System.in);

    public ArrayList<Pelicula> filmList = new ArrayList<>();

    public void CrearPelicula(){
        char x= 's';

        while (x=='s'){
            Pelicula p = new Pelicula();
            System.out.println("Ingrese el titulo de la película");
            String titulo = rd.nextLine();
            p.setTitulo(titulo);
            System.out.println("Ingrese el director");
            String director = rd.nextLine();
            p.setDirector(director);
            System.out.println("Ingrese la duracion en horas");
            double duracion = rd.nextDouble();

            p.setDuracion(duracion);
            filmList.add(p);
            System.out.println("Desea agregar otra pelicula?(s/n)");
            x=rd.next().charAt(0);
            //Para que no se buguee la linea
            rd.nextLine();
        }
    }

    public ArrayList<Pelicula> getFilmList() {
        return filmList;
    }


}
