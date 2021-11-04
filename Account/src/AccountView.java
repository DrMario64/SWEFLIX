import java.awt.event.ActionListener;
import javax.swing.*;

public class AccountView extends JFrame {
    private JTextField username = new JTextField(10);
    private JTextField password = new JTextField(10);
    private JTextField password2 = new JTextField(10);

    AccountView() {
        JPanel accountPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        accountPanel.add(username);
        accountPanel.add(password);
        accountPanel.add(password2);
    }

    public String getUserName() {
        return username.getText();
    }

    public String getPassword() {
        return password.getText();
    }

    public String getPassword2() {
        return password2.getText();
    }
}
