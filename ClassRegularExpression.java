import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ClassRegularExpression {
public static void main(String[] args) {
Pattern RegPattern = Pattern.compile("Susma", Pattern.CASE_INSENSITIVE);
Matcher RegMatcher = RegPattern.matcher("Susma Sureshkumar");
boolean MatchFound = RegMatcher.find();
if (MatchFound) {
System.out.println("Match Found");
}
else {
System.out.println("Match Not Found");
}
}
}