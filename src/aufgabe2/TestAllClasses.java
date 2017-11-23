package aufgabe2;

public class TestAllClasses {

    public static void main(String[] args) {
        // TODO: teste hier die einzelnen erstellten Klassen!

        Period Period1 = new Period(2, 40);
        Period Period2 = new Period(1, 30);

        //expected results commented

        System.out.println("Period1: "+Period1);
        // 2:40
        System.out.println("Period2: "+Period2);
        // 1:30
        System.out.println("Period1 Minuten insgesamt: "+Period1.getMinutes());
        // 160
        System.out.println("Period1 Stunden: "+Period1.getHours());
        // 2
        System.out.println("Period1 Minuten: "+Period1.getMinorMinutes());
        // 40
        System.out.println("Period2 cloned: "+Period2.clone());
        // 1:30
        System.out.println("Period2 change mit 10: "+Period2.change(10));
        // 1:40
        System.out.println("Period1 change mit 70: "+Period1.change(70));
        // 3:50
    }
}
