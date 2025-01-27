import javax.swing.*;
import java.awt.*;

public class LayoutApplication {
    JFrame BorderFrame;
    JButton ButtonOne, ButtonTwo;

    public LayoutApplication() {
        this.PrepareBorderFrame();
    }

    public JFrame PrepareBorderFrame() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame BorderFrame = new JFrame(" Border Layout");
        BorderFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);

//        GridLayout GL = new GridLayout(1,2);
        BorderFrame.setLayout(new GridLayout(1,2));

        ButtonOne = new JButton("ButtonOne");
        ButtonTwo = new JButton("ButtonTwo");

        BorderFrame.add(this.prepareButtonOne());
        BorderFrame.add(this.prepareButtonTwo());

        BorderFrame.setVisible(true);

        return BorderFrame;
    }

    public JButton prepareButtonOne()
    {
        ButtonOne = new JButton("ButtonOne");
        return ButtonOne;
    }

    public JButton prepareButtonTwo()
    {
        ButtonOne = new JButton("ButtonTwo");
        return ButtonTwo;
    }
}
