public class Schueler implements Comparable {
    String Nachname;

    public Schueler(String nachname) {
        Nachname = nachname;
    }

    public String getNachname() {
        return Nachname;
    }

    @Override
    public String toString() {
        return Nachname;
    }

    @Override
    public int compareTo(Object o) {
        return Nachname.compareTo(o.toString());
    }
}
