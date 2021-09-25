import java.util.*;
public class MatrixAddition{  
public static void main(String args[]){  
int i,j,row,col;
Scanner s=new Scanner (System.in);
System.out.println("Enter the number of rows");
row=s.nextInt();
System.out.println("Enter the number of columns");
col=s.nextInt();

int a[][]=new int[row][col]; 
int b[][]=new int[row][col];  
int c[][]=new int[row][col];  
    
System.out.println("Enter the elements of first matrix");
for(int i=0;i<row;i++){    
for(int j=0;j<col;j++){    
a[i][j]=s.nextInt();
}}

System.out.println("Enter the elements of second matrix");
for(int i=0;i<row;i++){    
for(int j=0;j<col;j++){    
b[i][j]=s.nextInt();
}}

for(int i=0;i<row;i++){    
for(int j=0;j<col;j++){    
c[i][j]=a[i][j]+b[i][j];    
System.out.print(c[i][j]+" ");    
}    
System.out.println();
}    
}}  
