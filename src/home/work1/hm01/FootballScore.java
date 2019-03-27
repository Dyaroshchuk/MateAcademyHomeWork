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
<<<<<<< HEAD
=======

>>>>>>> Home_Work_2
    private static int resultFootballMatch(int firstTeamScore, int secondTeamScore,
                                           int firstTeamBetScore, int secondTeamBetScore) {
        int score = firstTeamScore == firstTeamBetScore && secondTeamScore == secondTeamBetScore
                ? 2 : (firstTeamScore > secondTeamScore && firstTeamBetScore > secondTeamScore)
<<<<<<< HEAD
                || (firstTeamScore < secondTeamScore && firstTeamBetScore < secondTeamBetScore)
                ? 1 : 0;
=======
                || (firstTeamScore < secondTeamScore && firstTeamBetScore < secondTeamBetScore) ? 1 : 0;
>>>>>>> Home_Work_2
        return score;
    }

    public static void main(String[] args) {
        System.out.println(resultFootballMatch(2, 4, 3, 2)); // result 0
        System.out.println(resultFootballMatch(2, 1, 2, 1)); // result 2
        System.out.println(resultFootballMatch(2, 5, 1, 3)); // result 1
        System.out.println(resultFootballMatch(2, 2, 2, 2)); // result 2
<<<<<<< HEAD
=======

>>>>>>> Home_Work_2
    }
}
