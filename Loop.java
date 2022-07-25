public class Loop {
public static void main(String args[]) {
int i=0;
//While Loop
while(i<=5) {
System.out.println(i);
i++;
}
//Do While Loop
int k=0;
do {
System.out.println(k);
k++;
}
while(k<=5);
//For Loop
for (int j=0; j<=5; j++) {
System.out.println(j);
}
for (int a=0; a<=20; a=a+3) {
System.out.println(a);
}
//For Each Loop
String[] names={"Susma", "Prathiksha", "Rakshana", "Madhusree"};
for (String b:names) {
System.out.println(b);
}
//For Loop with Break 
for (int q=1;q<=10;q++) {
if (q==6) {
break;
}
System.out.println(q);
}
//For Loop with Continue 
for (int q=1;q<=10;q++) {
if (q==5) {
continue;
}
System.out.println(q);
}
//While Loop with Break
int c=0;
while (c<=10) {
System.out.println(c);
c++;
if(c==6) {
break;
}
}
//While Loop with Continue
int t=0;
while (t<=10) {
if(t==6) {
t++;
continue;
}
System.out.println(t);
t++;
}
//Arrays
System.out.println(names[1]);
names[3] = "Surya";
for (String j : names) {
System.out.println(j);
}
System.out.println(names.length);
for( int d=0; d<names.length; d++) {
System.out.println(names[d]);
}
//Multi-Dimensional Array
int[][] nums = {{1,2,3,4},{5,6,7}};
int s=nums[1][2];
System.out.println(s);
int f=nums[0][3];
System.out.println(f);
for (int u=0; u<nums.length; ++u) {
for (int y=0; y<nums[u].length; ++y) {
System.out.println(nums[u][y]);
}
}
}
}