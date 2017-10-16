package Basics;
/* It is an example of overiding
 * 
 * 
 * */
public class OverRide extends OverLoad {
 static void eat(int s,int r){
	 System.out.println(s);
	 System.out.println(r);
	 
 }
	public static void main(String[] args) {
		eat("mangoes","banans");
		eat(1,2,3);
		eat(3,4);

	}

}
