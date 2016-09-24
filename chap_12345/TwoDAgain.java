//Demonstrate allocate differing size second dimensions.
class TwoDAgain {
public static void main(String[] args) {

int twoD[][]=new int[4][];
int k=0;

for(int i=0;i<4;i++){
twoD[i]=new int[i+1];
}

//twoD[0]=new int[1];
//twoD[1]=new int[2];
//twoD[2]=new int[3];
//twoD[3]=new int[4];

for(int i=0;i<twoD.length;i++){
for(int j=0;j<twoD[i].length;j++){
twoD[i][j]=k;
k++;
}
}

for(int i=0;i<twoD.length;i++){
for(int j=0;j<twoD[i].length;j++){
System.out.print(twoD[i][j]+" ");
}
System.out.println();
}

}
}
