public class Main {
    public static void main (String[] args) {
        System.out.println("Hi");
        String attack = App.encrypt("attack");
        System.out.println(attack);
        Hamster homa = new Hamster();
        System.out.println(homa.name);
        System.out.println(homa.age);
        System.out.println(homa.weight);
        System.out.println(homa.isFluffy);
        System.out.println(homa.colour);
    }
}
class Hamster {
    String name;
    int age;
    int weight;
    boolean isFluffy;
    String colour;
}
class Git {
    String name = "Grisha";
}
