package com.szymm;

public class CustomClass {
    private final int apples;

    public CustomClass(int apples) {
        this.apples = apples;
    }

    public int getApples() {
        return this.apples;
    }

    public static void main(String[] args) {
        CustomClass customClass = new CustomClass(5);
        System.out.println(customClass.getApples());
    }
}
