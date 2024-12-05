import java.util.*;
public class Main{
public static void main(String[]args){
    int i,j,k;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of row of the matrix A (M1):");
int m1=sc.nextInt();
System.out.println("Enter the number of column of the matrix A (N1):");
int n1=sc.nextInt();
System.out.println("Enter the number of row of the matrix B (M2):");
int m2=sc.nextInt();
System.out.println("Enter the number of column of the matrix B (N2):");
int n2=sc.nextInt();
if(m2!=n1){
System.out.println("operstion fails");
return;
}
int A[][]=new int[m1][n1];
int B[][]=new int[m2][n2];
int C[][]=new int[m1][n2];
for(i=0;i<m1;i++){
for(j=0;j<n1;j++){
System.out.println("Matrix A ("+i+","+j+"):");
A[i][j]=sc.nextInt();
}}
for(i=0;i<m2;i++){
for(j=0;j<n2;j++){
System.out.println("Matrix B ("+i+","+j+"):");
B[i][j]=sc.nextInt();
}}
for(i=0;i<m1;i++){
for(j=0;j<n2;j++){
C[i][j]=0;
for(k=0;k<n1;k++){
C[i][j]+=A[i][k]*B[k][j];
}}}
System.out.println("Matrix A:");
for (i = 0; i < m1; i++) {
    for (j = 0; j < n1; j++) {
        System.out.print(A[i][j] + "\t");
    }
    System.out.println();
}
System.out.println("\nMatrix B:");
for (i = 0; i < m2; i++) {
    for (j = 0; j < n2; j++) {
        System.out.print(B[i][j] + "\t");
    }
    System.out.println();
}
System.out.println("\nMatrix C (the result):");
for (i = 0; i < m1; i++) {
    for (j = 0; j < n2; j++) { System.out.print(C[i][j] + "\t"); }
    System.out.println(); }}}