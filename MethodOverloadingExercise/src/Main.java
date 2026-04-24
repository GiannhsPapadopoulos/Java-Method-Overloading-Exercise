

public class Main {

    public static void main(String[] args) {
        MathHelper m = new MathHelper();
        System.out.println(m.add(2, 3));
        System.out.println(m.add(12.1, 42.7));
        System.out.println(m.add(10, 100, 200));
        System.out.println(m.add("Hello ", "John"));
    }

}