package com.test;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.pack.PaymentMst;

public class HibernateTest {

	private SessionFactory factory = null;

	@BeforeClass
	public void setup() {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
	}

	@Test
	public void savePayment() {
		PaymentMst pay = new PaymentMst();
		pay.setId(1);
		pay.setBank("hdfc bank");
		pay.setCard("debit card");
		pay.setCcv(123);
		pay.setEmail("jik@gmail.com");
		PaymentMst pay1 = new PaymentMst();
		pay1.setId(2);
		pay1.setBank("icici bank");
		pay1.setCard("credit card");
		pay1.setCcv(231);
		pay1.setEmail("kij@gmail.com");
		Transaction transaction = null;

		try (Session session = factory.openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the payment objects
			session.save(pay);
			session.save(pay1);

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	@SuppressWarnings({ "unchecked", "unused" })
	@Test(dependsOnMethods = "savePayment")
	public void readPayment() {
		Transaction transaction = null;
		try (Session session = factory.openSession()) {

			@SuppressWarnings("rawtypes")
			List payments = session.createQuery("from Payment").list();

			payments.forEach(p -> System.out.println(((PaymentMst) p).getId()));
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

	}
}
