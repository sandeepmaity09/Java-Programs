//Automatic type conversion apply to overloading.
class OverloadDemo {
void test() {
System.out.println("No Parameters");
}

//Overload test for two integer parameters.
void test(int a,int b){
System.out.println("a and b: "+a+" "+b);
}

//Overload test for double parameter.
void test(double a){
System.out.println("Inside test(double) a: "+a);
}
}

