package Basics;
/*It is an example of overload.
 * 
 *  
 *  
 *  
 *  */
public class OverLoad {
static void eat(String b,String p){
	System.out.println(b);
	System.out.println(p);
	
}
static void eat(int a,int b,int c){
	System.out.println(a*b);
	System.out.println(b+c);
}
static void eat(String b,String p,String g){
	System.out.println(b);
	System.out.println(p);
	System.out.println(g);
}
	public static void main(String[] args) {
		
		OverLoad.eat("Brinjal","Potatoes");
		OverLoad.eat(3,5,6);
		OverLoad.eat("roses","goldmary","sunflower");

	}

}
