package greet;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Greeter implements Comparable<Greeter> {

    private LocalDateTime birthDate;
    private String message;
    private boolean shouldButGift;
    private boolean seen;

    public Greeter(LocalDateTime birthDate, String message, boolean shouldButGift, boolean seen) {
        this.birthDate = birthDate;
        this.message = message;
        this.shouldButGift = shouldButGift;
        this.seen = seen;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isShouldButGift() {
        return shouldButGift;
    }

    public void setShouldButGift(boolean shouldButGift) {
        this.shouldButGift = shouldButGift;
    }

    public boolean getSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    @Override
    public int compareTo(Greeter other) {
        return this.birthDate.compareTo(other.birthDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Greeter greeter = (Greeter) o;
        return shouldButGift == greeter.shouldButGift &&
                seen == greeter.seen &&
                birthDate.equals(greeter.birthDate) &&
                message.equals(greeter.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(birthDate, message, shouldButGift, seen);
    }

    @Override
    public String toString() {
        return "Greeter{" +
                "birthDate=" + birthDate +
                ", message='" + message + '\'' +
                ", shouldButGift=" + shouldButGift +
                ", seen=" + seen +
                '}';
    }
}
