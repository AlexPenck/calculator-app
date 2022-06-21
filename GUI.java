import javax.swing.*;
import java.awt.*;

public class GUI {

    public GUI(){
        JFrame calculator = new JFrame();

        JButton taste1 = new JButton("1");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(200, 200, 200 ,200));
        panel.setLayout(new GridLayout(0,1 ));
        panel.add(taste1);
        calculator.add(panel, BorderLayout.CENTER);
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setTitle("Calculator");
        calculator.pack();
        calculator.setVisible(true);
    }
}
