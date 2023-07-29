package org.company;

//import org.client.Client;

public class CompanyInfo  //extends Client {
//	private void companyName() {
		
//		System.out.println("GreensTech");
//	}
	        
 //    public static void main(String[] args) {
		
 //   	 CompanyInfo info = new CompanyInfo();
    //	 info.companyName();
   // 	info.clientName();
    // }
//}	
	 {
		private void companyName()
		 {
			
			System.out.println("Company  Details");
			System.out.println("===============");
			
		 }
		 private void companyName(String name) {
			 System.out.println("Company Name:"+name);
		 }
		 private void companyName(String city,String address) {
			 System.out.println("Company City :" + city);
			 System.out.println("Company Address :" + address );
			 
		 }
		 public static void main(String[] args) {
			 CompanyInfo c1 =new CompanyInfo();
			 c1.companyName();
			 c1.companyName("ABCD");
			 c1.companyName("Chennai", "25/30 XYZ Colony,MDU");	
		}
		
		
		
		
	}
	
	
	



