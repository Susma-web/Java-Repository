import java.io.File;
public class FileInfo {
public static void main(String[] args) {
File objInfo = new File("Introduction.txt");
if (objInfo.exists()) {
System.out.println("File Name : " + objInfo.getName());
System.out.println("Absolute Path : " + objInfo.getAbsolutePath());
System.out.println("Writeable : " + objInfo.canWrite());
System.out.println("Readable : " + objInfo.canRead());
System.out.println("File Size in Bytes : " + objInfo.length());
}
else {
System.out.println("The file does not exist.");
}
}
}