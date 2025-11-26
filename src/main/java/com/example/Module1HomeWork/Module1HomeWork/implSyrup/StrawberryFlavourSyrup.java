package com.example.Module1HomeWork.Module1HomeWork.implSyrup;

import com.example.Module1HomeWork.Module1HomeWork.SyrupType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("StrawberrySyrup")
public class StrawberryFlavourSyrup implements SyrupType {
    @Override
    public String getSyrup() {
        System.out.println("i am from class StrawberryFlavourSyrup");
        return "Strawberry   syrup";
    }
}
