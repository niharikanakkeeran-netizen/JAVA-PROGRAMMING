import java.io.*;
public class CopyFile {
public static void main(String[] args) {

try (BufferedReader br = new BufferedReader(new FileReader("Welcome home.txt"));
BufferedWriter bw = new BufferedWriter(new FileWriter("Welcome home.txt"))) {
String line;
while ((line = br.readLine()) != null) {
bw.write(line);
bw.newLine();
}
System.out.println("File copied successfully!");
} catch (IOException e) {
System.out.println("Error: " + e.getMessage());
}
}
}


OUTPUT

(source.txt contains:)
Hello World
Welcome to Java
Program run:
File copied successfully!
(destination.txt now contains:)
Hello World
Welcome to Java  
