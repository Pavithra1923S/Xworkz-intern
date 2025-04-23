package com.xworkz.method.ola;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OlaDto {

private String name;
private String mailId;
private long phno;
private char gender;
private String location;

public String toString(){
    return "oladto :- \n name :" +name + "\n mailId :" +mailId + "\n phno :" + phno+ "\n gender :" + gender + "\n location" + location;
}
}
