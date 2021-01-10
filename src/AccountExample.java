import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private Pattern pattern;
    private Matcher matcher;
    private final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public AccountExample(){
        this.pattern = Pattern.compile(ACCOUNT_REGEX);
    }
    public boolean validate(String s){
        matcher = pattern.matcher(s);
        return matcher.matches();
    }
}
