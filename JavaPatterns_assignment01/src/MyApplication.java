import entities.bases.Hero;
import entities.types.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {

    private Scanner sc = new Scanner(System.in);

    public void start() {

        System.out.println("Hello, welcome to the Aliya's assignment");

        while(true) {

            System.out.println("You can choose one of the given 5 heroes:");
            System.out.println("1. Drow Ranger");
            System.out.println("2. Invoker");
            System.out.println("3. Legion Commander");
            System.out.println("4. Templar Assassin");
            System.out.println("5. Troll Warlord");
            System.out.println("0. Exit");
            System.out.println();

            try {
                System.out.println("Enter option (1-5): ");
                int option = sc.nextInt();
                if (option == 1) {
                    getDrowRanger();
                } else if (option == 2) {
                    getInvoker();
                } else if (option == 3) {
                    getLegionCommander();
                } else if (option == 4) {
                    getTemplarAssassin();
                } else if (option == 5) {
                    getTrollWarlord();
                }else {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Input must be integer!!!");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("=======================================");
        }
    }

    public void getDrowRanger() {
        Hero HeroDrowRanger = new HeroDrowRanger();

        HeroDrowRanger.display();
        HeroDrowRanger.response();
        HeroDrowRanger.performAttribute();
        HeroDrowRanger.performAttackType();
        HeroDrowRanger.performComplexity();
    }

    public void getInvoker() {
        Hero HeroInvoker = new HeroInvoker();

        HeroInvoker.display();
        HeroInvoker.response();
        HeroInvoker.performAttribute();
        HeroInvoker.performAttackType();
        HeroInvoker.performComplexity();
    }

    public void getLegionCommander() {
        Hero HeroLegionCommander = new HeroLegionCommander();

        HeroLegionCommander.display();
        HeroLegionCommander.response();
        HeroLegionCommander.performAttribute();
        HeroLegionCommander.performAttackType();
        HeroLegionCommander.performComplexity();
    }

    public void getTemplarAssassin() {
        Hero HeroTemplarAssassin = new HeroTemplarAssassin();

        HeroTemplarAssassin.display();
        HeroTemplarAssassin.response();
        HeroTemplarAssassin.performAttribute();
        HeroTemplarAssassin.performAttackType();
        HeroTemplarAssassin.performComplexity();
    }

    public void getTrollWarlord() {
        Hero HeroTrollWarlord = new HeroTrollWarlord();

        HeroTrollWarlord.display();
        HeroTrollWarlord.response();
        HeroTrollWarlord.performAttribute();
        HeroTrollWarlord.performAttackType();
        HeroTrollWarlord.performComplexity();
    }
}
