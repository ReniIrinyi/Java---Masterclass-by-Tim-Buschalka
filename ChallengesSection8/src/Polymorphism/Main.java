package Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie movie=new Movie("Start Wars");
        movie.watchMovie();

        Movie adventureMovie1=new Adventure("Adventure movie");
        Adventure adventureMovie2=new Adventure("Adventure movie");
        adventureMovie1.watchMovie();
        adventureMovie2.watchMovie();

        Movie comedy=new Comedy("Comedy movie");
        Comedy comedy2=new Comedy("Comedy movie");
        comedy.watchMovie();
        comedy2.watchMovie();

        Movie themovie=Movie.getMovie("Adventure", "Star Wars");
        themovie.watchMovie();

        Scanner s=new Scanner(System.in);

        while(true){
            System.out.println("Enter Type (A for Adventure, C for Comedy or Q to quit: " );
            String type=s.nextLine();
            if("Qq".contains(type)){
                break;
            }

            System.out.println("Enter movie title: ");
            String title=s.nextLine();



        }

    }
}
