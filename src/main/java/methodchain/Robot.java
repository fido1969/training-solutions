package methodchain;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    private int distance;

    private int azimut;

    private List<NavigationList> navigationList = new ArrayList<>();

    public int getDistance() {
        return distance;
    }

    public int getAzimut() {
        return azimut;
    }

    public Robot go(int meter) {
        this.distance += meter;
        return this;
    }

    public Robot rotate(int angle) {
        this.azimut += angle;
        return this;
    }

    public List<NavigationList> getNavigationList() {
        return navigationList;
    }

    public Robot registerNavigationPoint() {
        navigationList.add(new NavigationList(this.distance,this.azimut));
        return this;
    }
}
