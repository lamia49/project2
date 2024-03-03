public class Subscribers extends Passenger{

    public Subscribers(String name, String id) {
        super(name, id );
    }

    @Override
    public void carreserve(Cars car) throws Exception {
        if (car.maximumCapacity == 0) {
            throw new Exception ("Capcity is full");}
        reservedCar=car;

        tripPrice=car.fixedRoute.price*0.5;
    }

    @Override
    public void displayInfo() {
        System.out.println("subscribe Passenger name : "+getName());
        System.out.println("ID: "+getId());
        System.out.println("Car cod: "+reservedCar.code);
        System.out.println("Rout parice: "+tripPrice);
    }
}
