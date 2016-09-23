// This program will not compile 
class ScopeErr {
public static void main(String[] args) {
int bar = 1;
{
int bar =3;
}
}
}
