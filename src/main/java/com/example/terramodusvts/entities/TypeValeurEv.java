package com.example.terramodusvts.entities;

public enum TypeValeurEv{

    Vénale("Vénale"),Locative("Locative"),LocativeVénale("Vénale et Locative");
    private String abreviation;

    TypeValeurEv (String abreviation) {
        this.abreviation = abreviation;
    }

    public String getAbreviation() {
        return  this.abreviation ;
    }
}