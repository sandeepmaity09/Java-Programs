//Demonstrate of one-dimensional Array
class Array {
public static void main(String[] args) {
int month_days[];
month_days = new int[12];
for(int i=0;i<month_days.length;i++){
month_days[i]=i*2;
}
for(int i=0;i<month_days.length;i++)
System.out.println("At Month_days[] "+month_days[i]);
}
}

