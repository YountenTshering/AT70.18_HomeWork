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
}

    @Transactional
    @Async
    public void readLockTransaction() throws InterruptedException {

        System.out.println(LocalTime.now() + " <-- Reading Product entity -->");

        Product product1 = null;
        try {
            product1 = pDao.findProductForRead(1L);
        } catch (Exception e) {
            System.err
                    .println(LocalTime.now() + " -- Got exception while " + "acquiring the read lock:\n " + e + " --");
            return;
        }

        System.out.println(LocalTime.now() + " -- Acquired the read lock --");

        System.out.println(LocalTime.now() + " -- Read product: " + product1 + " --");

        // Thread.sleep(10000);

        Thread.sleep(2000);

    }

    @Transactional
    @Async
    public void writeLockTransaction() throws InterruptedException {

        Thread.sleep(100);

        System.out.println(LocalTime.now() + " <-- Writing Product entity -->");

        Product product2 = null;
        try {
            product2 = pDao.findProductForWrite(1L);
        } catch (Exception e) {
            System.err
                    .println(LocalTime.now() + " -- Got exception while " + "acquiring the write lock:\n " + e + " --");
            return;
        }

        System.out.println(LocalTime.now() + " -- Acquired write lock --");
        product2.setName("New name");
        pDao.save(product2);

        System.out.println(LocalTime.now() + " -- User 2 updated product: " + product2 + " --");
    }
}}