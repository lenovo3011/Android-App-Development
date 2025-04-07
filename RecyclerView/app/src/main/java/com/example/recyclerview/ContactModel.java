package com.example.recyclerview;

public class ContactModel

{

    int img  ;
    String name , number, index ;


    public ContactModel (int image , String name , String number, String index ) {
        this.img = image ;
        this.name = name ;
        this.number  = number ;
        this.index = index ;


    }

    public ContactModel ( String name , String number, String index ) {
        this.name = name ;
        this.number  = number ;
        this.index = index ;


    }
}
