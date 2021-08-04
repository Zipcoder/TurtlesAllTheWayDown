import java.time.Duration;
import java.time.Instant;

/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {

    Instant start = Instant.now();

    // CODE to be timed goes HERE

    Instant finish = Instant.now();
    long timeElapsed = Duration.between(start, finish).toMillis();

}
