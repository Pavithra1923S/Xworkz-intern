package com.xworkz.supermarket.supermarket;

import com.xworkz.supermarket.section.Section;

public class SuperMarket
{
   public int superMarketId;
    public String location;
    public String superMarketName;
    public String branches[];
   public Section[] section;

    public void getSuperMarketInfo(){
        System.out.println("superMarket Id :" +superMarketId);
        System.out.println("superMarket Name :" + superMarketName);
        System.out.println("location : bangalore" );
        for(String branch : branches)
            System.out.println("branches :" +branch);
        for(Section sect : section)
            sect.getInfo();
    }

}
