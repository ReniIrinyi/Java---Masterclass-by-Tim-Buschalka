package Polymorphism;

public class NextMain {
    public static void main(String[] args) {
        Movie movieInput=Movie.getMovie("A", "Jaws");
        movieInput.watchMovie();

        //Casting
        Adventure jaws=(Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy=Movie.getMovie("C", "Airplane");
        Movie comedyMovie= (Comedy) comedy;
        comedyMovie.watchMovie();

       var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane=new Comedy("Airplane 2");
        plane.watchComedy();

    }
}
