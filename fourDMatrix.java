//Demonstrate of 4-d Matrix
class fourDMatrix {
public static void main(String[] args) {
int fourD[][][][]=new int[3][4][5][6];
int i,j,k,l,m=100;

for(i=0;i<3;i++){
for(j=0;j<4;j++){
for(k=0;k<5;k++){
for(l=0;l<6;l++){
fourD[i][j][k][l]=m;
m++;
}
}
}
}

for(i=0;i<3;i++){
for(j=0;j<4;j++){
for(k=0;k<5;k++){
for(l=0;l<6;l++){
System.out.print(fourD[i][j][k][l]+" ");
}
System.out.print("\t");
}
System.out.println();
}
System.out.println();
}

}
}
