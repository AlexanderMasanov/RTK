
public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte core = 6;
        short flow = 12;
        int gig = 16;
        long disk = 4;
        float cpu = 4.200f;
        double memory = 3.200;
        char namecpu = 105;
        boolean internet = true;
        System.out.println(
                core + " количество ядер процессора\n" +
                        flow + " количество потоков процессора\n" +
                        gig + " количество гигов оперативы\n" +
                        disk + " количество hdd и ssd\n" +
                        cpu + " частота процессора\n" +
                        memory + " частота оперативы\n" +
                        namecpu + " буква процессора\n" +
                        internet + " есть ли выход в инет\n"
        );

        System.out.println("2. Расчет стоимости товара со скидкой");
        int pen = 100, book = 200;
        int sale = ((pen + book) / 100) * 11;
        int sum = (pen + book) - sale;
        System.out.println(
                pen + book + " общая стоимость без скидки\n" +
                        sale + " сумма скидки\n" +
                        sum + " общая стоимость со скидкой\n"
        );

        System.out.println("3. Вывод слова JAVA");
        System.out.printf("   J    a  v     v  a    \n" +
                "   J   a a  v   v  a a   \n" +
                "J  J  aaaaa  V V  aaaaa  \n" +
                " JJ  a     a  V  a     a \n" +
                "\n");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807l;
        System.out.println(
                "byte " + a + " " + ++a + " " + --a +
                        "\nshort " + b + " " + ++b + " " + --b +
                        "\nint " + c + " " + ++c + " " + --c +
                        "\nlong " + d + " " + ++d + " " + --d + "\n"
        );

        System.out.println("5. Перестановка значений переменных");
        int per1 = 2;
        int per2 = 5;
        System.out.println(" с помощью третьей переменной\n исходное значение " + per1 + " " + per2);
        int per3;
        per3 = per1;
        per1 = per2;
        per2 = per3;
        System.out.println(per1 + " " + per2 + " новое значение");
        System.out.println(" с помощью арифметических операций +-\n исходное значение " + per1 + " " + per2);
        per1 = per1 + per2;
        per2 = per1 - per2;
        per1 = per1 - per2;
        System.out.println(per1 + " " + per2 + " новое значение");
        System.out.println(" с помощью арифметических операций */\n исходное значение " + per1 + " " + per2);
        per1 = per1 * per2;
        per2 = per1 / per2;
        per1 = per1 / per2;
        System.out.println(per1 + " " + per2 + " новое значение");
        System.out.println(" с помощью побитовой операции\n исходное значение " + per1 + " " + per2);
        per1 = per1 ^ per2;
        per2 = per1 ^ per2;
        per1 = per1 ^ per2;
        System.out.println(per1 + " " + per2 + " новое значение");

        System.out.println("\n 6. Вывод символов и их кодов");
        char c1 = '#';
        char c2 = '&';
        char c3 = '@';
        char c4 = '^';
        char c5 = '_';
        System.out.println((int) c1 + " " + c1 + "\n" +
                (int) c2 + " " + c2 + "\n" +
                (int) c3 + " " + c3 + "\n" +
                (int) c4 + " " + c4 + "\n" +
                (int) c5 + " " + c5);

        System.out.println("\n 7. Вывод в консоль ASCII-арт Дюка");
        char ch1 = '/';
        char ch2 = '\\';
        char ch3 = '_';
        char ch4 = '(';
        char ch5 = ')';
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
        System.out.println("Число " + ab + " содержит:\n" + sot +
                " сотен\n" + des + " десятков\n" + ed + " единиц\n" +
                "Сумма его цифр = " + suma + "\nПроизведение = " + pro);

        System.out.println("\n 9. Вывод времени");
        int time = 86399;
        int hour = time / 3600;
        int min = (time % 3600) / 60;
        int sec = time % 60;
        System.out.println(hour + ":" + min + ":" + sec);
    }
}