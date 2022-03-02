public class Dog extends Animal{

    @Override
    public String toString(){
        return name;     
    }

    public Dog(String name){
        super(name);
    }
    
    public void woof(){
        System.out.println(name+" : Woof !");
    }
}