public class Fruit {

String color;

int count;
double price;

    public Fruit(String color,  int count, double price) {
        this.color= color;
        this.price=price;
        this.count=count;

    }
    public Fruit(){}
public void Message(){
    System.out.println("Are you wanna fruit?");
}
static void MSG(){
    System.out.println("Ahoy there");
}
    public static void main(String[] args) {
        Fruit banana= new Fruit("yellow",1,100);
        Fruit apples= new Fruit("red",6,125.8);
        Fruit apricot = new Fruit("orange",123,35.7);
        Fruit chery=new Fruit("green",67,65.7);
        Fruit melon = new Fruit("yellow",90,100.89);
        System.out.println(banana.color+" "+banana.count+" "+banana.price);
        System.out.println(apples.color+" "+apples.count+" "+apples.price);
        System.out.println(apricot.color+" "+apricot.count+" "+apricot.price);
MSG();
Fruit fruit= new Fruit();
fruit.Message();
    }
}