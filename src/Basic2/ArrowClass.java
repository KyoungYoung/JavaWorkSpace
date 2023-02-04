package Basic2;

import java.util.Arrays;

public class ArrowClass {
    public static void main(String[] args) {
        Player kim = new Player("kim",new int[]{9,8,10});
        Player hyeon = new Player("hyeon",new int[] {10,10,10});
        Player lee = new Player("lee",new int[]{9,8,9});


        System.out.printf("%s의 종합점수는 %d점\n",kim.name,kim.totalScore());
        System.out.printf("%s의 종합점수는 %d점\n",hyeon.name,hyeon.totalScore());
        System.out.printf("%s의 종합점수는 %d점\n",lee.name,lee.totalScore());


        Player[] koreanTeam = {kim, hyeon, lee};
        Team korea = new Team("korea", koreanTeam);
        System.out.printf("%s의 전체 점수는 %d점\n", korea.countryTeam(), korea.totalCountryScore());
    }
}

class Team {
    String country;
    Player[] countryPlayer;

    Team(String c, Player[] countryP) {
        country = c;
        countryPlayer = countryP;
    }

    String countryTeam() {
        for (int i = 0; i < countryPlayer.length; i++) {
            System.out.print(countryPlayer[i]);
        }
        return null;
    }
    int totalCountryScore() {
        int sum = 0;
        for (int i = 0; i < countryPlayer.length; i++) {
            sum += countryPlayer[i].totalScore();
        }
        return sum;
    }
}

class Player {
    String name;
    int[] score;

    Player(String n, int[] s) {
        name = n;
        score = s;
    }

    int totalScore() {
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        return sum;
    }


}