package aufgabe2;

public class TestAllClasses {

    public static void main(String[] args) {
        // TODO: teste hier die einzelnen erstellten Klassen!

        Period period1 = new Period(3, 140);
        Period Period2 = new Period(1, 30);

        //expected results commented

        System.out.println("Period1: "+period1);
        // 5:20
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
        // 6:30

        PointInTime begin1 = new PointInTime(2017, 204, 14);

        PointInTime begin2 = begin1.clone();

        System.out.println("Begin1: "+begin1);
        // 2017/204/14
        System.out.println("Begin2: "+begin2);
        // 2017/204/14
        System.out.println("Begin1 + 11 Stunden: "+begin1.change(11));
        // 2017/205/1



        Date date1 = new Date(null, period1, "Dies ist ein Test");

        Date date2 = date1.clone();

        System.out.println(date1);
        // Label: Dies ist ein Test
        // Begin: Unknown
        // Length: 6:30
        System.out.println(date2);
        // Label: Dies ist ein Test
        // Begin: Unknown
        // Length: 6:30

        date1.set( null, null );
        System.out.println("-----------------------");

        System.out.println(date1);
        // Label: Dies ist ein Test
        // Begin: Unknown
        // Length: Unknown
        System.out.println(date2);
        // Label: Dies ist ein Test
        // Begin: Unknown
        // Length: Unknown
    }
}
