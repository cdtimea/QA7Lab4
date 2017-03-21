package lab5.oop;

/**
 * Created by blinstall on 3/7/2017.
 */
public abstract class Vehicle implements Movable  {



    private Position p;



    public abstract void moves();



    protected void stops() {

        System.out.println("Vechicle stops!");

    }



    public Position getPosition() {

        return this.p;

    }



    public abstract void accelerate();







    public static void main(String[] args) {

        Car dacia = new Car("daciapapuc");



        dacia.moves();

    }

}