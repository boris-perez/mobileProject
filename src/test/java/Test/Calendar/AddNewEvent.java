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
public class AddNewEvent {
    MainPage mainActivity = new MainPage();
    NewEvent newEvent = new NewEvent();
    SearchSection searchSection = new SearchSection();
    String title = "Meeting";

    @Test
    public void addNewEventTest() throws MalformedURLException {

        mainActivity.AddCalendar.click();
        newEvent.Title.type(title);
        newEvent.Save.click();
        mainActivity.Search.click();
        searchSection.Title.type(title);

        String actualResult = searchSection.EventName.getText();
        Assert.assertEquals("ERROR ! Event not created", title, actualResult);
    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
