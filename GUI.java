import javax.swing.*;
import java.awt.*;

public class GUI {

    public GUI(){
        JFrame calculator = new JFrame();

       // JButton taste1 = new JButton("1");JButton taste2 = new JButton("2");JButton taste3 = new JButton("3");JButton taste4 = new JButton("4");JButton taste6 = new JButton("6");JButton taste0 = new JButton("0");JButton tastePlus = new JButton("1");JButton tasteMinus = new JButton("1");JButton tasteGeteilt = new JButton("1");JButton tasteMal = new JButton("1");




        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5 ,5));
        panel.setLayout(new GridLayout(4,5,5,5 ));
        String[] buttons = {
                "n√x",
                "7",
                "8",
                "9",
                "-",
                "√",
                "4",
                "5",
                "6",
                "*",
                "x^n",
                "1",
                "2",
                "3",
                "-",
                "",
                "0",
                ".",
                "(-)",
        };
        for (int i = 0; i < buttons.length; i++) {
            if (i == 15) {
                panel.add(new JLabel(buttons[i]));
            } else {
                panel.add(new JButton(buttons[i]));
            }
        }


        calculator.add(panel, BorderLayout.CENTER);
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setTitle("Calculator");
        calculator.pack();
        calculator.setVisible(true);
    }
}
