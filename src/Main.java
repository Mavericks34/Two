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
        int resUlt = bottle / time;
        short oneDay = 24 * 60;
        short threeDay = (24 * 3) * 60;
        int oneMonth = (31 * 24) * 60;
        System.out.println("За 1 минуту машина производит " + resUlt + " бутылок");
        System.out.println("За 20 минут машина произвела " + resUlt * 20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + resUlt * oneDay + " бутылки");
        System.out.println("За трое суток машина произвела " + resUlt * threeDay + " бутылок");
        System.out.println("За месяц машина произвела " + resUlt * oneMonth + " бутылок");

        System.out.println("Задание 5");
        byte jar = 120;
        byte jarWhite = 2;
        byte jarBrown = 4;
        int result1 = 120/(2+4);
        int jW = result1 * jarWhite;
        int jB = result1 * jarBrown;
        System.out.println("В школе,где " + result1 + " классов,нужно " + jW + " банок белой краски и " + jB + " банок коричневой краски");

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



        System.out.println("Задание 8");
        int maria = 67760;
        int den = 83690;
        int kris = 76230;
        int mariaNew = (67760 * 10 / 100) + 67760;
        int denNew = (83690 * 10 / 100) + 83690;
        int krisNew = (76230 * 10 / 100) + 76230;
        int mariaDifference = (mariaNew * 12) - (maria*12);
        int denDifference = (denNew * 12) - (den * 12);
        int krisDifference = (krisNew * 12) - (kris * 12);
        System.out.println("Мария теперь получает " + mariaNew + " рублей." + "Годовой доход вырос на " + mariaDifference + " рублей.");
        System.out.println("Денис теперь получает " + denNew + " рублей." + "Годовой доход вырос на " + denDifference + " рублей.");
        System.out.println("Кристина теперь получает " + krisNew + " рублей." + "Годовой доход вырос на " + krisDifference + " рубдей.");









        







        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

        }
    }
}