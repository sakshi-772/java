import java.util.Scanner;
class name
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the name in following format(first middle last):");
String str=sc.nextLine();

String[] parts=str.trim().split("\\s+");

if(parts.length!=3)
{
System.out.println("please enter the string in correct format");
return;
}

String first=parts[0];
String middle=parts[1];
String last=parts[2];

middle=middle.substring(0,1).toUpperCase()+middle.substring(1).toLowerCase();

System.out.println(last+" "+first+" "+middle);
}
}

