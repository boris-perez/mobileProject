package Activity.despertador;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

/**
 * @autor : BorisPerez
 **/
public class NewAlarmSection {

    public TextBox TitleAlarm;
    public TextBox Note;
    public Button AlarmSave;
    public Button NewAlarm;


    public NewAlarmSection() {
        TitleAlarm = new TextBox(By.id("com.apalon.myclockfree:id/timeLabel"));
        AlarmSave = new Button(By.id("com.apalon.myclockfree:id/btnAlarmSave"));
        NewAlarm = new Button(By.id("com.apalon.myclockfree:id/addAlarmFAB"));
        Note = new TextBox(By.id("com.apalon.myclockfree:id/alarmNotes"));
    }
}
