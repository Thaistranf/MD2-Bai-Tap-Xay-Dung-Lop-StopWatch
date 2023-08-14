//  UML    _________________________
//        |        StopWatch        |
//        |-------------------------|
//        | -startTime: long        |
//        | -endTime: long          |
//        | +StopWatch()            |
//        | +getStartTime(): long   |
//        | +getEndTime(): long     |
//        | +start(): void          |
//        | +stop(): void           |
//        | +getElapsedTime(): long |
//        |_________________________|
public class StopWatch {
    private long startTime, endTime;
    public StopWatch(){
        startTime = System.currentTimeMillis();
    }
    public long getStartTime(){
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime - startTime;
    }
}
