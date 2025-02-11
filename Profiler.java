public class Profiler {
    private long startTime;
    private long endTime;

    public void startTime(){
        startTime = System.currentTimeMillis();
    }

    public void stopTime(){
        endTime = System.currentTimeMillis();
    }

    public double getTime(){
        return (endTime - startTime);
    }

    public <T extends Comparable<T>> double measureTime(ISort<T> sort, T[] array) {
        startTime();
        sort.sort(array);
        stopTime();
        return getTime();
    }
}
