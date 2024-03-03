public abstract class  Passenger {
    String name;
     String id;
    public Cars reservedCar;
    public double tripPrice;

    public Passenger(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public abstract void carreserve(Cars cars) throws Exception;

    public abstract void displayInfo();

}
