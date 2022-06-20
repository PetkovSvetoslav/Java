package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class regExprRegexEx2Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> racers = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        Map<String, Integer> rasersDistance = new LinkedHashMap<>();
        racers.forEach(racer -> rasersDistance.put(racer, 0));

        String regexLetter = "[A-Za-z]+";
        Pattern patternR = Pattern.compile(regexLetter);
        String regexDigit = "[0-9]";
        Pattern patternD = Pattern.compile(regexDigit);
String input = scanner.nextLine();
while (!input.equals("end of race")) {
StringBuilder nameBuilder = new StringBuilder();
Matcher matcher = patternR.matcher(input);
while (matcher.find()) {
    nameBuilder.append(matcher.group());
}
Matcher matcher1 = patternD.matcher(input);
int distance = 0;
while (matcher1.find()) {
    distance += Integer.parseInt(matcher1.group());
}
String racerName = nameBuilder.toString();
if (rasersDistance.containsKey(racerName)) {
    int currentDistance = rasersDistance.get(racerName);
    rasersDistance.put(racerName, currentDistance + distance);
}
    input = scanner.nextLine();
}
       List<String> firstTreeName = rasersDistance.entrySet().stream()
               .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
               .limit(3).map(entry -> entry.getKey()).collect(Collectors.toList());
        System.out.println("1st place: " + firstTreeName.get(0));
        System.out.println("2nd place: " + firstTreeName.get(1));
        System.out.println("3rd place: " + firstTreeName.get(2));

    }
}
