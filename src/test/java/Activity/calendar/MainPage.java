package Activity.calendar;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

/**
 * @autor : BorisPerez
 **/
public class MainPage {

    public Button Search;
    public Button AddCalendar;
    public Button SaveNote;

    public MainPage() {
        Search = new Button(By.id("com.simplemobiletools.calendar:id/search"));
        AddCalendar = new Button(By.id("com.simplemobiletools.calendar:id/calendar_fab"));
        SaveNote = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    }
}
