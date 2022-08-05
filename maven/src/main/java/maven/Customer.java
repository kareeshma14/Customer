package maven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;


class Customer1 implements Comparable<Customer1>{
int cid;
String name;
int purchaseamount;
int age;

Customer1(int cid,String name,int purchaseamount,int age){
this.cid=cid;
this.name=name;
this.purchaseamount=purchaseamount;
this.age=age;
}

public void setpurchaseamount(int cid) {
this.purchaseamount = cid;
}


public int compareTo(Customer1 st){
if(name==st.name)
return 0;
else if(name.compareTo(st.name)>0)
return 1;
else
return -1;
}
}

public class Customer {
	public static void main(String args[]){
		ArrayList<Customer1> al=new ArrayList<Customer1>();

		al.add(new Customer1(1,"kareeshma",5000,22));
		al.add(new Customer1(6,"kamini",6000,26));
		al.add(new Customer1(5,"monica",7000,20));
		al.add(new Customer1(2,"yuvaa",8000,25));
		al.add(new Customer1(3,"swathy",9000,28));
		al.add(new Customer1(4,"pragathi",2200,29));
		al.add(new Customer1(7,"shiva",6600,21));
		al.add(new Customer1(8,"Gowtham",8900,20));
		al.add(new Customer1(9,"sorna",9000,26));
		al.add(new Customer1(10,"nandhini",8700,23));


		int len=al.size();
		Scanner sc= new Scanner(System.in);


		String whilechoice="go";
		while (whilechoice=="go"){

		String avail="False";
		System.out.print("Enter Your Choice ");
		System.out.print("1-->Customers Name in aescending orrder 2-> Customers Data  3-->Update Customer purchaseamount. 4--> Exit " );
		System.out.print(" ");
		int a= sc.nextInt();

		switch (a) {

		case 1:
		System.out.println("");
		System.out.println("Customer Data .. ");

		System.out.println(" Name in aescending order");
		Collections.sort(al);

		for(Customer1 st:al){
		System.out.println(st.cid+" "+st.name+" "+st.purchaseamount+" "+st.age);
		}
		break;


		case 2:

  	System.out.println("");
    System.out.println("Enter customer  id to update purchase amount.. ");
      
	int b= sc.nextInt();
	System.out.println("Enter the new purhaseamount  ");
	int c= sc.nextInt();


	for(int i=0; i<len;i++){
    if (al.get(i).cid==b){
        al.get(i).setpurchaseamount(c);
        avail="True";
        System.out.println("Updated purchaseamount.." + al.get(i).cid+" "+al.get(i).name+" "+al.get(i).purchaseamount+" "+al.get(i).age); 
    }}
    if("False".equals(avail)){
    	System.out.println("Invalid customer ID");
    }

    break;
		case 3:

		System.out.println("");
		System.out.println("Enter Customer id to update purchaseamount.. ");

		int b1= sc.nextInt();
		System.out.println("Enter the new purchaseamount ");
		int c1= sc.nextInt();


		for(int i=0; i<len;i++){
		if (al.get(i).cid==b1){
		al.get(i).setpurchaseamount(c1);
		avail="True";
		System.out.println("Updated purchaseamount.." + al.get(i).cid+" "+al.get(i).name+" "+al.get(i).purchaseamount+" "+al.get(i).age);
		}}
		if("False".equals(avail)){
		System.out.println("Invalid Customer ID");
		}

		break;


		case 4:
		System.out.println("");
		whilechoice="stop";
		System.out.println("Exit Done ");
		break;
		}
		}
		}
}
