package praktik.MiniMMO.View;

import javax.swing.*;
import java.awt.*;

public class MMOStatusPanel extends JPanel {

    public MMOStatusPanel(JFrame parentFrame){
        this.setLayout(new FlowLayout());

        JLabel statusLabel = new JLabel();
        statusLabel.setText("Game started");
        statusLabel.setForeground(new Color(255,255,255));
        statusLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD,16));

        this.setBackground(new Color(43,45,66));


        this.setPreferredSize(new Dimension(parentFrame.getWidth(), parentFrame.getHeight()/5));


        this.add(statusLabel);

    }


}
