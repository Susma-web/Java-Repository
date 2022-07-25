import java.io.File;
public class FolderDelete {
public static void main(String[] args) {
File objDel = new File("C:\\Java Programs Practice\\NewFile.txt");
if(objDel.delete()) {
System.out.println("Deleted the folder : "  + objDel.getName());
}
else {
System.out.println("Failed to delete the file.");
}
}
}