public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        int lengthArr = Integer.parseInt(scan.nextLine());
        String sequence = scan.nextLine();
        int countSequences = 0;
        int longestSubsequenceOfOnes = 0;
        int leftestStartIndexOfSequence = 0;
        String[] leftestStartIndexOfSequenceArr = new String[lengthArr];
        int bestSum = 0;
        int positionOfSequence = 0;
 
        while (!"Clone them!".equals(sequence)) {
            countSequences++;
            String[] sequenceStringArr = sequence.split("[!]+");
            int[] sequenceArr = Arrays.stream(sequenceStringArr).mapToInt(Integer::parseInt).toArray();
            int start;
            int isLong = 1;
            int continueStart = -1;
            int leftestStartIndex = 0;
            int longestOnesInSequence = 0;//longest sequence of ones in current sequence array
 
            for (int i = 1; i < sequenceArr.length; i++) {
                if (sequenceArr[i] == 1 && sequenceArr[i - 1] == 1) {
                    continueStart++;
                    start = i - continueStart - 1;
                    isLong++;
                } else {
                    continueStart = -1;
                    start = 0;
                    isLong = 1;
                }
                if (isLong > longestOnesInSequence) {
                    longestOnesInSequence = isLong;
                    leftestStartIndex = start;
                }
            }
            int sum = 0;
            if (longestOnesInSequence > longestSubsequenceOfOnes) {
                longestSubsequenceOfOnes = longestOnesInSequence;
                leftestStartIndexOfSequence = leftestStartIndex;
                leftestStartIndexOfSequenceArr = sequenceStringArr;
                positionOfSequence = countSequences;
                for (int num : sequenceArr) {
                    if (num == 1) {
                        sum += num;
                    }
                }
                bestSum = sum;
            } else if (longestOnesInSequence == longestSubsequenceOfOnes && leftestStartIndex < leftestStartIndexOfSequence) {
                leftestStartIndexOfSequence = leftestStartIndex;
                leftestStartIndexOfSequenceArr = sequenceStringArr;
                positionOfSequence = countSequences;
                for (int num : sequenceArr) {
                    if (num == 1) {
                        sum += num;
                    }
                }
                bestSum = sum;
            } else if (longestOnesInSequence == longestSubsequenceOfOnes && leftestStartIndex == leftestStartIndexOfSequence) {
                for (int num : sequenceArr) {
                    if (num == 1) {
                        sum += num;
                    }
                }
                if (sum > bestSum) {
                    bestSum = sum;
                    positionOfSequence = countSequences;
                    leftestStartIndexOfSequenceArr = sequenceStringArr;
                }
            }
            sequence = scan.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", positionOfSequence, bestSum);
        for (String num : leftestStartIndexOfSequenceArr) {
            System.out.print(num + " ");
        }
    }
}
