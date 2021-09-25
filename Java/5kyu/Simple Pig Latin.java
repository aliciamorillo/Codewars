import org.junit.Test;
import java.util.regex.Pattern;
import static org.junit.Assert.assertEquals;

public class PigLatin {
    public static String pigIt(String str) {
        
        final String[] words = str.split("\\s");
        final StringBuilder sb = new StringBuilder();

        for (String s : words) {
            if (Pattern.matches("\\p{IsPunctuation}", s)) {
                sb.append(s).append(" ");
            } else {
                sb.append(s.substring(1))
                        .append(s.charAt(0))
                        .append("ay ");
            }
        }

        while (sb.charAt(sb.length() - 1) == ' ') {
            sb.setLength(sb.length() - 1);
        }

        return new String(sb);
    }
}