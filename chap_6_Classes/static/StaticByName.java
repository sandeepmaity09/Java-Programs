class StaticByDemo {
static int a = 42;
static int b = 12;

static void callme(){
System.out.println("a = "+a);
}
}

class StaticByName {
public static void main(String[] args){
StaticByDemo.callme();
System.out.println("b = "+StaticByDemo.b);
}
}
