public class Student{
private int id;
private String name;
private int age;
private char grade;
private String address;
public Student(int id,String name,int age,char grade,String address) {
this.id=id;
this.name=name;
this.age=age;
this.grade=grade;
this.address=address;
}
public int getId(){
return id;
}
public String getName(){
return name;
}
public int getAge(){
return age;
}
public char getGrade(){
return grade;
}
public String getAddress(){
return address;
}
public void displayDetails(){
System.out.println("Stu Id:"+id);
System.out.println("Stu Name:"+name);
System.out.println("Stu Age:"+age);
System.out.println("Stu Grade:"+grade);
System.out.println("Stu Address:"+address);
}
public static void main(String[]args){
Student obj=new Student(6775,"veni",21,'A',"NO.3,4TH street,keelkatalai");
System.out.println("Student Details:");
obj.displayDetails();
}
}