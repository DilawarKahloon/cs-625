class MinMax {
public static void main (String args[]) {
int A[]= {12,32,3254,35,24,-234,3,324, 324,34};
int min, max;
min=max=A[0];
for(int i=1;i<10; i++){
if( A[i] < min) min= A[i];
if (A[i] > max) max = A[i];
}
System.out.println("The maximum value is: " + max );
System.out.println("The minimum value is: " + min);
}
}