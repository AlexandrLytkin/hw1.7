import javax.swing.plaf.IconUIResource;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task8() {
        System.out.println("Задание1.3 альтернатива с приростом от новых людей");
        int peopleInCountryY = 12_000_000;
        int bornePeople = 17;
        int deathPeople = 8;
        int regularIncreasePeople = bornePeople - deathPeople;  //9
        int year = 1;
        while (year<=10) {
            peopleInCountryY = peopleInCountryY + peopleInCountryY / 1000 * regularIncreasePeople;
            System.out.println("год "+ year +" численость составляет " + peopleInCountryY);
            year++;
        }
    }
    public static void task7() {
        System.out.println("Задание3.2");
        int multiplicationTable = 2;
        int equals = 0;
        for (int i = 1; i <=10; i++) {
            equals = equals + equals * i;
            System.out.println(multiplicationTable +"*"+ i + "=" + multiplicationTable * i);
        }
    }
    public static void task6() {
        System.out.println("Задание3.1");
        int yearStartCount = 1822;
        while (yearStartCount < 2054) {
            yearStartCount++;
            if (yearStartCount % 79 == 0)
            System.out.println(yearStartCount);
        }
    }
    public static void task5() {
        System.out.println("Задание2.4");
        int day = 1;
        while (day < 31) {
            day++;
            if (day % 7 ==0){
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }
        }
    }
    public static void task4() {
        System.out.println("Задание2.1;2.2;2.3");
        int depositVasiliy = 15_000;
        int total = 0;
        int month = 1;
        while (total < 300_000_000) {
            total = total + total * 7 / 100;
            total = total + depositVasiliy;
            month++;
            if (month % 6 == 0) {
                System.out.println("месяц " + month + " сумма на вкладе " + total);
            }
        }
        System.out.println("сейчас на вкладе "+total);
    }
    public static void task3() {
        System.out.println("Задание1.3");
        int peopleInCountryY = 12_000_000;
        int bornePeople = peopleInCountryY / 1000 * 17;
        int deathPeople = peopleInCountryY / 1000 * 8;
        int year =1;
        while (year <=10) {
            peopleInCountryY = peopleInCountryY + (bornePeople - deathPeople);
            System.out.println("год "+ year +" численость составляет " + peopleInCountryY);
            year++;
        }

    }
    public static void task2() {
        System.out.println("Задание1.2");
        int day = 0;
        while (day < 10) {
            day++;
            System.out.printf(" " +day);
        }
        System.out.println();

        for (;day >0;day--) {
            System.out.printf(" " +day);
        }
        System.out.println();
    }
    public static void task1() {
        System.out.println("Задание1.1");
        double salary = 155_000;   //   2_459_000 цель
        int month = 1;
        double deposit = 0;
            while(deposit < 2_459_000) {
            deposit = deposit + deposit * 1 / 100;
            deposit = deposit + salary;
            System.out.printf("месяц %s сумма накоплений равна %.2f рублей\n", month, month * salary);
            month++;
            }
        System.out.printf("сейчас на вкладе %.2f" ,deposit);
        System.out.println();
    }
}
