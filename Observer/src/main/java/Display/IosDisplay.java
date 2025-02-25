package Display;

import Weather.Weather;

public class IosDisplay implements Display{
    Weather weather;
    String email;

    public IosDisplay(String email, Weather weather) {
        this.email = email;
        this.weather = weather;
    }

    public void update() {
        sendMail("Sending mail on IOS");
    }
    private void sendMail(String data) {
        System.out.println(email + " " + data);
    }
}
