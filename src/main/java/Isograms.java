import java.util.*;
public class Isograms {
  public static boolean  isIsogram(String str) {

    return str.length() == 0 ? true : str.length() == new HashSet<>(Arrays.asList(str.toLowerCase().split(""))).size();
  }
}
