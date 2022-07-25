import java.io.File;
public class FileDelete {
public static void main(String[] args) {
File objDel = new File("Filejava.txt");
if(objDel.delete()) {
System.out.println("Deleted the file : "  + objDel.getName());
}
else {
System.out.println("Failed to delete the file.");
}
}
}