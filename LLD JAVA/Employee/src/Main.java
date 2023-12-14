public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        Lawyer lawyer = new Lawyer();
        Secretary secretary = new Secretary();
        LegalSecretary legalSecretary = new LegalSecretary();
        Marketer marketer = new Marketer();

        System.out.println(marketer.salary());
        System.out.println(marketer.insideMarket());
        System.out.println(lawyer.getVacationDays());
        System.out.println(secretary.getHours());
        System.out.println(legalSecretary.salary());
        System.out.println(e.salary());

    }
}