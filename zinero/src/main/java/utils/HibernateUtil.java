package utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	public static final SessionFactory factory = createSessionFactory();
	//final 只會一次
	
	
	
	private static SessionFactory createSessionFactory() {
		StandardServiceRegistry  registry = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		return sessionFactory;
	}
	
	public static SessionFactory getSessionFactory(){
		return factory;
	}
	
	public static void closeSessionFactory() {
		if(factory!= null);
		factory.close();
	}
	
}
