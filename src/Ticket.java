/**
 * Created by admin on 4/13/17.
 */
public class Ticket {

    private String name;
    private int priority;

    public Ticket(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (priority != ticket.priority) return false;
        return name != null ? name.equals(ticket.name) : ticket.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + priority;
        return result;
    }


    @Override
    public String toString() {
        return "Ticket{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}

