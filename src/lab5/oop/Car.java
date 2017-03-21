package lab5.oop;

/**
 * Created by blinstall on 3/7/2017.
 */

public class Car extends Vehicle {



    private int speed = 0;

    private String name;



    public Car(String name) {

        this.name = name;

    }



    @Override

    public void moves() {

        System.out.println("Car moves with speed " + speed);

        super.stops();

    }



    @Override

    public void stops() {

        System.out.println("Car stops! had speed " + speed);

    }



    @Override

    public void accelerate() {

        speed++;

    }



    @Override

    public String toString() {

        return "this is " + name + super.toString();

    }



    @Override

    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;



        Car car = (Car) o;



        if (speed != car.speed) return false;

//        if(name != null) {

//            return name.equals(car.name);

//        } else {

//            return car.name == null;

//        }

        return name != null ? name.equals(car.name) : car.name == null;

    }



    @Override

    public int hashCode() {

        int result = speed;

        result = 31 * result + (name != null ? name.hashCode() : 0);

        return result;

    }



    public static void main(String[] args) {

        Car dacia = new Car("dacia1300");

        dacia.moves();

        dacia.accelerate();

        dacia.stops();



        System.out.println(dacia.toString());



        Car aro = new Car("aro10");

        System.out.println(aro.toString());



        Car tanc = new Car("td103");

        tanc.stops();

        tanc.accelerate();



        Vehicle m = new Car("skodafabia");

        m.moves();

        m.getPosition();



        Movable v = m;

        v.moves();



        Object o = m;



    }

}