import java.util.ArrayList;
import java.util.List;

public class InterfaceChallenge {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Businesspark", UsageType.BUSINESS));
        mappables.add(new Building("Sportarena", UsageType.SPORTS));
        mappables.add(new Building("Stadium Australia", UsageType.ENTERTAINMENT));
        mappables.add(new UtilityLine("Olympic Blvd", UtilityType.WATER));
        for(var m:mappables){
            Mappable.takeMappableInstance(m);
        }

        System.out.println(mappables);

    }
}
    enum Geometry{
        LINE, POINT,POLYGON
    }

    enum Color{
        BLACK,BLUE,GREEN,RED, ORANGE
    }

    enum PointMarkers{
        CIRCLE,PUSH_PIN,STAR,SQUARE,TRIANGLE
    }

    enum LineMarkers{
        DASHED, DOTTED,SOLID
    }

    interface Mappable{

        String JSON_PROPERTY="'properties': {%s}";

       default String toJSON(){
           return """
                   "type: "%s", "label": "%s", "marker": "%s"
                   """.formatted(getShape(), getLabel(), getMarker());

        }

        static void takeMappableInstance(Mappable mappable){
            System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
        }
         String getLabel();
         String getMarker();
         Geometry getShape();


    }
    enum UsageType {
        BUSINESS,ENTERTAINMENT,GOVERNMENT,SPORTS
    }
    class Building implements Mappable{
        private String name;
        private UsageType usage;

        public Building(String name, UsageType usage) {
            this.name = name;
            this.usage = usage;
        }

        @Override
        public String getLabel() {
          return name + "("+usage+")";
        }

        @Override
        public String toJSON() {
            return Mappable.super.toJSON()  + """
                    , 'name': '%s', 'usage':'%s'""".formatted(name,usage);
        }

        @Override
        public String getMarker() {
           return switch (usage){
               case SPORTS -> Color.ORANGE+" "+PointMarkers.STAR;
               case BUSINESS -> Color.BLUE + " "+PointMarkers.SQUARE;
               case GOVERNMENT -> Color.RED + " " + PointMarkers.CIRCLE;
               case ENTERTAINMENT -> Color.GREEN + " " + PointMarkers.TRIANGLE;
               default -> Color.BLACK + " " + PointMarkers.PUSH_PIN;
            };
        }



        @Override
        public Geometry getShape() {
            return Geometry.POINT;
        }
    }
    enum UtilityType {
        ELECTRICAL,FIBER_OPTIC, GAS, WATER
    }
    class UtilityLine implements Mappable{

        private String name;
        private UtilityType type;

        public UtilityLine(String name, UtilityType type) {
            this.name = name;
            this.type = type;


        }

        @Override
        public String getLabel() {
            return name+"("+type+")";
        }

        @Override
        public String getMarker() {
            return switch (type){
                case ELECTRICAL -> Color.RED+""+ LineMarkers.DASHED;
                case FIBER_OPTIC -> Color.GREEN+""+LineMarkers.DOTTED;
                case GAS -> Color.ORANGE+""+LineMarkers.SOLID;
                case WATER -> Color.BLUE+""+LineMarkers.SOLID;
                default -> Color.BLACK+""+LineMarkers.SOLID;
            };
        }

        @Override
        public Geometry getShape() {
            return Geometry.LINE;
        }

        @Override
        public String toJSON() {
            return Mappable.super.toJSON()  + """
                    , 'name': '%s ', 'utility':' %s'""".formatted(name,type);
        }
    }





