package com.followthewhiterabbit;

import com.followthewhiterabbit.model.Kotik;

public class Main {

    public static void main(String[] args) {

        Kotik kotik1 = new Kotik(3, "Barsik", 7, "Aaaa");
        Kotik kotik2 = new Kotik();
        kotik2.setKotik(9, "Kiska", 3, "Myats");

        //kotik2.sleep();
        kotik1.liveAnotherDay();
        //kotik2.liveAnotherDay();

        System.out.println("Котика зовут - " + kotik1.getName());
        System.out.println("Котика весит - " + kotik1.getWeight() + " кг");

        if (kotik1.getMeow().equals(kotik2.getMeow())) {
            System.out.println("Котики разговаривают одинаково, говорят - " + kotik1.getMeow());
        } else {
            System.out.println("Котоки говорят по-разному, " + kotik1.getName() + " говорит - " + kotik1.getMeow() + " ,а " + kotik2.getName() + " говорит - " + kotik2.getMeow());
        }

        System.out.println("Количество котиков - " + Kotik.getCountCreatedCats());
    }
}