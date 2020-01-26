package Task1;

import java.util.Date;
import java.util.Objects;

public class Passport {

    private String id;
    private Date effectiveAt;
    private String fio;

    public Passport() {}

    public Passport(String id, Date effectiveAt, String fio) {
        this.id = id;
        this.effectiveAt = effectiveAt;
        this.fio = fio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Date getEffectiveAt() {
        return effectiveAt;
    }

    public void setEffectiveAt(Date effectiveAt) {
        this.effectiveAt = effectiveAt;
    }

    @Override
    public String toString() {
        return "Passport {" + " id = " + id + ", effectiveAt = " + effectiveAt + ", fio " + fio + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(id, passport.id) &&
                Objects.equals(fio, passport.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fio);
    }
}