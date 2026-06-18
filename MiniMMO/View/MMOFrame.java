package praktik.MiniMMO.View;

import javax.swing.*;
import java.awt.*;


import praktik.MiniMMO.View.*;


public class MMOFrame extends JFrame{

    private MMOPanelMainLayout layout;
    public MMOFrame()
    {
        super("Charakter create");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(200,200,400,200);

        this.layout = new MMOPanelMainLayout(this);

        setContentPane(layout);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setOpaque(true);
        menuBar.setBackground(new Color(42,42,50));
        menuBar.setPreferredSize(new Dimension(this.getWidth(),this.getHeight()/5));

        MMOMenuPanelLayout menuLayout = new MMOMenuPanelLayout();

        menuBar.add(menuLayout);


        this.add(menuBar, BorderLayout.NORTH);

        this.pack();
        this.setVisible(true);

    }
}
