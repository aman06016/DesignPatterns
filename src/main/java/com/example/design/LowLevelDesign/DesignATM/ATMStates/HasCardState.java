package com.example.design.LowLevelDesign.DesignATM.ATMStates;

import com.example.design.LowLevelDesign.DesignATM.ATM;
import com.example.design.LowLevelDesign.DesignATM.Card;
import com.example.design.LowLevelDesign.DesignATM.TransactionType;
public class HasCardState extends ATMState{

    public HasCardState(){
        System.out.println("enter your card pin number");
    }

    @Override
    public void authenticatePin(ATM atm, Card card, int pin){
        boolean isCorrectPinEntered = card.isCorrectPINEntered(pin);

        if(isCorrectPinEntered) {
            atm.setCurrentATMState(new SelectOperationState());
        } else {
            System.out.println("Invalid PIN Number");
            exit(atm);
        }
    }

    @Override
    public void exit(ATM atm){
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard(){
        System.out.println("Please collect your card");
    }
}
