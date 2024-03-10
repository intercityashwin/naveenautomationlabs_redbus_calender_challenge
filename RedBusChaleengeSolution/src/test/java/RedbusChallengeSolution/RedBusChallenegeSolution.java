package RedbusChallengeSolution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

import static RedbusChallengeSolution.RedBusSolutionHelper.getWeekEndDates;

public class RedBusChallenegeSolution {

    static final String APP_URL = "https://www.redbus.in/";
    static WebDriver driver;

    public static void main(String[] args){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        driver = new ChromeDriver(chromeOptions);
        List<String> weekEnds = getWeekEndDates("Jul 2025");
        System.out.println(weekEnds);
     }
}
