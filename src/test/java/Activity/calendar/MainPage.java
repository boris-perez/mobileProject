package Activity.calendar;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

/**
 * @autor : BorisPerez
 **/
public class MainPage {

    public Button addNoteButton;
    public Label noteSaved;

    public MainPage() {
        addNoteButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
        noteSaved = new Label(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));
    }
}
