package Polymorphism;

public class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }
    public void watchComedy(){
        System.out.println("Watching Comedy");
    }
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s %n".repeat(3), "Pleasant Scene", "Funny Music", "Something happy happens");
    }
}
