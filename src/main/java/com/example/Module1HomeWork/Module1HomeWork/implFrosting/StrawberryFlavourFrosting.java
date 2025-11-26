package com.example.Module1HomeWork.Module1HomeWork.implFrosting;

import com.example.Module1HomeWork.Module1HomeWork.FrostingType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
@Component
//@Qualifier("StrawberryFrost")
@ConditionalOnProperty(name = "Frost", havingValue = "StrawberryFrost")
public class StrawberryFlavourFrosting implements FrostingType {

    @Override
    public String getFrosting() {
        System.out.println("i am from class StrawberryFlavourFrosting");
        return "Strawberry Frosting";
    }
}
