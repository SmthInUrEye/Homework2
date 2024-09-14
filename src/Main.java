//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

var dog = 8.0;
double cat = 3.6;
int paper = 763789;

        System.out.println(
                "Первая часть домашки. Вывод переменных:" +
                "\n dog = " + dog +
                "\n cat = " + cat +
                "\n paper = " + paper
            );
        System.out.println(
                "Вторая часть домашки. Вывод увеличенных на 4 переменных:" +
                "\n dog + 4 = " + (dog + 4) +
                "\n cat + 4 = " + (cat + 4) +
                "\n paper + 4 = " + (paper + 4)
        );
        System.out.println(
                "Третья часть домашки. Вывод уменьшенных переменных:" +
                "\n dog + 4 = " + (dog - 3.5) +
                "\n cat + 4 = " + (cat - 1.6) +
                "\n paper + 4 = " + (paper - 7639)
        );
var friend = 19;
        System.out.println(
                "Четвёртая часть домашки. Вывод переменной friend:" +
                "\n friend  = " + friend +
                "\n friend + 2  = " + (friend+=2) +
                "\n friend / 7 = " + (friend/=7)
        );
var frog = 3.5;
        System.out.println(
                "Пятая часть домашки. Вывод переменной frog:" +
                        "\n frog * 10 = " + (frog*=10) +
                        "\n frog / 3.5  = " + (frog/=3.5) +
                        "\n frog + 4 = " + (frog+=4)
        );
// var massBoxer1 = 78.2, massBoxer2 = 82.7;    @ Почему так нельзя?
double massBoxer1 = 78.2, massBoxer2 = 82.7; // @ А так можно?
        System.out.println(
                "Шестая часть домашки. Боксёры:" +
                        "\n Общая масса = " + (massBoxer1 + massBoxer2) +
                        "\n Разница в массе  = " + (Math.abs(massBoxer1 - massBoxer2))
        );
        System.out.println(
                "Седьмая часть домашки. Остаток от деления:" +
                        "\n Остаток от деления = " + (massBoxer2 % massBoxer1)
        );
var allWorkTime = 640;
var workTimePerMan = 8;
var ManQTY = 0;
        System.out.println(
                "Восьмая часть домашки. Сотрудники компании:" +
                        "\n Всего работников в компании - " + (ManQTY = allWorkTime/workTimePerMan) +
                        "\n Если в компании работает " + (ManQTY += 94) + " человека, то всего " + (ManQTY*4) +
                        " часов работы может быть поделено между сотрудниками"

        );
        }
    }