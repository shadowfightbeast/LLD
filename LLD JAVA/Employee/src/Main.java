public class Main {
    public static void main(String[] args) {
        Employee e=new Employee();
        Lawer lawer=new Lawer();
        Secretry secretry=new Secretry();
        LegalSecetry legalSecetry=new LegalSecetry();
        Marketer marketer=new Marketer();

        System.out.println( marketer.salary());
        System.out.println( marketer.insideMarket());
        System.out.println( lawer.getVacationDays());
        System.out.println(secretry.getHours());
        System.out.println(legalSecetry.salary());
        System.out.println(e.salary());

    }
}