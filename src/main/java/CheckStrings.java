import java.util.ArrayList;
import java.util.HashSet;

public class CheckStrings {

    public static String checkStrings(String str, String str2, String str3) {
            HashSet<String> vars = new HashSet<>();
            vars.add(str);
            vars.add(str2);
            vars.add(str3);
            vars.remove(null);
            ArrayList<String> resultSet= new ArrayList<>(vars);
            return resultSet.get(0);
        }

    public static void main(String[] args) {
        System.out.println(checkStrings(" ", "assssaa","sasssss"));
    }
}

