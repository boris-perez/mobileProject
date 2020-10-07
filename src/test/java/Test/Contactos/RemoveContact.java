package Test.Contactos;

import Activity.contactos.ContactList;
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
public class RemoveContact {
    MainPage mainPage = new MainPage();
    NewContactSection newContactSeection = new NewContactSection();
    ContactList contactList = new ContactList();

    String name = "Meeting";
    String number = "123456";
    String expectResult = "Contact deleted";

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
        contactList.ContactListOption.click();
        contactList.SelectContact.click();
        contactList.Delete.click();

        String actualResult = contactList.ContactRemoved.getText();

        Assert.assertEquals("ERROR ! Event not created", expectResult, actualResult);
    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
