package com.example.Module1HomeWork.Module1HomeWork.implFrosting;

import com.example.Module1HomeWork.Module1HomeWork.FrostingType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("ChocolateFrost")
@ConditionalOnProperty(name = "Frost", havingValue = "ChocolateFrost")
public class ChocolateFlavourFrosting implements FrostingType {
    @Override
    public String getFrosting() {
        System.out.println("i am from class ChocolateFlavourFrosting");
        return "Chocolate Frosting";
    }
//    System.out.println("hi");
}
