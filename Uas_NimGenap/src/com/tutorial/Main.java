package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // objek
        Member member1 = new Member("Kaito", 600_000);
        Member member2 = new Member("Alice", 400_000);

        nonMember nonMember1 = new nonMember("Naruto", 70_000);
        nonMember nonMember2 = new nonMember("Hinata", 250_000);

        member1.showDetailBelanja();
        member2.showDetailBelanja();

        nonMember1.showDetailBelanja();
        nonMember2.showDetailBelanja();

    }
}
