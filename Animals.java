class Animal{
    public void display()
    {
        System.out.println("Function level one");
    }
    public static void main(String[] args){}
}
class Pig extends Animal{
    public void display()
    {
        System.out.println("Function level two");
    }
    public static void main(String[] args){}
}
class Cow extends Animal{
    public void display()
    {
        System.out.println("Function level 2-1");
    }
    public static void main(String[] args){}
}
class Animals{
    public static void main(String[] args){
        Animal obj1 = new Animal();
        Pig obj2 = new Pig();
        Cow obj21 = new Cow();

        obj1.display();
        obj2.display();
        obj21.display();


    }
}