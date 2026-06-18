package praktik.MiniMMO.View;

import javax.swing.*;
import java.awt.*;


public class MMOMenuPanelLayout extends JPanel {

    public MMOMenuPanelLayout()
    {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton newGameButton = new JButton("New game");

        newGameButton.setFont(new Font(Font.SANS_SERIF, Font.BOLD,16));
        newGameButton.setBackground(new Color(236, 172, 136));
        this.setOpaque(false);
        this.add(newGameButton);



    }


}
