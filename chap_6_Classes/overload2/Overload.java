class Overload {
public static void main(String[] args) {
OverloadDemo ob = new OverloadDemo();
int i=88;
ob.test();
ob.test(10,30);
ob.test(i);   //this will invoke test(double)
ob.test(123.2);  //this will invoke test(double)
}
}
