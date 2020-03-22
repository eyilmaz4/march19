package OCA_classes;

public class SalesTaxCalculator {
    public static void main(String... arr) {
     int [] a={4546,766,878};
     printNumbers(a);
     printNumbers2(7,89);
    }
    public static void printNumbers(int[]numbers){
        for(int i:numbers){
            System.out.println(i);
        }
    }
    public static void printNumbers2(int...numbers){
        for(int i:numbers){
            System.out.println(i);
        }
    }
    public static void calculate(String name, int number, String...cityNames){

    }
}
