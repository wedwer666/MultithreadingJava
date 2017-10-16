/**
 * Created by Maria on 16.10.2017.
 */
public class StringContainer {
    private static final StringBuffer sb = new StringBuffer();

    public static StringBuffer getSb()
    {
        return sb;
    }

    public static void addToSb(String s)
    {
        sb.append(s);
    }
}
