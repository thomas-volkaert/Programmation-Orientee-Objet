public class Animal {
    protected final String name;
    public Animal(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        Dog medor = new Dog("Medor");
        Animal felix = new Cat("Felix");
        medor.meow();
        System.out.println(medor.toString());
        System.out.println(felix.toString());

    }
}
