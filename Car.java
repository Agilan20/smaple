class Brand{
    protected String brandName = "mustang";

    public static void honk(){
        System.out.println("Inside parent class");
    }
    public static void main(String[] args){}
}
class Car extends Brand{
    String carName="Ford";

    public static void main(String[] args){
        Car carobj = new Car();
        System.out.println(carobj.brandName+carobj.carName);

    }
}

