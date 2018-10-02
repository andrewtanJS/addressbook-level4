package seedu.address.calendar.Event;

import java.util.Objects;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

public class Event {

    // Identity fields
    private final EventName eventName;
    private final Date date;
    private final StartTime startTime;
    private final EndTime endTime;

    // Data fields
    private final Detail detail;

    public Event(EventName eventName, Date date, StartTime startTime, EndTime endTime, Detail detail) {
        requireAllNonNull(eventName, date, startTime, endTime, detail);
        this.eventName = eventName;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.detail = detail;
    }

    public EventName getEventName() {
        return eventName;
    }

    public Date getDate() {
        return date;
    }

    public StartTime getStartTime() {
        return startTime;
    }

    public EndTime getEndTime() {
        return endTime;
    }

    public Detail getDetail() {
        return detail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(getEventName(), event.getEventName()) &&
                Objects.equals(getDate(), event.getDate()) &&
                Objects.equals(getStartTime(), event.getStartTime()) &&
                Objects.equals(getEndTime(), event.getEndTime()) &&
                Objects.equals(getDetail(), event.getDetail());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getEventName(), getDate(), getStartTime(), getEndTime(), getDetail());
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(getEventName())
                .append(" Date: ")
                .append(getDate())
                .append(" Start Time: ")
                .append(getStartTime())
                .append(" End Time: ")
                .append(getEndTime())
                .append(" Details:")
                .append(getDetail());
        return builder.toString();
    }

}