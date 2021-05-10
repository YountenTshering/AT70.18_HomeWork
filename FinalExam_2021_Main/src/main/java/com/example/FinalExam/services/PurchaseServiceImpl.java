package com.example.FinalExam.services;

import java.time.LocalTime;

import javax.transaction.Transactional;

import com.example.FinalExam.dao.ProductDao;
import com.example.FinalExam.models.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private ProductDao pDao;

    @Override
    @Transactional
    @Async
    public void purchaseProduct(int productID, String amount) {
        Product product = pDao.getOne(productID);
        product.setStock(product.getStock() - Integer.parseInt(amount));
        pDao.save(product);
    }

    // Check for Optimistic Locking

    try

    {
        pDao.save(new);
        LOGGER.info("SUCCESSFUL: Amount: {}", new.getPrice());
    }catch(
    ObjectOptimisticLockingFailureException e)
    {
        LOGGER.error("Optimistic Lock Exception Occurred: {}", e.getLocalizedMessage());
        if (new.getPrice() > getLatest(product).getPrice()) {
            // If unsuccessful bid is greater than previously updated, then try again to
            // save
            save(newBid, new.getProduct(), new.getUser());
        }
    }

    @Override
    @Transactional
    @Async
    public void purchaseProductWriteLock(String threadNo, int productID, String amount) throws InterruptedException {

        Product product2 = null;

        try {
            product2 = pDao.findProductForWrite(productID);
        } catch (Exception e) {
            
        }

       }

}