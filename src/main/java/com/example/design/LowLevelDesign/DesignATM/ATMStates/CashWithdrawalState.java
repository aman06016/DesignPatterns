package com.example.design.LowLevelDesign.DesignATM.ATMStates;
import com.example.design.LowLevelDesign.DesignATM.ATM;
import com.example.design.LowLevelDesign.DesignATM.AmountWithdrawal.CashWithdrawProcessor;
import com.example.design.LowLevelDesign.DesignATM.AmountWithdrawal.FiveHundredWithdrawProcessor;
import com.example.design.LowLevelDesign.DesignATM.AmountWithdrawal.OneHundredWithdrawProcessor;
import com.example.design.LowLevelDesign.DesignATM.AmountWithdrawal.TwoThousandWithdrawProcessor;
import com.example.design.LowLevelDesign.DesignATM.Card;
import com.example.design.LowLevelDesign.DesignATM.TransactionType;

public class CashWithdrawalState extends ATMState {

    public CashWithdrawalState() {
        System.out.println("Please enter the Withdrawal Amount");
    }

    public void cashWithdrawal(ATM atmObject, Card card, int withdrawalAmountRequest) {

        if (atmObject.getAtmBalance() < withdrawalAmountRequest) {
            System.out.println("Insufficient fund in the ATM Machine");
            exit(atmObject);
        } else if (card.getBankBalance() < withdrawalAmountRequest) {
            System.out.println("Insufficient fund in the your Bank Account");
            exit(atmObject);
        } else {

            card.deductBankBalance(withdrawalAmountRequest);
            atmObject.deductATMBalance(withdrawalAmountRequest);

            //using chain of responsibility for this logic, how many 2k Rs notes, how many 500 Rs notes etc, has to be withdrawal
            CashWithdrawProcessor withdrawProcessor =
                    new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));

            withdrawProcessor.withdraw(atmObject, withdrawalAmountRequest);
            exit(atmObject);
        }
    }

    @Override
    public void exit(ATM atmObject) {
        returnCard();
        atmObject.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }
}
