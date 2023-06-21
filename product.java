public class product
{
	    int pcode;
	    String pname;
	    double price;
	    double lowest;
	    void data(int c, String n, double p){
	        pcode=c;
	        pname=n;
	        price=p;
	    }
	    void display(){
	        System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
	        
	    }  
		product(int pcode, String pname,double price)  
		{  
			pcode = pcode;  
			pname = pname;  
			price = price;
		}  
		
		
	    static void findLowest(double price1,double price2, double price3){
	    if(price1<=price2 && price1<=price3){
	        System.out.println("\nProduct 1 is of the lowest price!");
	        
	    }
	    else if(price2<=price1 && price2<=price3){
	        System.out.println("\nProduct 2 is of the lowest price!");
	        
	    }
	    else{
	        System.out.println("\nProduct 3 is of the lowest price!");
	        
	    }
	    
	   }
	  public static void main(String[] args){
	        product p[]=new product[3];
	        p[0]=new product(101,"Product_1",100.0);
	        p[1]=new product(102,"Product_2",128.40);
	        p[2]=new product(103,"Product_3",790.00);
			p[0].data(101,"product_1",100.00);
			p[1].data(102,"product_2",150.00);
			p[2].data(103,"product_3",190.00);
	        System.out.println("Product Information:\n Product_Code\tProduct_Name\tProduct_Price");
	        p[0].display();
	        p[1].display();
	        p[2].display();
	        findLowest(p[0].price,p[1].price,p[2].price);    
	        
	    }
	}

