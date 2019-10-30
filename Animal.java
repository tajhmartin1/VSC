package VSC;
public class Animal{
    private String name;
    public Animal(String name){
         this.name = name;

    }
    public void sleep(){
        System.out.println(name +" goes zzZZZZZZZZZZZZZZZ");
    }
    public void eat(){
        System.out.println(name + " says nom nom");
    }
    public String speak(){
        return "w00t";

    }
    public String toString(){
        return name+ " says "+ speak();
    }
    public String getName(){
        return name ;
    }
}