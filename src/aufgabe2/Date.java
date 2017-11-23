package aufgabe2;

public class Date {
    private PointInTime begin;
    private Period length;
    private String label;

    public Date (PointInTime begin, Period length, String label){
        this.begin = begin;
        this.length = length;
        this.label = label;

    }

    public void set(PointInTime begin, Period length) {
        this.begin = begin;
        this.length = length;
    }

    @Override
    public Date clone() {
       return new Date(begin, length, label);
    }

    @Override
    public String toString() {
        return "Label: \t" + label + "\nBegin:\t" + (begin == null ? "Unknown" : begin) + "\nLength:\t" + (length == null ? "Unknown" : length) ;
    }
}
