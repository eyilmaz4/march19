package OCA_classes;

public class MethodOverload {
    public static void main(String[] args) {
        System.out.println("my country is Turkey");
        System.out.println(23);
        System.out.println(3+2);
    }
    public static void walk(int meters){
        System.out.println("int method walking");
    }
    public static void walk(short meters){
        System.out.println("short method walking");
    }
}
