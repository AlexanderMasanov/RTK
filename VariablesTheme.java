
public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("\n 1. Вывод характеристик компьютера");
        byte core = 6;
        System.out.println(core + " количество ядер процессора");
        short pot = 12;
        System.out.println(pot + " количество потоков процессора");
        int gig = 16;
        System.out.println(gig + " количество гигов оперативы");
        long disk = 4;
        System.out.println(disk + " количество hdd и ssd");
        float chas = 4.200f;
        System.out.println(chas + " частота процессора");
        double ozy = 3.200;
        System.out.println(ozy + " частота оперативы");
        char proc = 105;
        System.out.println(proc + " буква процессора");
        boolean inet = true;
        System.out.println(inet + " есть ли выход в инет");

        System.out.println("\n 2. Расчет стоимости товара со скидкой");
        int pen = 100, book = 200;
        System.out.println(pen + book + " общая стоимость без скидки");
        int sale = ((pen + book) / 100) * 11;
        System.out.println(sale + " сумма скидки");
        int sum = (pen + book) - sale;
        System.out.println(sum + " общая стоимость со скидкой");

        System.out.println("\n 3. Вывод слова JAVA \n" +
                "   J    a  v     v  a    \n" +
                "   J   a a  v   v  a a    \n" +
                "J  J  aaaaa  V V  aaaaa  \n" +
                " JJ  a     a  V  a     a\n" +
                "\n");

        System.out.println("\n 4. Вывод min и max значений целых числовых типов");
        byte a = 127;
        System.out.println(a);
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807l;
        System.out.println();

        System.out.println("\n 6. Вывод символов и их кодов");
        char c1 = '#';
        char c2 = '&';
        char c3 = '@';
        char c4 = '^';
        char c5 = '_';
        System.out.println((int) c1 + " " + c1);
        System.out.println((int) c2 + " " + c2);
        System.out.println((int) c3 + " " + c3);
        System.out.println((int) c4 + " " + c4);
        System.out.println((int) c5 + " " + c5);

        System.out.println("\n 7. Вывод в консоль ASCII-арт Дюка");
        char ch1 = '/', ch2 = '\\', ch3 = '_', ch4 = '(', ch5 = ')';
        System.out.println("    " + ch1 + ch2 + "\n" +
                "   " + ch1 + "  " + ch2 + "\n" +
                "  " + ch1 + "" + ch3 + ch4 + " " + ch5 + "" + ch2 + "\n" +
                " " + ch1 + "      " + ch2 + "\n" +
                "" + ch1 + "" + ch3 + ch3 + ch3 + ch3 + ch1 + "" + ch2 + ch3 + ch3 + ch2);

        System.out.println("\n 8. Вывод количества сотен, десятков и единиц числа");
        int ab = 123;
        int sot = 123 / 100;
        int des = 123 % 100 / 10;
        int ed = 123 % 10;
        int suma = sot + des + ed;
        int pro = sot * des * ed;
        System.out.println("Число " + ab + " содержит:\n" + sot + " сотен\n" + des + " десятков\n" + ed + " единиц\n" +
                "Сумма его цифр = " + suma + "\nПроизведение = " + pro);

        System.out.println("\n 9. Вывод времени");
        int time = 86399;
        int cha = time / 3600;
        int minyt = (time % 3600) / 60;
        int sek = time % 60;
        System.out.println(cha + ":" + minyt + ":" + sek);


    }
}
