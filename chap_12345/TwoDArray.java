//Demonstrate of two-dimensional Array.
class TwoDArray {
public static void main(String[] args) {
int two[][]=new int[4][5];
int k=0;

for(int i=0;i<two.length;i++)
for(int j=0;j<two[i].length;j++){
two[i][j]=k;
k++;
}

for(int i=0;i<two.length;i++){
for(int j=0;j<two[i].length;j++){
System.out.print(two[i][j]+" ");
}
System.out.println();
}

}
}
