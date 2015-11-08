package tdd.exercicios.integracaobd;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UsuarioDaoTest {
	private Session session;
	private UsuarioDao dao;
	
	@Before
	public void setUp() {
		session = new CriadorDeSessao().getSession();
		session.beginTransaction();
		dao = new UsuarioDao(session);
	}
	
	@After
	public void tearDown() {
		session.getTransaction().rollback();
		session.close();
	}

	@Test
	public void buscaPorNomeEmail() {
		Usuario usuario = new Usuario("Douglas", "douglas.japiassu@gmail.com");
		session.save(usuario);
		
		Usuario usuarioDoBanco = dao.porNomeEEmail("Douglas", "douglas.japiassu@gmail.com");
		
		assertEquals(usuario, usuarioDoBanco);
	}

}
