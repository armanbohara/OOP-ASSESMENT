package firmVacation;

public class Staff {
    private Employee[] staffList;

    public Staff() {
        staffList = new Employee[3];

        staffList[0] = new Executive("Arman", "KTM", "0000000000", 5000);
        ((Executive) staffList[0]).awardBonus(500);

        staffList[1] = new Hourly("Aman", "Kathmandu", "902389308", 15.50);
        ((Hourly) staffList[1]).addHours(40);

        staffList[2] = new Employee("AB", "Lalitpur", "7823487324", 400);
    }

    public void payday() {
        for (Employee emp : staffList) {
            System.out.println(emp);
            System.out.println("Paid: $" + emp.pay());
            System.out.println("----------------------------------");
        }
    }

    public void showVacations() {
        for (Employee emp : staffList) {
            System.out.println(emp.getName() + " vacation: " + emp.vacation());
        }
    }
}
