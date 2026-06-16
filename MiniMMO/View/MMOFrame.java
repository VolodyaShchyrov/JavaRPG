package praktik.MiniMMO.View;

import javax.swing.*;
import java.awt.*;
import praktik.MiniMMO.View.*;


public class MMOFrame extends JFrame{

    public MMOFrame()
    {
        super("Charakter create");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(200,200,400,200);

        MMOPanelStatsLeyout statsPanel = new MMOPanelStatsLeyout();

        JMenuBar menuBar = new JMenuBar();
        menuBar.setOpaque(true);
        menuBar.setBackground(new Color(42,42,50));
        menuBar.setPreferredSize(new Dimension(this.getWidth(),this.getHeight()/5));


        this.add(menuBar, BorderLayout.NORTH);
        this.add(statsPanel);
        this.pack();
        this.setVisible(true);

    }
}
