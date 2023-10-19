package extra.day2;

public class Car{
    private String name;
    private int door;
    private String color;

    public Car(String name, int door, String color){
        this.name = name;
        this.door = door;
        this.color = color;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDoor(int door){
        this.door = door;
    }
    public void setColor(String color){
        this.color=color;
    }

    @Override
    public String toString(){
        return String.format("name : %s,door : %d, color : %s\n",name,door,color);
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c =new Car("소나타",4,"White");

        c.setName("제네시스");

        System.out.println(c);
    }
}
