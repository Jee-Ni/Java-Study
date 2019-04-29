package condition;

public class LoginDemo {

	public static void main(String[] args) {
		String id = args[0];
        if(id.equals("jeeni")){  //run configurations> new launch> arguments
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
	}

}
