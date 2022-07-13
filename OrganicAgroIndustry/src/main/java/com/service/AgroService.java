package com.service;

import java.util.ArrayList;
import com.model.AgroProduct;


//use appropriate annotation to configure ElectricityService as a Service
public class AgroService {
		
		private ArrayList<AgroProduct> productList=new ArrayList<AgroProduct>();
		
		//calculate the totalCost and return the cost
	public double calculateCost(double costPerKg, int quantity){ 
			
			double cost=0;
			//fill the code
			return cost;
				
		}
		
	//Fetch the product by using productName
	public AgroProduct getProductFromList(String productName) 	{ 		
		
		//fill the code
		return null;
	}
	
	
	// update Product quantity in the productList
	public boolean performUpdate(AgroProduct agroProduct,int quantity)	{ 	
				
		// fill the code
		// check the quantity, if no enough quantity , then raise the exception
		return false;
		}
	
	
//Don't delete this code		
		public AgroService()
		{
			addProducts();
		}
		
		//Don't delete this code
		public void addProducts() {
			productList.add(new AgroProduct("AP101","OrganicManure",125,50,true));
			productList.add(new AgroProduct("AP102","DAP",75,35,false));		
			productList.add(new AgroProduct("AP103","Seaweed",50,35,true));
			productList.add(new AgroProduct("AP104","AmoniumSulphate",100,35,false));
			productList.add(new AgroProduct("AP105","Urea",50,25,false));
			productList.add(new AgroProduct("AP106","Biovita",45,50,true));
			productList.add(new AgroProduct("AP107","NitroPhosphate",50,55,false));
			productList.add(new AgroProduct("AP108","Maxicrop",45,45,true));
			productList.add(new AgroProduct("AP109","DiammoniumPhosphate",125,25,false));
		}
		public ArrayList<AgroProduct> getProductList() {
			return productList;
		}

		public void setProductList(ArrayList<AgroProduct> list) {
			this.productList = list;
		}

}
