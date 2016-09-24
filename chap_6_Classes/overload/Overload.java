class Overload {
public static void main(String[] args) {
OverloadDemo ob = new OverloadDemo();
double result;

//call all version of test()
ob.test();
ob.test(1);
ob.test(2,3);
ob.test(2.3);
result=ob.test(123.23);
System.out.println("Result of ob.test(123.25): "+result);
}
}
