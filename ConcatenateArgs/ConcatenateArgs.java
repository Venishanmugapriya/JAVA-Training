import java.io.Console;
class ConcatenateArgs{
public static void main(String[]args){
Console con = System.console();
String userName = con.readLine();
int age = Integer.parseInt(con.readLine());
System.out.println("Username:"+userName);
System.out.println("Age:"+age);
con.flush();
}
}
