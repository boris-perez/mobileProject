package Test.Calendar;

import Activity.calendar.MainPage;
import Activity.calendar.NewEvent;
import Activity.calendar.SearchSection;
import SessionManager.Session;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

/**
 * @autor : BorisPerez
 **/
public class EditEvent {
    MainPage mainActivity = new MainPage();
    NewEvent newEvent = new NewEvent();
    SearchSection searchSection = new SearchSection();
    String title = "Meeting";
    String EditTitle = "Coordination";

    @Test
    public void editEventTest() throws MalformedURLException {

        mainActivity.AddCalendar.click();
        newEvent.Title.type(title);
        newEvent.Save.click();
        mainActivity.Search.click();
        searchSection.Title.type(title);
        searchSection.EventName.click();
        newEvent.Title.clear();
        newEvent.Title.type(EditTitle);
        newEvent.Save.click();
        mainActivity.Search.click();
        searchSection.Title.type(EditTitle);

        String actualResult = searchSection.EventName.getText();
        Assert.assertEquals("ERROR ! Note not edited", EditTitle, actualResult);
    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
