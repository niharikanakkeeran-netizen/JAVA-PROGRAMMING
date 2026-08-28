import javax.swing.*;
import java.awt.*;
public class Notepad extends JFrame {
JTextArea textArea;
Notepad() {
setTitle("Simple Notepad");
textArea = new JTextArea();
add(new JScrollPane(textArea), BorderLayout.CENTER);
setSize(400, 400);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setVisible(true);
}
public static void main(String[] args) {
new Notepad();
}
}


OUTPUT<img width="384" height="345" alt="Screenshot 2026-08-28 084611" src="https://github.com/user-attachments/assets/9ba5a150-4c49-4ab0-96b9-ecd80e5f824f" />
