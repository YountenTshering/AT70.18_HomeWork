package com.example.DomainModelRR.strategy;

import com.example.DomainModelRR.model.Contract;

public class CompleteRecognitionStrategy implements RecognitionStrategy {

    @Override
    public void calculateRevenueRecognitions(Contract contract) {
        contract.addRevenueRecognition(contract.getRevenue(), contract.getDateSigned());
    }

}