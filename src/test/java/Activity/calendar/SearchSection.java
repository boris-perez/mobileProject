package Activity.calendar;

import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

/**
 * @autor : BorisPerez
 **/
public class SearchSection {

    public TextBox Title;
    public Label EventName;

    public SearchSection() {
        Title = new TextBox(By.id("com.simplemobiletools.calendar:id/search_src_text"));
        EventName = new Label(By.id("com.simplemobiletools.calendar:id/event_item_title"));
    }
}
