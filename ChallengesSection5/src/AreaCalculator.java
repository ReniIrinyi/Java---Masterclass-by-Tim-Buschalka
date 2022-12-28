public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(-1, 3));
        System.out.println(area(1, 3));
    }

    public static double area(double radius){
        return radius >=0? area(radius, radius)*Math.PI : -1;
    };
    public static double area(double x, double y){
        return x>=0 && y>=0 ?x*y:-1;
    };
}
