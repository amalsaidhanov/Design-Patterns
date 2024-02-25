package _2_observer;

public class Test {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        DisCurrent current = new DisCurrent(weatherData);
        DisStatic disStatic = new DisStatic(weatherData);

        System.out.println("1");
        weatherData.setMeansurements(90, 61235, 65);
        System.out.println("2");
        weatherData.setMeansurements(91230, 62131235, 61235);
        System.out.println("3");
        weatherData.removeObserver(disStatic);
        weatherData.setMeansurements(1, 2, 61235);
    }
}

