># ORM, Hibernate, JPA, and Spring

For setup follow the link:
https://github.com/YountenTshering/AT70.18_HomeWork/tree/master/Lab3_guide

># Take-home tasks

>## a. Set the employee cache to **20 seconds**, and run the test again.  Look at testCache.  What happens?  Document your findings.
Set the cache time in ehcache.xml as follow:

![alt](ORM/image/6.PNG)

We can notice that after the fetching, The testcache: does not load the entities since the cache time is more the sleep time (10 sec). Therefore, the cache is empty and entities are not loaded in cache.

![alt](ORM/image/7.PNG)

>## b. Attempt to change the code, so that User table has the **foreign key** of Employee


>## c. Research and discuss the difference between **cascade.REMOVE and orphanRemoval=true** (use your own words)

**CascadeType.REMOVE** is a way to delete a child entity or entities whenever the deletion of its parent happens.
**orphanRemoval=true** is delete orphaned entities from the database. An entity that is no longer attached to its parent is the definition of being an orphan.
**Example:**
When an Employee entity object is removed the remove operation is cascaded to the referenced Address entity object. In this regard, orphanRemoval=true and cascade=CascadeType.REMOVE are identical, and if orphanRemoval=true is specified, CascadeType.REMOVE is redundant. 

The difference between the two settings is in the response to disconnecting a relationship. For example, such as when setting the address field to null or to another Address object. If orphanRemoval=true is specified the disconnected Address instance is automatically removed. This is useful for cleaning up dependent objects (e.g. Address) that should not exist without a
reference from an owner object (e.g. Employee). If only cascade=CascadeType.REMOVE is specified no automatic action is taken since disconnecting a relationship is not a remove operation.

If User has one-to-many relation to Comment. If you are using cascade="remove", you can remove the reference for Comment from one User, and then attach that Comment to another User. When you persist them, they will be correctly saved. But if you are using orphanRemoval=true, even if you will remove given Comment from one User, and then attach to another User, this comment will be deleted during persist, because the reference has been deleted.

>## d. **Remove lazy load** from addresses and benefits, run the testFetch function. What happens?  Document your findings.

![alt](ORM/image/1.PNG)

There is no change in the output or while testfetch. Since the fetch and load is done within time to live.


>## e. **Remove cascade = cascadeType.ALL and orphanRemoval = true from benefits and addresses**, run the testCascadeRemove and testCascadePersist function.  What happens?  Document your findings.

![alt](ORM/image/2.PNG)

Application runs till persist and address.java throw exception

![alt](ORM/image/3.PNG)
Data in leave table is not inserted (testCreateLeave) since there was no relationship address.

![alt](ORM/image/4.PNG)

Since the apllication ran till persist and didnot reached testCascadeRemove, the admin Younten is still inside table.

![alt](ORM/image/5.PNG)


>## f. **Attempt to remove @Transactional** from any of the methods defined in the TestService.java.  There are some errors.  Explain why such an error happens.


>## g. Coding: **Transform** my main program test into unit test


>## h. Coding: Attempt to extend the app so that user can apply sick leave or annual leave (do not make any fancy thing, simply add leave), and admin can approve leave.