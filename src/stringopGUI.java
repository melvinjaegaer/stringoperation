import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class stringopGUI {
    private JTextField eingabefeld;
    private JButton charATButton;
    private JButton indexOfButton;
    private JButton lastIndexOfButton;
    private JButton equalsButton;
    private JButton lowercaseButton;
    private JButton uppercaseButton;
    private JButton substringButton;
    private JTextField Ausgabefeld;
    private JTextField positionfeldchar;
    private JLabel position;
    private JTextField positionfeldIO;
    private JTextField PositionfeldLIO;
    private JTextField equalsfeld;
    private JPanel Stringop;

    String a;

    public stringopGUI() {
        charATButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        indexOfButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        lastIndexOfButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        lowercaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        uppercaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        substringButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("stringopGUI");
        frame.setContentPane(new stringopGUI().Stringop);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
