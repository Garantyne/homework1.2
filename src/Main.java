public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;
        float e = 5.1f;
        double f = 6.2;

        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        System.out.println("Задание 2");

        byte a1 = 67;
        short b1 = -159;
        int c1 = 27897;
        long d1 = 987678965549L;
        float e1 = 27.12f;
        double f1 = 2.786;
        boolean h1 = false;

        System.out.println("Задание 3");

        short LudPavlClass = 23;
        short AnnSergClass = 27;
        short EkaAndrClass = 30;
        int classStudents = LudPavlClass + AnnSergClass + EkaAndrClass;
        short Paper = 480;
        int delitNaVseh = Paper / classStudents;
        System.out.println("Каждый ученик получит по " + delitNaVseh + " листов");

        System.out.println("Задание 4");
        short isgotButInMin = 8;
        int za20Min = isgotButInMin * 20;
        System.out.println("За 20 минут машина произвела " + za20Min + " бутылок");
        int zaSutki = isgotButInMin * 60 * 24;
        System.out.println("За сутки машина произвела " + zaSutki + " бутылок");
        int za3Days = zaSutki * 3;
        System.out.println("За 3 дня машина произвела " + za3Days + " бутылок");
        int zaMount = za3Days * 10 ;
        System.out.println("За месяц машина произвела " + zaMount + " бутылок");

        System.out.println("Задание 5");
        int withColorInClass = 2;
        int brownColorInClass = 4;
        int banokNaClass = withColorInClass + brownColorInClass;
        int allBanok = 120;
        int classes = allBanok / banokNaClass;
        int needWith = withColorInClass * classes;
        int needBrown = brownColorInClass * classes;

        System.out.println("В школе где " + classes + " классов, нужно " + needWith + " банок белой краски и "+
                needBrown + " банок коричневой краски.");

        System.out.println("Задание 6");

        int bananasMass = 5 * 80;
        int milckMass = 2 * 105;
        int iceCreamMass = 2 * 100;
        int ballsMass =  4 * 70;
        int overMass = bananasMass + iceCreamMass + milckMass + ballsMass;
        float massKg = (float)overMass / 1000;
        System.out.println("Спортсме употребит " + massKg + " кг");

        System.out.println("Задание 7");
        int nadoSbrosit = 7000;
        int minMass = 250;
        int maxMass = 500;
        double dayNeedMax = nadoSbrosit / minMass;
        double dayNeedMin = nadoSbrosit / maxMass;
        double srSbros = nadoSbrosit / (minMass + maxMass);
        System.out.println("Максимально может занять "+ dayNeedMax + " дней");
        System.out.println("Минимально будет необходимо " + dayNeedMin + " дней");
        System.out.println("Ну а если брать в среднем то понадобится "+ srSbros + " дней");

        System.out.println("Задание 8");
        int oldMariMoney = 67760;
        int oldDenMoney = 83690;
        int oldKrisMoney = 76230;
        double newMariMoney = oldMariMoney * 1.1;
        double newDenMoney = oldDenMoney * 1.1;
        double newKrisMoney = oldKrisMoney * 1.1;
        System.out.println(newMariMoney);
        System.out.println(newDenMoney);
        System.out.println(newKrisMoney);
        double razMari = newMariMoney * 12 - oldMariMoney * 12;
        double razDen = newDenMoney * 12 - oldDenMoney * 12;
        double razKris = newKrisMoney * 12 - oldKrisMoney * 12;
        System.out.println("Разница годовой зарплаты Марии равна " + razMari + " рублей");
        System.out.println("Разница годовой зарплаты Дениса равна " + razDen + " рублей");
        System.out.println("Разница годовой зарплаты Кристины равна " + razKris + " рублей");

    }
}