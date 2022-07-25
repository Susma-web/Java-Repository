import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class FileCreation {
public static void main(String[] args) {
try {
File objFile = new File("Introduction.txt");
//Creating a file
if(objFile.createNewFile()) {
System.out.println("File created : " + objFile.getName());
//Creating the directory for the file
System.out.println("Absolute path : " + objFile.getAbsolutePath());
//Writing to a file
FileWriter FileWrite = new FileWriter("Introduction.txt");
FileWrite.write("Hi, everyone. I am Susma from Coimbatore");
FileWrite.close();
System.out.print("Writing is completed");
}
else {
System.out.println("File already exists.");
}
}
catch(java.io.IOException e) {
System.out.println("An error ocurred.");
e.printStackTrace();
}
}
}
