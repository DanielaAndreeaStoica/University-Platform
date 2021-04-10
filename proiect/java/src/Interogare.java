import com.sun.security.auth.module.JndiLoginModule;

import javax.swing.*;
import java.awt.*;

public class Interogare {
    JFrame frame;
    Interogare(){
        frame=new JFrame("LOG IN");
        frame.setSize(new Dimension(300,200));
        frame.setLocation(400,100);
        frame.setVisible(true);
    }
}
