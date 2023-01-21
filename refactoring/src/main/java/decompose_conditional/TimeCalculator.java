package decompose_conditional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeCalculator {
    private LocalDateTime dateTime;

    public TimeCalculator(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalTime getActualTime() {
        if(isSummer()) // decomposed conditional
            return dateTime.plusHours(1)
                    .toLocalTime();

        return dateTime.toLocalTime();
    }

    private static LocalDateTime getRangeOf(Integer month, Integer day, Integer startHour) {
        return LocalDateTime.of(LocalDate.now().getYear(),
                month, day, startHour, 59, 59);
    }

    private static LocalDateTime SUMMER_START = getRangeOf(3, 20, 2);
    private static LocalDateTime SUMMER_END = getRangeOf(11, 7, 2);

    // decomposed conditional method here
    private boolean isSummer() {
        return dateTime.isAfter(SUMMER_START) && dateTime.isBefore(SUMMER_END);
    }
}
