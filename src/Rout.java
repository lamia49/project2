public class Rout {
     String startPickup;
      String distnationAdress;
     double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStartPickup() {
        return startPickup;
    }

    public void setStartPickup(String startPickup) {
        this.startPickup = startPickup;
    }

    public String getDistnationAdress() {
        return distnationAdress;
    }

    public void setDistnationAdress(String distnationAdress) {
        this.distnationAdress = distnationAdress;
    }


    public Rout(String startPickup, String distnationAdress, double price) {
        this.startPickup = startPickup;
        this.distnationAdress = distnationAdress;
        this.price = price;
    }


}
