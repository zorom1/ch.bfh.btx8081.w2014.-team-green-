package ch.bfh.btx8081.w2014.Green.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.servlet.annotation.WebServlet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinService;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("mytheme")
@SuppressWarnings("serial")
public class LoginView extends UI
{

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = LoginView.class, widgetset = "ch.bfh.btx8081.w2014.Green.MHCPMS.AppWidgetSet")
    public static class Servlet extends VaadinServlet {
    }

    @Override
    protected void init(VaadinRequest request) {
        final VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        setContent(layout);
        
        /*
         * Logo
         */
        
     // Find the application directory
        String basepath = VaadinService.getCurrent()
                          .getBaseDirectory().getAbsolutePath();

        // Image as a file resource
        FileResource resource = new FileResource(new File(basepath +
                                "/META-INF/logoteamgreen.png"));
        
        /*
         * User Interface Labels, Buttons and Text Fields with its content.
         */
        
        Label space1 = new Label("");
        Label label = new Label("Please type in your User ID and password.");
        Label space2 = new Label("");
        Label label3 = new Label("User ID");
        TextField uidInput = new TextField();
        Label space3 = new Label("");
        Label label4 = new Label("Password");
        PasswordField pwInput = new PasswordField("");
        Label space4 = new Label("");
        Button button2 = new Button("Login");
         
         /*
          * Button Listener that shows up with click on "Login-Button"
          */

        button2.addClickListener(new Button.ClickListener()  {
        	public void buttonClick(ClickEvent event) {
        		layout.addComponent(new Label("Login succesfull."));
        	}

			
        });
        
        /*
         * Adding the Components to the Layout
         */
        
     // Show the image in the application
        Image image = new Image("", resource);
        layout.addComponent(image);
     
        layout.addComponent(space1);
        layout.addComponent(label);
        layout.addComponent(space2);
        layout.addComponent(label3);
        layout.addComponent(uidInput);
        layout.addComponent(space3);
        layout.addComponent(label4);
        layout.addComponent(pwInput);
        layout.addComponent(space4);
        layout.addComponent(button2);
       
    }

}
