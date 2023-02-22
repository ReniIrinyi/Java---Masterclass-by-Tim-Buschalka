package Polymorphism;

public class Adventure extends Movie{
    public Adventure(String title) {
        super(title);
    }
    public void watchAdventure(){
        System.out.println("Watching Adventure");
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s %n".repeat(3), "Pleasant Scene", "Scary Music", "Something bad happens");
    }
}
