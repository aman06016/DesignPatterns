package com.example.design.LowLevelDesign.DesignATM.ATMStates;

import com.example.design.LowLevelDesign.DesignATM.ATM;
import com.example.design.LowLevelDesign.DesignATM.Card;
import com.example.design.LowLevelDesign.DesignATM.TransactionType;

public class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}
