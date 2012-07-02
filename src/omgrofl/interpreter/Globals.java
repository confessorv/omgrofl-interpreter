package omgrofl.interpreter;

import java.util.Scanner;

public class Globals {
    public static final String numberPattern = "^[0-9]+$";
    public static final String variablePattern = "^l[o]+l$";
    
    public static final String breakOperator = "tldr";
    public static final String endOperator = "brb";
    public static final String commentOperator = "w00t";
    public static final String loopOperator = "rtfm";
    public static final String printCharacterOperator = "rofl";
    public static final String exitOperator = "stfu";
    public static final String incrementVariableOperator = "lmao";
    public static final String decrementVariableOperator = "roflmao";
    public static final String conditionOperator = "wtf";
    
    public static String indent(String text) {
        Scanner scanner = new Scanner(text);
        StringBuilder stringBuilder = new StringBuilder();
        
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            
            stringBuilder.append("    ");
            stringBuilder.append(line);
            stringBuilder.append("\n");
        }
        
        return stringBuilder.toString();
    }
}