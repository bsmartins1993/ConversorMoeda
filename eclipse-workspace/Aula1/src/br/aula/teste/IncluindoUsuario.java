package br.aula.teste;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.aula.db.HibernateFactory;
import br.aula.model.Usuario;

public class IncluindoUsuario {

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

		Usuario usuario = new Usuario();
		usuario.setUsername("Bruno");
		usuario.setEmail("bsm@email");
		usuario.setPassword("abc1234");
		Transaction t = s.beginTransaction();
		s.save(usuario);
		t.commit();
	
}

}
