//Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
//tendremos una clase Pelicula con el título, director y duración de la película (en horas).
//Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
//que se pide a continuación:
//En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
//todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
//crear otra Pelicula o no.
//Después de ese bucle realizaremos las siguientes acciones:
//
//22
//
//• Mostrar en pantalla todas las películas.
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//pantalla.
//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

import Models.Pelicula;
import Services.PeliculaServ;


import java.util.ArrayList;
import java.util.Comparator;

public class Main {

        
    public static void main(String[] args) {
        PeliculaServ pServ = new PeliculaServ();

        System.out.println("Bienvenido!");
        pServ.CrearPelicula();
        ArrayList<Pelicula> filmList = pServ.getFilmList();

        System.out.println("Lista de todas las peliculas");
        for (Pelicula p: filmList) {
            System.out.println(p.toString());
        }

        System.out.println("---------------------------------------------");

        System.out.println("Lista de peliculas con una duracion mayor a 1 hora");
        ArrayList<Pelicula> aux= new ArrayList<>();
        for (Pelicula p: filmList) {
            if (p.getDuracion()>1){
                aux.add(p);
            }
        }
        for (Pelicula p: aux) {
            System.out.println(p.toString());
        }

        System.out.println("---------------------------------------------");

        System.out.println("Lista de peliculas ordenadas segun duracion");
        filmList.sort(Comparator.comparingDouble(Pelicula::getDuracion));
        for (Pelicula p: filmList) {
            System.out.println(p.toString());
        }

        System.out.println("---------------------------------------------");

        System.out.println("Lista de peliculas ordenadas segun titulo alfabeticamente");
        filmList.sort(Comparator.comparing(Pelicula::getTitulo));
        for (Pelicula p: filmList) {
            System.out.println(p.toString());
        }

        System.out.println("---------------------------------------------");

        System.out.println("Lista de peliculas ordenadas segun director alfabeticamente");
        filmList.sort(Comparator.comparing(Pelicula::getDirector));
        for (Pelicula p: filmList) {
            System.out.println(p.toString());
        }
    }
}