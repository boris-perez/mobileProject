package Activity.despertador;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

/**
 * @autor : BorisPerez
 **/
public class MainPage {

    public Button SecondAlert;
    public Button FirstAlert;
    public Button NewAlarm;
    public Button MainPage;
    public Label AlarmNotes;

    public MainPage() {
        FirstAlert = new Button(By.id("com.apalon.myclockfree:id/positive_btn"));
        SecondAlert = new Button(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
        NewAlarm = new Button(By.id("com.apalon.myclockfree:id/openAlarmsButton"));
        MainPage = new Button(By.id("com.apalon.myclockfree:id/clockSV"));
        AlarmNotes = new Label(By.id("com.apalon.myclockfree:id/alarmNotes"));
    }
}
