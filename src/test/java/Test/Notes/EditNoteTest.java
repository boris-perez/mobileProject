package Test.Notes;

import Activity.toDoApp.AddNewNote;
import Activity.toDoApp.MainPage;
import SessionManager.Session;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

/**
 * @autor : BorisPerez
 **/
public class EditNoteTest {
    MainPage mainActivity = new MainPage();
    AddNewNote addNewNote = new AddNewNote();
    String title = "Coordination";

    @Test
    public void editNoteTest() throws MalformedURLException {

        mainActivity.AddNoteButton.click();
        addNewNote.TitleNote.type("Training");
        addNewNote.TextNote.type("Training about mobile testing each friday 20:00");
        addNewNote.SaveNote.click();
        mainActivity.NoteSaved.click();
        addNewNote.TitleNote.clear();
        addNewNote.TitleNote.type(title);
        addNewNote.SaveNote.click();

        String actualResult = mainActivity.NoteSaved.getText();
        Assert.assertEquals("ERROR ! Note not edited", title, actualResult);
    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
