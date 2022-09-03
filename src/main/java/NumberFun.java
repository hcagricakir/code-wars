public class NumberFun {

  public static long findNextSquare(long sq) {

    long var1;
    long nextroot;
    if (Math.sqrt(sq) % 1 == 0) {
      var1 = (long) Math.sqrt(sq);
      nextroot = var1 + 1;
    } else {
      return -1;
    }
    return nextroot * nextroot;
  }
}
