package br.aula.teste;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.aula.db.HibernateFactory;
import br.aula.model.Autor;


public class IncluindoAutor {

	public static void main(String[] args) {
		
		/*Parametros antes de ser criada a Classe HibernateFactory*/
		
		/*Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
	    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		Session s = sessionFactory.openSession();*/
		
		Session s = HibernateFactory
									.configureSessionFactory()
									.openSession();

		Autor autor = new Autor();
		autor.setNome("Paulo Coelho");
		
		Transaction t = s.beginTransaction();
		s.save(autor);
		t.commit();
	}
	
}
