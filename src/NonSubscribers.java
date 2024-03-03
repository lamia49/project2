public class NonSubscribers extends Passenger{

    public   boolean coupon;

    public NonSubscribers(String name, String id, boolean coupon) {
        super(name, id);
        this.coupon = coupon;
    }


    @Override
    public void carreserve(Cars car) throws Exception {
        this.reservedCar = car;
        if (car.maximumCapacity == 0) {
            throw new Exception ("Capcity is full");}
            if (coupon) {
                tripPrice = car.fixedRoute.price * 0.9;
            } else {
                tripPrice = car.fixedRoute.price;

            }}

    @Override
    public void displayInfo() {
        System.out.println("Non Supscribe passenger name : "+getName());
        System.out.println("ID: "+getId());
        System.out.println("Car cod: "+reservedCar.getCode() );
        System.out.println("Rout parice: "+tripPrice);

    }
}
