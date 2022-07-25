import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile {
public static void main(String[] args) {
try {
File objRead = new File("Introduction.txt");
Scanner objScanRead = new Scanner(objRead);
while (objScanRead.hasNextLine()) {
String ReadData = objScanRead.nextLine();
System.out.println(ReadData);
}
objScanRead.close();
}
catch (FileNotFoundException e) {
System.out.println("An error ocurred.");
e.printStackTrace();
}
}
}