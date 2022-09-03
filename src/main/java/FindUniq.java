import java.util.Arrays;

public class FindUniq {
  public static double findUniq(double arr[]) {
    // Do the magic
    Arrays.sort(arr);
    return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];
  }
}
