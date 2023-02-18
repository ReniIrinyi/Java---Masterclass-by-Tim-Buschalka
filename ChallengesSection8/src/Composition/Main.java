package Composition;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase=new ComputerCase("2208", "Dell", "240");
        Monitor monitor=new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
        Motherboard motherboard=new Motherboard("BJ-200", "Asus", 4, 6, "vs.44");
        PersonalComputer pc=new PersonalComputer("2208", "Dell", theCase, monitor, motherboard);
       /* pc.getMonitor().drowPixelArt(10,10,"red");
        pc.getMotherboard().loadProgram("Windows OS");
        pc.getComputerCase().pressPowerButton();*/
        pc.powerUp();
    }

}
