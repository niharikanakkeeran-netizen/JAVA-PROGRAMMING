import java.io.FileWriter;
import java.io.IOException;
public class CustomerDataFileHandling {
public static void main(String[] args) {
String fileName = "customer.txt";
try (FileWriter writer = new FileWriter(fileName)) {
writer.write("Customer ID : 101\n");
writer.write("Name : Rakesh Kumar\n");
writer.write("Address : 12 MG Road, Pune\n");
writer.write("Phone : 9876543210\n");
System.out.println("Customer data written to " + fileName + " successfully.");
} catch (IOException e) {
System.out.println("An error occurred while writing to the file.");
e.printStackTrace();
}
}
}

OUTPUT
<img width="446" height="121" alt="Screenshot 2026-08-20 091519" src="https://github.com/user-attachments/assets/35e7ed30-ccf9-4de5-83ff-faed757362e4" />
