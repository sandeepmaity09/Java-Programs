//Demonstrate return.

class Return {
public static void main(String[] args ){
boolean b = true;
System.out.println("Before the return.");
if(b)
return ;  //return to caller
System.out.println("This won't execute.");
}
}
