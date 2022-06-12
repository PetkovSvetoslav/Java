	public class PasswordValidator_04 {
	    public static void main(String[] args) {
      
	        Scanner scanner = new Scanner(System.in);
	        String password = scanner.nextLine();
	      
	        boolean isPasswordValidLength = isValidLength(password); 
	        if (!isPasswordValidLength) {
	            System.out.println("Password must be between 6 and 10 characters");
	        }
	        
	        boolean isValidPasswordContent = isValidContent(password); 
	        if (!isValidPasswordContent) {
	            System.out.println("Password must consist only of letters and digits");
	        }
	
	        boolean isValidPasswordCountDigits = isValidCountDigits(password);  
	        if (!isValidPasswordCountDigits) {
	            System.out.println("Password must have at least 2 digits");
	        }
	 
	        if (isPasswordValidLength && isValidPasswordContent && isValidPasswordCountDigits) {
	            System.out.println("Password is valid");
	        }
	 
	    }

	    private static boolean isValidLength(String password) {
	        /*if (password.length() >= 6 && password.length() <= 10) {
	            return true;
	        } else {
	            return false;
	        }*/
	        return password.length() >= 6 && password.length() <= 10;
	    }

	    private static boolean isValidContent(String password) {
	        for (char symbol : password.toCharArray()) {
	            if (!Character.isLetterOrDigit(symbol)) {
	                return false;
	            }
	        }
	        return true;
	    }
	 
	  
	    private static boolean isValidCountDigits(String password) 
	        int count = 0; 
	       for (char symbol : password.toCharArray()) {
	            if (Character.isDigit(symbol)) {
	                count++;
	            }
	        }
	        
	        /*if (count >= 2) {
	            return true;
	        } else {
	            return false;
	        }*/
	        return count >= 2;
	    }
	 
	}
