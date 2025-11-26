package com.example.Module1HomeWork.Module1HomeWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBake {
    final private FrostingType frostingType;
    final private SyrupType syrupType;
    public CakeBake(@Qualifier("ChocolateFrost") FrostingType frostingType, @Qualifier("ChocolateSyrup")SyrupType syrupType) {
        this.frostingType = frostingType;
        this.syrupType = syrupType;
    }
    public  void bakeCake(){
        System.out.println("I am from Class CakeBake");
        System.out.println(" A cake with " + frostingType.getFrosting() + " and " + syrupType.getSyrup() +" is  being made for you");
    }
}
