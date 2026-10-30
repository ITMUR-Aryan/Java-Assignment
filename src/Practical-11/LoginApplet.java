
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginApplet extends JFrame implements ActionListener {

    JTextField nameField;
    JPasswordField passwordField;
    JButton submitButton;
    JLabel statusLabel;

    public LoginApplet() {

        setTitle("User Login Form");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(3, 2, 10, 10));

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(submitButton);

        statusLabel = new JLabel("");
        add(statusLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText();
        String password = new String(passwordField.getPassword());

        if (name.isEmpty() || password.isEmpty()) {
            statusLabel.setText("Fill all fields!");
        } else {
            statusLabel.setText("Welcome " + name);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginApplet::new);
    }
}
