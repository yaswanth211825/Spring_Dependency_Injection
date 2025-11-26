package com.example.Module1HomeWork.Module1HomeWork.implSyrup;

import com.example.Module1HomeWork.Module1HomeWork.SyrupType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("ChocolateSyrup")
@ConditionalOnProperty(name = "Syrup", havingValue = "ChocolateSyrup")
public class ChocolateFlavourSyrup implements SyrupType {

    @Override
    public String getSyrup() {
        System.out.println("i am from class ChocolateFlavourSyrup");
        return "Chocolate Syrup";
    }
}
