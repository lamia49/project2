import java.util.ArrayList;

public class Cars {
       String code;
       Rout fixedRoute;
      int maximumCapacity;


    public Cars(String code ,Rout fixedRoute, int maximumCapacity ) {
        this.code = code;
        this.fixedRoute = fixedRoute;
        this.maximumCapacity = maximumCapacity;
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Rout getFixedRoute() {
        return fixedRoute;
    }

    public void setFixedRoute(Rout fixedRoute) {
        this.fixedRoute = fixedRoute;
    }


    public int getMaximumCapacity(){

        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }
}
