package com.example.FinalExam.services;

public interface PurchaseService {
    void purchaseProduct(int productID, String amount);

    void purchaseProductWriteLock(String threadNo, int productID, String amount) throws InterruptedException;
}
