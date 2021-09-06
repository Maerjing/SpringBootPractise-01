package com.bilibili.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

interface Person {
    void useAxe();
}

interface Axe {
    void chop();
}

@Component
class StoneAxe implements Axe {
    @Override
    public void chop() {
        System.out.println("使用石斧砍!");
    }
}

class SteelAxe implements Axe {
    @Override
    public void chop() {
        System.out.println("使用钢斧砍!");
    }
}

@Component
class Chinese implements Person {
    private Axe axe;

    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    @Override
    public void useAxe() {
        axe.chop();
    }
}

public class Ioc {
    @Autowired
    static Chinese chinese = new Chinese();

    public static void main(String[] args) {

        StoneAxe stoneAxe = new StoneAxe();
        chinese.setAxe(stoneAxe);
        chinese.useAxe();
    }
}
