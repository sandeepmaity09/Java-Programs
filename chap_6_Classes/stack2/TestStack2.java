//Improved Stack class that uses the length array member;

class Stack {
private int stck[];
private int tos;

//allocate and initialize stack
Stack(int size){
stck = new int[size];
tos = -1;
}

//Push an item onto the stack
void push(int item){
if(tos==stck.length-1)
System.out.println("Stack is full.");
else
stck[++tos]=item;
}

//Pop an item from stack
int pop(){
if(tos<0){
System.out.println("Stack Underflow");
return 0;
}
else
return stck[tos--];
}
}

class TestStack2 {
public static void main(String[] args){

Stack mystack1 = new Stack(10);
Stack mystack2 = new Stack(20);

//push items on the stack 
for(int i=0;i<10;i++) mystack1.push(i+1);
for(int i=0;i<10;i++) mystack2.push(i*3);

//pop those items from the stack
System.out.println("Stack in mystack1:");
for(int i=0;i<5;i++)
System.out.println(mystack1.pop());

System.out.println("Stack in mystack2:");
for(int i=0;i<10;i++)
System.out.println(mystack2.pop());

}
}
