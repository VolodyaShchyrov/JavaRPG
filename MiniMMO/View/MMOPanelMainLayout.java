package praktik.MiniMMO.View;

import javax.swing.*;
import java.awt.*;

public class MMOPanelMainLayout extends JPanel{


    public MMOPanelMainLayout(JFrame parentFrame)
    {
        this.setLayout(new BorderLayout());

        MMOPanelStatsLeyout statsPanel = new MMOPanelStatsLeyout();
        MMOStatusPanel statusPanel = new MMOStatusPanel(parentFrame);
        MMOGamePanelLayout gamePanel = new MMOGamePanelLayout();


        this.add(statsPanel, BorderLayout.WEST);
        this.add(statusPanel, BorderLayout.SOUTH);
        this.add(gamePanel, BorderLayout.CENTER);
    }
}
