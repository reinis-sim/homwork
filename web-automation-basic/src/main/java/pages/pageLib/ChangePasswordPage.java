package pages.pageLib;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.datatable.DataTable;
import pages.PageManager;
import java.util.Map;

public class ChangePasswordPage extends BasePage {
  //Constructor
  public ChangePasswordPage() {
    addElement("title", "//h1[contains(., 'Change Password')]");
    addElement("currentPasswordField", "input[aria-label='Field to enter the current password']");
    addElement("newPasswordField","input[aria-label='Field for the new password']");
    addElement("repeatNewPasswordField","input[aria-label='Field to repeat the new password']");
    addElement("change", "button[aria-label*='Button to confirm the change");
    addElement("accountButton", "button[aria-label*='Show/hide account menu']");
    addElement("logout", "button[aria-label='Logout']");
    addElement("loginButton", "button[aria-label*='Go to login page");


    //log in errors pēdējā solī
    
  



  }
  @Override
  public SelenideElement getMainElement() {
    return getElement("title");
  }


}
