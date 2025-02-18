package pippi.task;

import java.time.LocalDate;

import pippi.parser.DateFormatter;

/**
 * The Deadline class represents a specific type of task
 * that aside from description also includes specified
 * due time
 *
 * @author Nathan
 */
public class Deadline extends Task {
    private LocalDate due;
    /**
     * Constructs a Deadline instance with a description and due period.
     *
     * @param desc The description of the Deadline
     * @param due The due of the Deadline
     */
    public Deadline(String desc, LocalDate due) {
        super(desc);
        this.due = due;
    }

    /**
     * Returns the String representation of a deadline task to the UI
     * @return Deadline string representation
     */
    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + DateFormatter.convertDateToString(due) + ")";
    }

    /**
     * Returns the String representation of a deadline task written to the memory
     * @return Deadline string representation
     */
    @Override
    public String toMemory() {
        return "D " + super.getStatus()
            + super.getDescription() + " | " + due.format(DateFormatter.FORMAT);
    }
}
