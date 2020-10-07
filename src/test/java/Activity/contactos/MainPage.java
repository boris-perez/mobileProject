package Activity.contactos;

import appiumControl.Button;
import org.openqa.selenium.By;

/**
 * @autor : BorisPerez
 **/
public class MainPage {

    public Button RechazarOption;
    public Button Skip;
    public Button ContactList;


    public MainPage() {
        RechazarOption = new Button(By.id("com.android.permissioncontroller:id/permission_deny_button"));
        Skip = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[2]"));
        ContactList = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]"));
    }
}
