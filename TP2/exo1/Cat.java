public class Cat extends Animal{
    @Override
    public String toString(){
        return name;
    }
    public Cat(String name){
        super(name);
    }
    public void meow(){
        System.out.println(name+" : Miaou !");
    }
}