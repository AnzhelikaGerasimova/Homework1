public class Hello {
    static double square(double side) {
        return Math.pow(side, 2);
    }
    static double circle(double radius) {
        return Math.pow(radius, 2)*Math.PI;
    }
    static double triangle(double side1, double side2, double side3) {
        double p = (side1+side2+side3)/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(square(11));
        System.out.println(circle(5));
        System.out.println(triangle(10, 18, 25));
    }
}
