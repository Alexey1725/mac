package com.mac;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Обнаружен пользователь...\n\tЖитель: Здравствуй путник, не хочешь поиграть со мной?:-). Расскажи, как тебя зовут?");
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        System.out.println("Житель: Здравствуйте, господин " + username + ". Что вас привело в наши края?");
        String point = scan.nextLine();
        System.out.println("Житель: О, вот это сюрприз, " + username + ", вы ищете " + point + "?");
        String answer = scan.nextLine();
        if (answer.equals("Да")) {
            System.out.println("Житель: Отлично, тогда пройдемте к великому мудрецу, он покажет где находится" + point + ", и вы закончите свое путешествие!");
        } else {
            System.out.println("Житель: Тогда ничем не могу помочь:-(. Может, стоит повести вас в школу и научить говорить и считать??? " +
                    "Так и сделаем...\nМатематик(Злая училка): " + "Здравствуй путник, что тебя занесло сюда? Хочешь проверить свои знания, да?");
            String ouch = scan.nextLine();
            if (ouch.equals("Да")) {
                System.out.println("Злая училка: Ну давай притсупим к проверке, " + username + "... сколько будет корень из двух умножить на миллиард и умножить на 382674927?");
                int ups = scan.nextInt();
                System.out.println("Злая училка: Хаха, не знаешь?, ну ты и глууупый. Все, ты бездарность, иди уроки учи!");
            }
        }


    }
}
