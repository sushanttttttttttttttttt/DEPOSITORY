import java.util.*;
public class hack24 
{
 public static void main(String[] args)
 {
int Day,weight,cost; 
String crop,name,area; 
Scanner scan=new Scanner(System.in);

System.out.print("Enter your name:");
name=scan.next();

System.out.print("Enter the crop name:");
crop=scan.next();

System.out.print("Enter the weight of the crops:");
weight=scan.nextInt(); 

System.out.print("Enter the preferred area for the despositary:");
area=scan.next();

 System.out.println("The suggested locations are:");
if (area.equals("Rajasthan")) 
       {
            System.out.println("Name: JOGINDER    Location: JAIPUR       Contact: 9941256523");
            System.out.println("Name: AARJUN      Location: UDAIPUR      Contact: 73380538227");
            System.out.println("Name: SUJAN       Location: JODHPUR      Contact: 6758063572");
       } 

else if (area.equals("TamilNadu")) 
      {
            System.out.println("Name: RAM         Location: CHENNAI      Contact: 8796550987");
            System.out.println("Name: LAKSHAN     Location: MADURAI      Contact: 9843009364");
            System.out.println("Name: SABARISH    Location: KARUR        Contact: 8825855651");
      } 

else if (area.equals("Delhi")) 
      {
            System.out.println("Name: KARTHICK    Location: NEW DELHI    Contact: 7893354363");
            System.out.println("Name: VIKRAM      Location: GURGAON      Contact: 8987987855");
            System.out.println("Name: VIKAS       Location: NOIDA        Contact: 7854320983");
      } 

else if (area.equals("Karnataka")) 
       {
            System.out.println("Name: KAPIL       Location: BIDAR        Contact: 9876797774");
            System.out.println("Name: YUGESH      Location: MYSORE       Contact: 8893452678");
            System.out.println("Name: MONISH      Location: BENGALURU    Contact: 9873512435");
        } 

else if (area.equals("Hyderabad")) 
       {
            System.out.println("Name: SUSHANT     Location: HYDERABAD    Contact: 7689074633");
            System.out.println("Name: AASHIK      Location: SECUNDERABAD Contact: 9838542030");
            System.out.println("Name: SAI         Location: WARANGAL     Contact: 9941785655");
        } 


else 
{
    System.out.println("No suggestions found for the specified area");
    System.exit(0);
}


System.out.print("Enter the no of days to be in the depositary:");
Day=scan.nextInt(); 

cost=(weight*5+Day*5);
System.out.print("The Total Cost of depositary is:"+cost);
 }
}








