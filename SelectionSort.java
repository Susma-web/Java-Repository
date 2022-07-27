class SelectionSort {
void Sort (int array[]) {
int length = array.length;
for (int i=0; i<length-1; i++) {
int minimum = i;
for (int j=i+1; j<length; j++)
if (array[j] < array[minimum])
minimum = j;
int swapTerm = array[minimum];
array[minimum] = array[i];
array[i] = swapTerm;
}
}
void Print (int array[]) {
for (int i=0; i<array.length; i++) 
System.out.print(array[i] + " ");
System.out.println();
}
public static void main(String args[]) {
SelectionSort objSelection = new SelectionSort();
int integerArray[] = {3, 6, 89, 12, 54, 1, 67, 0};
System.out.print("Original Array : ");
objSelection.Print(integerArray);
objSelection.Sort(integerArray);
System.out.print("Sorted Array : ");
objSelection.Print(integerArray);
}
}
