package aufgabe2;

public class TestAllClasses {

    public static void main(String[] args) {
        // TODO: teste hier die einzelnen erstellten Klassen!

        Period period1 = new Period(2, 40);
        Period Period2 = new Period(1, 30);

        //expected results commented

        System.out.println("Period1: "+period1);
        // 2:40
        System.out.println("Period2: "+Period2);
        // 1:30
        System.out.println("Period1 Minuten insgesamt: "+period1.getMinutes());
        // 160
        System.out.println("Period1 Stunden: "+period1.getHours());
        // 2
        System.out.println("Period1 Minuten: "+period1.getMinorMinutes());
        // 40
        System.out.println("Period2 cloned: "+Period2.clone());
        // 1:30
        System.out.println("Period2 change mit 10: "+Period2.change(10));
        // 1:40
        System.out.println("Period1 change mit 70: "+period1.change(70));
        // 3:50

        Date date1 = new Date(null, period1, "Dies ist ein Test");

        Date date2 = date1.clone();

        System.out.println(date1);
        System.out.println(date2);

        date1.set( null, null );
        System.out.println("-----------------------");

        System.out.println(date1);
        System.out.println(date2);
    }
}
