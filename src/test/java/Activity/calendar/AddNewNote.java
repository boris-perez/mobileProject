package Activity.calendar;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

/**
 * @autor : BorisPerez
 **/
public class AddNewNote {

    public TextBox TitleNote;
    public TextBox TextNote;
    public Button SaveNote;

    public AddNewNote() {
        TitleNote = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        TextNote = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
        SaveNote = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    }
}
