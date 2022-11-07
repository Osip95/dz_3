public class Main {
    public static void main(String[] args) {
        // task 1
        float clientOS = 0;
        if (clientOS==0||clientOS==0.1) System.out.println("Установите версию приложения для iOS по ссылке");
        else if (clientOS==1) System.out.println("Установите версию приложения для Android по ссылке");

        // task 2
        int yearСreation = 2015;
                if (clientOS==0||clientOS==0.1){
                    if (yearСreation<2015) System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    else System.out.println("Установите версию приложения для iOS по ссылке");
                }
                else if (clientOS==1) {
                    if (yearСreation<2015) System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    else System.out.println("Установите версию приложения для Android по ссылке");
                }

        //task 3
        int year = 1996;
                if ((year%4==0)||(year%400==0)){
                   if(year%100==0) System.out.println("Год не явлется весокосным");
                   else System.out.println("Год явлется весокосным");
                }
                else System.out.println("Год не явлется весокосным");

        // task 4
        int deliveryDistance = 100;
        if (deliveryDistance<=20) System.out.println("Потребуется дней:1");
        else if (deliveryDistance<=60) System.out.println("Потребуется дней:2");
        else if (deliveryDistance<=100) System.out.println("Потребуется дней:3");
        else System.out.println("Потребуется дней:>3");

        //task 5
        int monthNumber = 8;
        switch (monthNumber){
            case 12,1,2 -> System.out.println("Зима");
            case 3,4,5 -> System.out.println("Весна");
            case 6,7,8 -> System.out.println("Лето");
            case 9,10,11 -> System.out.println("Осень");
            default -> System.out.println("Введено неверное значение");
        }

        //task 6
        int age = 23;
        int salary = 58000;
        float kf = 1.0f;
        if (salary>=50000) kf = 1.2f;
        else if (salary>=80000) kf = 1.5f;
        if(age<23) System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary*kf*2 + " рублей");
        else System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary*kf*3 + " рублей");

        //task 7
        int age1 = 25;
        int salary1 = 65000;
        int wantedSum = 330000;
        float percent = 1.1f;
        if (salary1>80000) percent = percent-0.007f;
        if(age1<23) percent = percent + 0.01f;
        else if (age1<30) percent = percent + 0.005f;

        if(wantedSum*percent/12>salary1/2) System.out.println("Максимальный платеж при ЗП " +  salary1 + " равен " + salary1/2 + " рублей.\nПлатеж по кредиту "
                + wantedSum*percent/12 + " Рублей." + " Отказано");
        else System.out.println("Максимальный платеж при ЗП " +  salary1 + " равен " + salary1/2 + " рублей.\nПлатеж по кредиту "
                + wantedSum*percent/12 + " Рублей." + " Одобрено");







    }
}