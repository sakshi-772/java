import java.util.Scanner;
class findString
{
public static void main(String arg[])
{
int cnt=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
String str=sc.nextLine();

String[] parts=str.trim().split("\\s+");
System.out.println("enter the string to search:");
String str1=sc.nextLine();
for(int i=0;i<parts.length;i++)
{
if (str1.equals(parts[i]))
{
System.out.println(str1+" is present in given string at index"+i);
}
}


}
}

