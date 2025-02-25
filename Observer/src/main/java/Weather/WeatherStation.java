package Weather;

import Display.Display;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Weather{
    List<Display> displayList = new ArrayList<Display>();
    int temp;
    int stock = 0;

    public void addDisplay(Display display) {
        displayList.add(display);
    }

    public void notifyAllDisplay() {
        for(Display display : displayList) {
            display.update();
        }
    }

    public void setTemp(int temp) {
        this.temp = temp;
        if(stock == 0) {
            notifyAllDisplay();
        }
        stock += 50;
    }

    public int getTemp() {
        if(stock == 0) {
            notifyAllDisplay();
        }
        return temp;
    }

    public void removeDisplay(Display display) {
        displayList.remove(display);
    }
}
