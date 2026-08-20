import java.awt.*;
public class StudentRegistrationForm extends Frame {
StudentRegistrationForm() {
setTitle("Student Registration Form");
setLayout(new GridLayout(5, 2, 10, 10));
add(new Label("Name:"));
add(new TextField());
add(new Label("Roll Number:"));
add(new TextField());
add(new Label("Class:"));
add(new TextField());
add(new Label("Email:"));
add(new TextField());
add(new Label(""));
add(new Button("Register"));
setSize(350, 250);
setVisible(true);
}
public static void main(String[] args) {
new StudentRegistrationForm();
}
}

OUTPUT<img width="344" height="242" alt="Screenshot 2026-08-20 092046" src="https://github.com/user-attachments/assets/7ed90ee6-d4c4-4945-90f4-5bc05bd0d36d" />
