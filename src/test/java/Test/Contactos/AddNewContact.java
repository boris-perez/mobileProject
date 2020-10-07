package Test.Contactos;

import Activity.contactos.MainPage;
import Activity.contactos.NewContactSection;
import SessionManager.Session;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

/**
 * @autor : BorisPerez
 **/
public class AddNewContact {
    MainPage mainPage = new MainPage();
    NewContactSection newContactSeection = new NewContactSection();

    String name = "Meeting";
    String number = "123456";
    String expectResult = "Contact has been saved";

    @Test
    public void addNewAlarmTest() throws MalformedURLException {

        mainPage.RechazarOption.click();
        mainPage.RechazarOption.click();
        mainPage.RechazarOption.click();
        mainPage.Skip.click();
        newContactSeection.TitleNote.click();
        newContactSeection.TitleNote.type(name);
        newContactSeection.Number.click();
        newContactSeection.Number.type(number);
        newContactSeection.SaveContact.click();

        String actualResult = newContactSeection.AlarmContact.getText();

        Assert.assertEquals("ERROR ! Event not created", expectResult, actualResult);
    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
