import Display.*;
import Weather.Weather;
import Weather.WeatherStation;

public class Observer {
    public static void main(String[] args) {
        Weather weatherStockApp = new WeatherStation();

         Display iosDisplay = new IosDisplay("abc@gmail.com", weatherStockApp);
         Display mobileDisplay = new MobileDisplay("abc@gmail.com", weatherStockApp);
         Display mobileDisplay2 = new MobileDisplay("abc@gmail.com", weatherStockApp);

         weatherStockApp.addDisplay(iosDisplay);
         weatherStockApp.addDisplay(mobileDisplay);
         weatherStockApp.addDisplay(mobileDisplay2);
         
         weatherStockApp.setTemp(40);
    }
}
