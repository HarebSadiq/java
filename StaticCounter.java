
class StaticCounter {
    int number = 10;
    

    void increment() {
        number = number + 1;
        
    }

    public static void main(String[] args) {
        StaticCounter obj1 =new StaticCounter();
        StaticCounter obj2=new StaticCounter();
        StaticCounter obj3=new StaticCounter();

        
        obj1.increment();
        obj2.increment();
        obj3.increment();

        System.out.println(obj1.number);
        System.out.println(obj2.number);
        System.out.println(obj3.number);
        System.out.println("");
    }
}