	public class PokemonDontGo_09 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        List<Integer> distancePokemons = Arrays.stream(scanner.nextLine().split(" "))
	                .map(Integer::parseInt).collect(Collectors.toList());

	        int sum = 0;
	        while (distancePokemons.size() > 0) {
	            int index = Integer.parseInt(scanner.nextLine());
	 
	            if (index >= 0 && index <= distancePokemons.size() - 1) {
	                int removedElement = distancePokemons.get(index);
	                sum += removedElement;
	                distancePokemons.remove(index);
	                changeElements(distancePokemons, removedElement);
	            } else if (index < 0) {
	                int removedElementFirst = distancePokemons.get(0);
	                sum += removedElementFirst;
	                int lastElement = distancePokemons.get(distancePokemons.size() - 1); 
	                distancePokemons.set(0, lastElement);
	                changeElements(distancePokemons, removedElementFirst);
	            } else if (index > distancePokemons.size() - 1) {
	                int removedElementLast = distancePokemons.get(distancePokemons.size() - 1);
	                sum += removedElementLast;
	                int firstElement = distancePokemons.get(0);
	                distancePokemons.set(distancePokemons.size() - 1, firstElement);
	                changeElements(distancePokemons, removedElementLast);
	            }
	        }
	        System.out.println(sum);
	    }
	 
	    private static void changeElements(List<Integer> distancePokemons, int removedElement) {
	        for (int listIndex = 0; listIndex <= distancePokemons.size() - 1; listIndex++) {
	            int currentNumber = distancePokemons.get(listIndex);
	            if (currentNumber <= removedElement) {
	                currentNumber += removedElement;
	            } else {
	                currentNumber -= removedElement;
	            }
	            distancePokemons.set(listIndex, currentNumber);
	        }
	    }
	}
	 
