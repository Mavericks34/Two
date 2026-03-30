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
        byte jar = 120;
        byte white = 2;
        byte brown = 4;
        int result1 = 120/(2+4);
        int am = result1 * white;
        int bm = result1 * brown;
        int ab = am + bm;
        System.out.println("В школе,где " + result1 + " классов,нужно " + am + " банок белой краски и " + bm + " банок коричневой краски");

        System.out.println("Задание 6");
        short banana = 5 * 80;
        short milk = 200 / 100 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        int result22 = banana + milk + iceCream + eggs;
        double kg = result22 * 0.001;
        System.out.println("Всего грамм " + result22 + " переведённых в кг " + kg);

        System.out.println("Задание 7");
        byte weight = 7;
        double wei250 = 250 * 0.001;
        System.out.println("Перевели в кг " + wei250 );
        double wei500 = 500 * 0.001;
        System.out.println("Перевели в кг " + wei500);
        double wei1 = 7 / wei250;
        System.out.println("Если терять по 250 грамм в день понадобиться " + wei1 + " дней");
        double wei2 = 7 / wei500;
        System.out.println("Если терять по 500 грамм в день понадобиться " + wei2 + " дней");
        double wei1wei2 = (wei1 + wei2) / 2;
        System.out.println("Может потребоваться в среднем дней,чтобы добиться результата " + wei1wei2);

        System.out.println("Задание 8");
        double maria = 67760 * 1.1;
        double den = 83690 * 1.1;
        double kris = 76230 * 1.1;
        int maria12 = 67760 * 12;
        int den12 = 83690 * 12;
        int kris12 = 76230 * 12;
        double maria112 = maria * 12;
        double den112 = den * 12;
        double kris112 = kris * 12;
        System.out.println("Мария теперь получает " + maria + " рублей." + " Годовой доход вырос на " + (maria112 - maria12) + " рублей");
        System.out.println("Денис теперь получает " + den + " рублей." + " Годовой доход вырос на " + (den112 - den12) + " рублей");
        System.out.println("Кристина теперь получает " + kris + " рублейю." + " Годовой доход вырос на " + (kris112 - kris12) + " рублей");








        







        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

        }
    }
}