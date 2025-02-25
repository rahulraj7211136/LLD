package Display;

import Weather.Weather;

public class MobileDisplay implements Display {
    Weather weather;
    String email;

    public MobileDisplay(String email, Weather weather) {
        this.email = email;
        this.weather = weather;
    }

    public void update() {
        sendMail("Sending mail on Android Mobile");
    }
    private void sendMail(String data) {
        System.out.println(email + " " + data);
    }
}
