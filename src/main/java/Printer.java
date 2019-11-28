/*
 * @(#)Printer.java
 *
 * v 0.0.0
 *
 * 2019.11.28
 *
 * Copyright 2019. DunDung all rights reserved.
 */

public class Printer {
    private static final int COMPARE_VALUE = 0;

    public static void printInputNumber() {
        System.out.print("숫자를 입력해주세요.: ");
    }

    public static void printAnswerText() {
        System.out.println(NumberBaseBallGame.DIGIT + "개의 숫자를 모두 맞히셨습니다! 게임종료");
    }

    public static void printHint(NumberBaseBallGame aNumberBaseBallGame) {
        if (aNumberBaseBallGame.getStrike() == NumberBaseBallGame.DIGIT) {
            return;
        }

        StringBuilder builder = new StringBuilder();
        if (aNumberBaseBallGame.getStrike() > COMPARE_VALUE) {
            builder.append(aNumberBaseBallGame.getStrike()+" 스트라이크 ");
        }
        if (aNumberBaseBallGame.getBall() > COMPARE_VALUE) {
            builder.append(aNumberBaseBallGame.getBall()+"볼");
        }
        if (builder.length() == COMPARE_VALUE) {
           builder.append("낫싱") ;
        }

        System.out.println(builder.toString());
    }

    public static void printMenu() {
        System.out.println("게임을 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public static void printError() {
        System.out.println("입력이 올바르지 않습니다. 다시 입력해주세요.");
    }
}
