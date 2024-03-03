import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        {
            ArrayList<Passenger> passengers = new ArrayList<>();
            Rout rout1 = new Rout("alurigh", "BOLV World", 100);
            Rout rout2 = new Rout("alyasmin", "BOLV World", 50);
            Rout rout3 = new Rout("Tewuiq Academy", "LEEP", 200);
            Cars car1 = new Cars("1234", rout1, 0);
            Cars car2 = new Cars("5678", rout2, 2);
            Cars car3 = new Cars("0985", rout3, 4);
            Subscribers passenger1 = new Subscribers("Lamia", "46767");
            NonSubscribers passnger2 = new NonSubscribers("Ali", "0853", true);
            NonSubscribers passnger3 = new NonSubscribers("faris", "3323", false);
            try {
                passenger1.carreserve(car3);
                passengers.add(passenger1);
                passenger1.displayInfo();
                passnger2.carreserve(car2);
                passengers.add(passnger2);
                passnger2.displayInfo();
                passnger3.carreserve(car1);
                passnger3.displayInfo();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }


        }



    }
}