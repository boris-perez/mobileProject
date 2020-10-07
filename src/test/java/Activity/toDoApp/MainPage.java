package Activity.toDoApp;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

/**
 * @autor : BorisPerez
 **/
public class MainPage {

    public Button AddNoteButton;
    public Label NoteSaved;

    public MainPage() {
        AddNoteButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
        NoteSaved = new Label(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));
    }
}
