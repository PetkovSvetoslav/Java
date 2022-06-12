	public class CardsGame_06 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        List<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split(" "))
	                .map(Integer::parseInt).collect(Collectors.toList());

	        List<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split(" "))
	                .map(Integer::parseInt).collect(Collectors.toList());

	        while (firstPlayerCards.size() != 0 && secondPlayerCards.size() != 0) {
	            int firstPlayerCard = firstPlayerCards.get(0);
	            int secondPlayerCard = secondPlayerCards.get(0);
	            firstPlayerCards.remove(0);
	            secondPlayerCards.remove(0);
	 
	            if (firstPlayerCard > secondPlayerCard) {
	                firstPlayerCards.add(firstPlayerCard);
	                firstPlayerCards.add(secondPlayerCard);
	            } else if (secondPlayerCard > firstPlayerCard) {
	                secondPlayerCards.add(secondPlayerCard);
	                secondPlayerCards.add(firstPlayerCard);
	            }
	        }
	 

	        if (firstPlayerCards.size() == 0) {
	            //втория печели -> сума от картите на втория
	            System.out.printf("Second player wins! Sum: %d", getCardsSum(secondPlayerCards));
	        }
	        else if (secondPlayerCards.size() == 0) {
	            //първия печели
	            System.out.printf("First player wins! Sum: %d", getCardsSum(firstPlayerCards));
	        }
	    }
	 
	    private static int getCardsSum(List<Integer> listCards) {
	        int sum = 0;
	        for (int card : listCards) {
	            sum += card;
	        }
	 
	        return sum;
	    }
	}
