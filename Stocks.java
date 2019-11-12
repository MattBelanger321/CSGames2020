import java.util.Scanner;

class Stocks{
	public static void main(String[] args){
		System.out.print(bestTrans());
	}
	
	
	public static int bestTrans(){
		Scanner input = new Scanner(System.in);
		
		int hold = 0; //will hold the current smallest value
		boolean flag = false; //determines if hold has been initalized or not
		int best = 0; //Contains the best possible transaction on day i
		
		for(int i = 0;input.hasNext();i++){
			int curr = input.nextInt(); //holds the stock prices of the current day
			
			if(!flag){
				hold = curr;
				flag = true;
			}else if(hold>=curr){
				hold = curr;
			}else{
				best = curr-hold>best?curr-hold:best;
			}
			
		}
		input.close();
		return best;
	}
	
}