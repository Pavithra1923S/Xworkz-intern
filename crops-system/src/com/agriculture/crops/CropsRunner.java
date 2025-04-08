package com.agriculture.crops;

import com.agriculture.crops.crops.Crops;

public class CropsRunner {
    public static void main(String[] args) {
        Crops crop1 = new Crops();
        crop1.setName("Wheat");
        crop1.setType("Cereal");
        crop1.setSeason("Rabi");
        crop1.setAreaInAcres(3.5);
        crop1.setYieldPerAcre(20.0);
        crop1.setIrrigated(true);
        crop1.setMarketPricePerQuintal(2300);

        Crops crop2 = new Crops();
        crop2.setName("Paddy");
        crop2.setType("Cereal");
        crop2.setSeason("Kharif");
        crop2.setAreaInAcres(5.0);
        crop2.setYieldPerAcre(22.5);
        crop2.setIrrigated(true);
        crop2.setMarketPricePerQuintal(2100);

        Crops crop3 = new Crops();
        crop3.setName("Cotton");
        crop3.setType("Commercial");
        crop3.setSeason("Kharif");
        crop3.setAreaInAcres(4.2);
        crop3.setYieldPerAcre(12.8);
        crop3.setIrrigated(false);
        crop3.setMarketPricePerQuintal(6000);

        Crops crop4 = new Crops();
        crop4.setName("Sugarcane");
        crop4.setType("Commercial");
        crop4.setSeason("Annual");
        crop4.setAreaInAcres(6.0);
        crop4.setYieldPerAcre(40.0);
        crop4.setIrrigated(true);
        crop4.setMarketPricePerQuintal(3200);

        Crops crop5 = new Crops();
        crop5.setName("Maize");
        crop5.setType("Cereal");
        crop5.setSeason("Zaid");
        crop5.setAreaInAcres(2.5);
        crop5.setYieldPerAcre(18.0);
        crop5.setIrrigated(false);
        crop5.setMarketPricePerQuintal(1900);

        crop1.details();
        crop2.details();
        crop3.details();
        crop4.details();
        crop5.details();
    }
}