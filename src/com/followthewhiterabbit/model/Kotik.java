package com.followthewhiterabbit.model;

public class Kotik {

    private int prettines;
    private String name;
    private int weight;
    private String meow;


    private static int countCreatedCats;
    private int levelSatiety;

    public Kotik() {
        this.prettines = 0;
        this.name = null;
        this.weight = 0;
        this.meow = null;
        countCreatedCats++;
    }

    public Kotik(int prettiness, String name, int weight, String meow) {
        this.prettines = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        countCreatedCats++;
    }

    public static int getCountCreatedCats() {
        return countCreatedCats;
    }

    public int getPrettines() {
        return prettines;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getMeow() {
        return meow;
    }

    public void setKotik(int prettiness, String name, int weight, String meow) {
        this.prettines = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        this.levelSatiety = 0;
    }

    public boolean play() {
        if (isHungry()) {
            levelSatiety--;
            System.out.println(name + ", поиграл!");
            return true;
        } else {
            System.out.println(name + ", хочет есть!");
            return false;
        }
    }

    public boolean sleep() {
        if (isHungry()) {
            levelSatiety--;
            System.out.println(name + ", поспал!");
            return true;
        } else {
            System.out.println(name + ", хочет есть!");
            return false;
        }
    }

    public boolean chaseMouse() {
        if (isHungry()) {
            levelSatiety--;
            System.out.println(name + ", поймал мышь!");
            return true;
        } else {
            System.out.println(name + ", хочет есть!");
            return false;
        }
    }

    public boolean run() {
        if (isHungry()) {
            levelSatiety--;
            System.out.println(name + ", побегал!");
            return true;
        } else {
            System.out.println(name + ", хочет есть!");
            return false;
        }
    }

    public boolean destroy() {
        if (isHungry()) {
            levelSatiety--;
            System.out.println(name + ", сломал!");
            return true;
        } else {
            System.out.println(name + ", хочет есть!");
            return false;
        }
    }

    public void eat(int countFood) {
        this.levelSatiety = +countFood;
    }

    public void eat(int countFood, String nameFood) {
        this.levelSatiety = +countFood;
    }

    public void eat() {
        eat(5, "Meat");
    }

    /**
     * @return указывает, хочет ли кот кушать.
     */
//    public boolean isHungry() {
//        if (this.levelSatiety >= 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    // проверка голоден ли кот (реализация Ксении Кленковой)
    public boolean isHungry() {
        return levelSatiety <= 0;
    }

    public void liveAnotherDay() {
        int i = 1;
        boolean check = false;
        while (i < 24) {
            if (check) {
                i++;
            }
            int random = (int) (Math.random() * 5 + 1);
            if (isHungry()) {
                switch (random) {
                    case 1:
                        check = play();
                        break;
                    case 2:
                        check = sleep();
                        break;
                    case 3:
                        check = chaseMouse();
                        break;
                    case 4:
                        check = run();
                        break;
                    case 5:
                        check = destroy();
                        break;
                }
            } else {
                check = false;
                eat();
            }
        }
    }
}