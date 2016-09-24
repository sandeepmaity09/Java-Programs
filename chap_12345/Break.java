//USing break as a civilized form of goto.

class Break {
public static void main(String[] args) {
boolean t = true;
first : {
second : {
third : {
System.out.println("Before the Break");
if(t)
break second;
System.out.println("This won't execute");
}
System.out.println("This won't Execture");
}
System.out.println("This is after second block.");
}
}
}
