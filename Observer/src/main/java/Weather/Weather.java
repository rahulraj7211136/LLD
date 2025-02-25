package Weather;

import Display.Display;

public interface Weather {
    void addDisplay(Display display);
    void removeDisplay(Display display);
    void notifyAllDisplay();
    void setTemp(int temp);
    int getTemp();
}
