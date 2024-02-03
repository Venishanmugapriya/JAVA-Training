public class CopyConstructor{
private int age;
String name;
private int votingAge;
CopyConstructor(int a,String naam,int n){
age=a;
name=naam;
votingAge=n;
}
CopyConstructor(CopyConstructor obj) {
age=obj.age;
name=obj.name;
votingAge=obj.votingAge;
}
void display(){
System.out.println("AGE:"+age);
System.out.println("NAME:"+name);
System.out.println("VOTINGAGE:"+votingAge);
}
public static void main(String[]args){
CopyConstructor obj1=new CopyConstructor(14,"veni",34);
CopyConstructor obj2=new CopyConstructor(obj1);
obj1.display();
obj2.display();
}
}
