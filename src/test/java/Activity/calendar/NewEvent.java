package Activity.calendar;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

/**
 * @autor : BorisPerez
 **/
public class NewEvent {

    public TextBox Title;
    public Button Save;

    public NewEvent() {
        Title = new TextBox(By.id("com.simplemobiletools.calendar:id/event_title"));
        Save = new Button(By.id("com.simplemobiletools.calendar:id/save"));
    }
}
