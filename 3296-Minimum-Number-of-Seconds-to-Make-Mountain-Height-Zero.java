class Solution {
  public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
    long l = 1;
    long r = (long) Arrays.stream(workerTimes).min().getAsInt() * mountainHeight *
             (mountainHeight + 1) / 2;

    while (l < r) {
      final long m = (l + r) / 2;
      if (getReducedHeight(workerTimes, m) < mountainHeight)
        l = m + 1;
      else
        r = m;
    }

    return l;
  }
  private int getReducedHeight(int[] workerTimes, long m) {
    int reducedHeight = 0;
    for (int workerTime : workerTimes)
      reducedHeight += (int) ((-1 + Math.sqrt(1 + 8 * m / workerTime)) / 2);
    return reducedHeight;
  }
}
