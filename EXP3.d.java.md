import java.awt.*;
import java.awt.event.*;
public class LoginForm extends Frame implements ActionListener {
TextField usernameField, passwordField;
Button loginButton;
LoginForm() {
setTitle("Login Form");
setLayout(new FlowLayout());
Label userLabel = new Label("Username:");
usernameField = new TextField(15);
Label passLabel = new Label("Password:");
passwordField = new TextField(15);
passwordField.setEchoChar('*');
loginButton = new Button("Login");
loginButton.addActionListener(this);
add(userLabel);
add(usernameField);
add(passLabel);

add(passwordField);
add(loginButton);
setSize(300, 200);
setVisible(true);
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
dispose();
}
});
}
public void actionPerformed(ActionEvent e) {
if (e.getSource() == loginButton) {
System.out.println("Username entered: " + usernameField.getText());
System.out.println("Login button clicked.");
}
}
public static void main(String[] args) {
new LoginForm();
}
}


OUTPUT<img width="366" height="145" alt="Screenshot 2026-08-20 091726" src="https://github.com/user-attachments/assets/623adf82-7b8c-4443-a60e-9db91abc2c16" />
<img width="285" height="189" alt="Screenshot 2026-08-20 091707" src="https://github.com/user-attachments/assets/cb76f87b-45e4-4a62-ac4a-6dca702fc479" />
