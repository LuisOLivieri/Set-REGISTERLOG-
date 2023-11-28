package entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {
    private String usarname;
    private Date moment;

    public LogEntry(String usarname, Date moment) {
        this.usarname = usarname;
        this.moment = moment;
    }

    public String getUsarname() {
        return usarname;
    }

    public void setUsarname(String usarname) {
        this.usarname = usarname;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(usarname, logEntry.usarname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usarname);
    }
}
