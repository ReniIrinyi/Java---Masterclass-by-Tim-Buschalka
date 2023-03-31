public class InterfaceChallenge {
    public static void main(String[] args) {

    }

    interface Mappable{
        enum Geometry{
            LINE, POINT,POLYGON
        }

        enum Color{
            BLACK,BLUE,GREEN,RED
        }

        enum PointMarkers{
            CIRCLE,DIAMOND
        }

        enum LineMarkers{
            DASHED, DOTTED,SOLID
        }
        String JSON_PROPERTY="'properties':{%s}";

       default String toJSON(){
           System.out.println();
        }

        static void takeMappableInstance(Mappable mappable){
            System.out.println();
        }
         String getLabel();
         String getMarker();
         String getShape();


    }

    class Building implements Mappable{
        enum UsageType {
            BUSINESS,ENTERTAINMENT
        }

        @Override
        public String getLabel() {
            return null;
        }

        @Override
        public String getMarker() {
            return null;
        }

        @Override
        public String getShape() {
            return null;
        }
    }

    class UtilityLine implements Mappable{
        enum UtilityType {
            ELECTRICAL,FIBER_OPTIC
        }

        @Override
        public String getLabel() {
            return null;
        }

        @Override
        public String getMarker() {
            return null;
        }

        @Override
        public String getShape() {
            return null;
        }
    }


}
