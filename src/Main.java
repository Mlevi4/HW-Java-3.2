public class Main {
    public static void main(String[] args) {

        // начальный счет
        int bill = 100;

        // сколько пополнили
        int income = 1100;

        // сумма бонуса
        int bonus = income / 100;

        // условие
        if (income > 1000) {
            System.out.println("Клиент пополнил счёт на " + income + " рублей -бонус равен " + bonus + " рублям, итоговая сумма на счету клиента -" + (bill + income + bonus) + " рублей");
        } else {
            System.out.println("Клиент пополнил счёт на " + income + " рублей — бонусов нет, итоговая сумма на счету клиента — " + (bill + income) + " рублей.");
        }
    }
}
