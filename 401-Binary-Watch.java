class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        for (int hr = 0; hr < 12; hr++) {
            for (int min = 0; min < 60; min++) {
                // Count the number of set bits (1s) in binary representation of both hour and minute values
                int totalBitsSet = Integer.bitCount(hr) + Integer.bitCount(min);
                // If the total number of set bits equals the turned on LED this is a valid time combination
                if (totalBitsSet == turnedOn) {
                    //Formating to necessary format
                    String timeString = String.format("%d:%02d", hr, min);
                    //adding the result
                    result.add(timeString);
                }
                else{
                    continue;
                }
            }
        }
        return result;
    }
}
