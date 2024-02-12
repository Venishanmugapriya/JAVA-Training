class Person{
    protected String name;
    protected int age;
    protected char gender;
    public Person(String name,int age,char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void displayDetails(){
        System.out.println("NAME:"+name);
        System.out.println("AGE:"+age);
        System.out.println("GENDER:"+gender);
    }
}
     class Student extends Person{
        protected int studentId;
        protected String course;
        protected char grade;
        public Student(String name,int age,char gender,int studentId,String course,char grade){
            super(name,age,gender);
            this.studentId=studentId;
            this.course=course;
            this.grade=grade;
        }
        public void displayDetails(){
        super.displayDetails();
        System.out.println("STUDENTId:"+studentId);
        System.out.println("COURSE:"+course);
        System.out.println("GRADE:"+grade);
        }
     }
        public class Equals{
            public static void main(String[]args){
                Person obj=new Person("Veni",21,'f');
                System.out.println("Person Details:");
                obj.displayDetails();
                Student obj1=new Student("Sitaara",21,'f',1914097,"ECE",'A');
                System.out.println("Student Details:");
               obj1.displayDetails();
            }
        }