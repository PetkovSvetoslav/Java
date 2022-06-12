	public class HouseParty_03 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int countCommands = Integer.parseInt(scanner.nextLine());

	        List<String> guestNames = new ArrayList<>();

	        for (int count = 1; count <= countCommands; count++) {
	            String command = scanner.nextLine();

	            List<String> commandParts = Arrays.stream(command.split(" ")).collect(Collectors.toList());
	            String name = commandParts.get(0);

	            if (commandParts.size() == 3) { //GOING
	                if (guestNames.contains(name)) {
	                    System.out.printf("%s is already in the list!%n", name);
	                } else {
	                    guestNames.add(name);
	                }
	            }

	            else if (commandParts.size() == 4) { 
	                if (guestNames.contains(name)) {
	                    guestNames.remove(name);
	                } else {
	                    System.out.printf("%s is not in the list!%n", name);
	                }
	            }
	        }
	        for (String name : guestNames) {
	            System.out.println(name);
	        }
	    }
	}
