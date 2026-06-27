class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int ttl = arrivalTime + delayedTime;
        return ttl % 24;
    }
}