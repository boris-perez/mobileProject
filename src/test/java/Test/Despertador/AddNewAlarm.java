package Test.Despertador;

import Activity.despertador.MainPage;
import Activity.despertador.NewAlarmSection;
import SessionManager.Session;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

/**
 * @autor : BorisPerez
 **/
public class AddNewAlarm {
    MainPage mainActivity = new MainPage();
    NewAlarmSection newAlarmSection = new NewAlarmSection();
    String note = "Meeting";

    @Test
    public void addNewAlarmTest() throws MalformedURLException {

        mainActivity.FirstAlert.click();
        mainActivity.SecondAlert.click();
        mainActivity.MainPage.click();
        mainActivity.NewAlarm.click();
        newAlarmSection.NewAlarm.click();
        newAlarmSection.Note.type(note);
        newAlarmSection.AlarmSave.click();

        String actualResult = mainActivity.AlarmNotes.getText();

        Assert.assertEquals("ERROR ! Event not created", note, actualResult);
    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
