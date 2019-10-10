import java.util.Scanner;

public class USer_exp {

	public static void main(String[] args) throws Exp {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter the id");
		String id =  sc.next();
		if(id.startsWith("12")) {
			System.out.println("Employee in");
		}else {
			try {
				throw new Exp();
			
				//System.out.println("caught");
			}catch(Exp e) {
				System.out.println(e.getMessage());
			}
				
			
				
			}
		}

	}


