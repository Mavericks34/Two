//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        byte mavA = 127;
        System.out.println("mavA = " + mavA);
        short mavB = 32766;
        System.out.println("mavB = " + mavB);
        int mavC = 2147483647;
        System.out.println("mavC = " + mavC);
        long mavD = 9223372036854775807L;
        System.out.println("mavD = " + mavD);
        float mavE = 29.1234567f;
        System.out.println("mavE = " + mavE);
        double mavF = 29.12345678999999999;
        System.out.println("mavF = " + mavF);

        System.out.println("Задание 2");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        System.out.println("Задание 3");
        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short paper = 480;
        int result = lP + aS + eA;
        System.out.println("На каждого ученика расчитано " + paper / result + " листов бумаги");

        System.out.println("Задание 4");
        byte bottle = 16;
        byte time = 2;
        byte a1day = 24;
        byte a3day;
        a3day = 24 * 3;
        int a1month = 31;
        a1month = a1month * 24;
        int resUlt = bottle / time;
        System.out.println("За 1 минуту машина производит " + resUlt + " бутылок");
        System.out.println("За 20 минут машина произвела " + resUlt * 20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + resUlt * (a1day * 60) + " бутылки");
        System.out.println("За сутки машина произвела " + resUlt * (a3day * 60) + " бутылок");
        System.out.println("За месяц машина произвела " + resUlt * (a1month * 60) + " бутылок");

        System.out.println("Задание 5");
        







        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

        }
    }
}