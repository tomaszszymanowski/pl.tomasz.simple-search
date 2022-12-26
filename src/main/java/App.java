import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel panel1;
    private JButton searchButton;
    private JTextField textField1;
    private JTextPane textPane1;
    private JLabel infoLabel;


    public App() {
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField1.getText();
                textPane1.setText(name);
            }
        });
    }

    public static void main(String[] args) {
        App app = new App();

    }
}
