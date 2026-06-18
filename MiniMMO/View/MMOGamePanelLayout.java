package praktik.MiniMMO.View;

import javax.swing.*;
import java.awt.*;

public class MMOGamePanelLayout extends JPanel {

    public MMOGamePanelLayout()
    {
        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel label = new JLabel("GAME");

        label.setBackground(new Color(0,0,0));

        this.add(label);
    }


}
