/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.homefinances.domain;

import java.math.BigDecimal;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import ua.homefinances.domain.Authenification;
import ua.homefinances.domain.BankCardUnit;

/**
 *
 * @author Калько Евгений
 */
public class Driver {
    
    public static void main(String[] args) {
        
        Authenification test = new Authenification("test fn", "Test ln", "test patr", "test".hashCode());
        BankCardUnit test3 = new BankCardUnit(test, "test", BigDecimal.valueOf(10.2), BigDecimal.valueOf(10.2), BigDecimal.valueOf(10.2), "test");
        BankCardUnit test5 = new BankCardUnit(test, "test", BigDecimal.valueOf(10.2), BigDecimal.valueOf(10.2), BigDecimal.valueOf(10.2), "test");
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("finance_prog_DB");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        //manager.persist(test);
        //manager.persist(test5);
        //tx.commit();
        Authenification test2 = manager.find(Authenification.class, new Long(1));
        BankCardUnit test4 = manager.find(BankCardUnit.class, new Long(3));
        manager.close();
        
        System.out.println(test2.getFirstName());
        System.out.println(test4.getName());
        System.out.println(test4.equals(test5));
        
    }
    
}
