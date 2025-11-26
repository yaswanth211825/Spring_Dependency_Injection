package com.example.Module1HomeWork.Module1HomeWork.implFrosting;

import com.example.Module1HomeWork.Module1HomeWork.FrostingType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ChocolateFrost")
public class ChocolateFlavourFrosting implements FrostingType {
    @Override
    public String getFrosting() {
        System.out.println("i am from class ChocolateFlavourFrosting");
        return "Chocolate Frosting";
    }
//    System.out.println("hi");
}
