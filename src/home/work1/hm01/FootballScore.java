package home.work1.hm01;


/**
 * С помощью тернарного оператора написать функцию, которая будет считать исход матча.
 * Метод будет принимать 4 параметра и возвращать целое число. Футбольный матч.
 * 4 параметра метода - результат матча и то, что поставил пользователь. Пример: 0,2,1,1.
 * Что значит: команды сыграли в счёт 0:2, а пользователь ставил 1:1.
 * Задача: если пользователь угадал 100% результат - возвращать 2,
 * если угадал, что выиграла какая-либо команда
 * (пр. сыграли 1:2, а ставил 0:3 - то пользователь у выиграше),
 * то возвращать 1, если не угадал ничего - возвращать 0.
 */

public class FootballScore {

    private static int resultFootballMatch(int factS1, int factS2, int planScore1, int planScore2) {
        int score = factS1 == planScore1 && factS2 == planScore2 ? 2 :
                    (factS1 > factS2 && planScore1 > factS2)
                    || (factS1 < factS2 && planScore1 < planScore2) ? 1 : 0;
        return score;
    }

    public static void main(String[] args) {

        System.out.println(resultFootballMatch(2, 4, 3, 2)); // result 0
        System.out.println(resultFootballMatch(2,1,2,1)); // result 2
        System.out.println(resultFootballMatch(2,5,1,3)); // result 1
        System.out.println(resultFootballMatch(2,2,2,2)); // result 2

    }
}
