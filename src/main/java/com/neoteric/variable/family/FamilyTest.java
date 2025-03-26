package com.neoteric.variable.family;



public class FamilyTest {
    public static void main(String[] args) {


        Son son = new Son();
        son.sonName = "John";

        Father father = new Father();
        father.fatherName = "Michael";
        father.son = son;

        GrandFather grandFather = new GrandFather();
        grandFather.grandFatherName = "Robert";
        grandFather.father = father;

        GreateGrandFather greatGrandFather = new GreateGrandFather();
        greatGrandFather.GreatGrandFatherName = "William";
        greatGrandFather.grandFather = grandFather;

        System.out.println( );



        FamilyTree familyTree= new FamilyTree();
        familyTree.name="rakesh";
        familyTree.age=24;
        familyTree.fatherName="srinias";

        FamilyTree father1= new FamilyTree();
        father1.name="rakesh";
        father1.age=24;



        FamilyTree garndfather= new FamilyTree();
        garndfather.name="rakesh";
        garndfather.age=24;





    }
}
