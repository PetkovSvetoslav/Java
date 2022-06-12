	package RegularExpressions;
	 
	        import java.util.Arrays;
	        import java.util.Scanner;
	        import java.util.regex.Matcher;
	        import java.util.regex.Pattern;
	 
	public class NetherRealms {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	 
	        String[] demons = scanner.nextLine().split(", *");
	        Arrays.sort(demons);
	 
	        String healthReg = "[^\\-0-9\\+\\*\\/\\.]*";
	        String baseDamageReg = "[\\-\\+]?([0-9]+)[.]?[0-9]*";
	        String symbolsForBaseDamage = "[\\/\\*]";
	 
	        StringBuilder sb = new StringBuilder();
	 
	        for (String demon : demons) {
	            demon = demon.replaceAll(" ", "");
	            Pattern pattern = Pattern.compile(healthReg);
	            Matcher matcher = pattern.matcher(demon);
	            while (matcher.find()) {
	                sb.append(matcher.group());
	            }
	 
	            String healthString = sb.toString();
	            sb.setLength(0);
	            int health = 0;
	            for (int i = 0; i < healthString.length(); i++) {
	                health += healthString.charAt(i);
	            }
	 
36.	            pattern = Pattern.compile(baseDamageReg);
37.	            matcher = pattern.matcher(demon);
38.	            double damage = 0.0;
39.	            while (matcher.find()) {
40.	                String group = matcher.group();
41.	                String sign = "" + group.charAt(0);
42.	                if (sign.equals("+")){
43.	                    damage += Double.parseDouble(group.substring(1));
44.	                } else if (sign.equals("-")) {
45.	                    damage -= Double.parseDouble(group.substring(1));
46.	                } else {
47.	                    damage += Double.parseDouble(group);
48.	                }
49.	            }
50.	 
51.	            pattern = Pattern.compile(symbolsForBaseDamage);
52.	            matcher = pattern.matcher(demon);
53.	            while (matcher.find()) {
54.	                String manipulator = matcher.group();
55.	                if (manipulator.equals("*")) {
56.	                    damage *= 2;
57.	                } else if (manipulator.equals("/")) {
58.	                    damage /= 2;
59.	                }
60.	            }
61.	 
62.	            System.out.printf("%s - %d health, %.2f damage%n", demon, health, damage);
63.	        }
64.	 
65.	    }
66.	}
