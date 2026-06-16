package praktik.MiniMMO.View;

import java.awt.*;
import javax.swing.*;

public class MMOPanelStatsLeyout extends JPanel{



    public MMOPanelStatsLeyout(){

        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        this.setBackground(new Color(43,45,66));

        JLabel nameLabel = new JLabel("Name: ");
        nameLabel.setForeground(new Color(237,242,244));
        JLabel ageLabel = new JLabel("Age: ");
        ageLabel.setForeground(new Color(237,242,244));
        JLabel levelLabel = new JLabel("Level: ");
        levelLabel.setForeground(new Color(237,242,244));
        JLabel strLabel = new JLabel("STR: ");
        strLabel.setForeground(new Color(237,242,244));
        JLabel conLabel = new JLabel("CON: ");
        conLabel.setForeground(new Color(237,242,244));
        JLabel dexLabel = new JLabel("DEX: ");
        dexLabel.setForeground(new Color(237,242,244));
        JLabel intLabel = new JLabel("INT: ");
        intLabel.setForeground(new Color(237,242,244));


        this.add(nameLabel);
        this.add(Box.createVerticalStrut(5));
        this.add(ageLabel);
        this.add(Box.createVerticalStrut(5));
        this.add(levelLabel);
        this.add(Box.createVerticalStrut(5));
        this.add(strLabel);
        this.add(Box.createVerticalStrut(5));
        this.add(conLabel);
        this.add(Box.createVerticalStrut(5));
        this.add(dexLabel);
        this.add(Box.createVerticalStrut(5));
        this.add(intLabel);
        this.add(Box.createVerticalStrut(10));

        JPanel buttonsPanel = new JPanel(new GridLayout(2, 1, 10, 0));

        JButton attackButton = new JButton("Attack");
        attackButton.setFont(new Font(Font.SANS_SERIF, Font.BOLD,24));
        JButton guardButton = new JButton("Guard");
        guardButton.setFont(new Font(Font.SANS_SERIF, Font.BOLD,24));

        attackButton.setBackground(new Color(244,162,97));
        guardButton.setBackground(new Color(244,162,97));

        attackButton.setPreferredSize(new Dimension(100,80));
        guardButton.setPreferredSize(new Dimension(100,80));

        buttonsPanel.add(attackButton);
        buttonsPanel.add(guardButton);

        buttonsPanel.setOpaque(false);

        this.add(buttonsPanel);









    }

}
