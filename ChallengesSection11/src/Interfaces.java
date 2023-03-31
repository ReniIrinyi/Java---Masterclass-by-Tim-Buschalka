import java.util.ArrayList;
import java.util.List;

public class Interfaces {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animals animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;
        animal.move();
        //nem müködik, mert interface => nincs methodja
//        flier.move();
//        tracked.move();

        flier.takeOff();
        flier.fly();
        flier.land();

        inFlight(flier);
        inFlight(new Jet());

        Truck track = new Truck();
        track.track();

        double kmTravelled=100;
        double milesTravelled=kmTravelled*FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck taveled %.2f km or %.2f miles %n",kmTravelled, milesTravelled);
        ArrayList<FlightEnabled> fliers=new ArrayList<>();
        fliers.add(bird);
        List<FlightEnabled>betterFliers=new ArrayList<>();
        betterFliers.add(bird);

        triggerFLiers(fliers);
        flyFliers(fliers);
        landFLiers(fliers);


        triggerFLiers(betterFliers);
        flyFliers(betterFliers);
        landFLiers(betterFliers);





    }

    private static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.land();
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
    }

    private static void triggerFLiers(List<FlightEnabled> fliers){
        for(var flier:fliers){
            flier.takeOff();
        }
    }

    private static void flyFliers(List<FlightEnabled> fliers){
        for(var flier:fliers){
            flier.fly();
        }
    }
    private static void landFLiers(List<FlightEnabled> fliers){
        for(var flier:fliers){
            flier.land();
        }
    }
}

     abstract class Animals{
        public abstract void move();
    }

    enum FlightStages implements Trackable{
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

        @Override
        public void track() {
            if(this!=GROUNDED){
                System.out.println("Monitoring "+this);
            }
        }

        public FlightStages getNextStages(){
            FlightStages[]allStages=values();
            return allStages[(ordinal()+1)%allStages.length];
        }
    }

record DragonFly(String name, String type) implements FlightEnabled{

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
    class Satellite implements OrbitEarth{

    FlightStages stage=FlightStages.GROUNDED;
    public void achieveOrbit(){
        transition("orbit");
    }


        @Override
        public void takeOff() {
            transition("taking off ");
        }

        @Override
        public void land() {
            transition("landing ");
        }

        @Override
        public void fly() {
            achieveOrbit();
            transition("data collection while Orbiting ");
        }

        public void transition(String desc){
            System.out.println(desc);
            stage=transition(stage);
            stage.track();
        }
    }

    interface OrbitEarth extends FlightEnabled{
    void achieveOrbit();
    private static void log(String desc){
        var today=new java.util.Date();
        System.out.println(today+":"+desc);

    }

    private void logStages(FlightStages stage, String desc){
        desc=stage+":"+desc;
        log(desc);
    }

        @Override
        default FlightStages transition(FlightStages stage) {
            FlightStages nextStage=FlightEnabled.super.transition(stage);
            logStages(stage,"Beginning Transition to"+nextStage);
            return nextStage;
        }
    }

    interface FlightEnabled{
          double MILES_TO_KM=1.60934;
          double KM_TO_MILES=0.621371;

          void takeOff();
          void land();
          void fly();
          default FlightStages transition(FlightStages stage){
//              System.out.println("transition not implemented on " +stage.getClass().getName());
//              return null;
              FlightStages nextStage=stage.getNextStages();
              System.out.println(stage + " to "+ nextStage);
              return nextStage;
          }
    }

    interface Trackable{
        void track();

    }

    class Bird extends Animals implements FlightEnabled, Trackable{

        @Override
        public void move() {
            System.out.println("moved");
        }

        @Override
        public void takeOff() {
            System.out.println(getClass().getSimpleName() + " taking off");
        }

        @Override
        public void land() {
            System.out.println(getClass().getSimpleName() + " is landing");
        }

        @Override
        public void fly() {
            System.out.println(getClass().getSimpleName() + " is flying");
        }

        @Override
        public void track() {
            System.out.println(getClass().getSimpleName() + " coordinates recroded");
        }
    }
    class Jet implements FlightEnabled, Trackable{
        @Override
        public void takeOff() {
            System.out.println(getClass().getSimpleName() + " taking off");
        }

        @Override
        public void land() {
            System.out.println(getClass().getSimpleName() + " is landing");
        }

        @Override
        public void fly() {
            System.out.println(getClass().getSimpleName() + " is flying");
        }

        @Override
        public void track() {
            System.out.println(getClass().getSimpleName() + " coordinates recroded");
        }

        @Override
        public FlightStages transition(FlightStages stage) {
            System.out.println(getClass().getSimpleName() + " transitioning");
            return FlightEnabled.super.transition(stage);
        }
    }

    class Truck implements Trackable{
        @Override
        public void track() {
            System.out.println(getClass().getSimpleName() + " coordinates recroded");
        }

    }

    class Test {
        private static void inFlight(FlightEnabled flier){
            flier.takeOff();
            flier.transition(FlightStages.LAUNCH);
            flier.land();
            if(flier instanceof Trackable tracked){
                tracked.track();
            }
        }
        private static void orbit(OrbitEarth flier){
            flier.takeOff();
            flier.land();
            flier.fly();
        }

        public static void main(String[] args) {
            inFlight(new Jet());
          //  OrbitEarth.log("testing "+new Satellite());
            orbit(new Satellite());
        }


    }

