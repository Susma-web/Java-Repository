public class Recursion {
public static void main(String[] args) {
int result = Sum(20);
System.out.println(result);
int addNum = Add(10, 20);
System.out.println(addNum);
}
public static int Sum(int k) {
if(k>0) {
return k+Sum(k-1);
}
else {
return 0;
}
}
public static int Add(int start, int end) {
if(end>start) {
return end+Add(start, end-1);
}
else {
return end;
}
}
}