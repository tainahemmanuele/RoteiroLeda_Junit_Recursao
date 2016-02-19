package vetor;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class VetorTest {

	// vetor = null;
	Vetor<Aluno> vetor;
	Aluno ze;
	Aluno joao;
	Aluno pedro;
	Aluno laila;
	Aluno maria;

	private void setUp() {
		vetor = new Vetor<Aluno>(5);
		this.ze = new Aluno("Ze", 9.5);
		this.joao = new Aluno("Joao", 8.5);
		this.pedro = new Aluno("Pedro", 5);
		this.laila = new Aluno("Laila", 10);
		this.maria = new Aluno("Maria", 7.5);
		vetor.inserir(ze);
		vetor.inserir(joao);
		vetor.inserir(pedro);
		vetor.inserir(laila);
		vetor.inserir(maria);

		// TODO Auto-generated method stub

	}

	@Test
	public void testInserir() {
		try{

		vetor.inserir(joao);
		Assert.fail();
		}catch(Exception e){
			//Assert.fail();
		}

	}

	@Test
	public void testRemover() {
		try{
			Assert.assertTrue(vetor.size()==5);
			vetor.remover(joao);
			Assert.assertTrue(vetor.size()==4);
			Assert.assertNull(vetor.procurar(joao));
		}catch (Exception e){
			
		}
	}

	@Test
	public void testProcurar() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsVazio() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsCheio() {
		fail("Not yet implemented");
	}

}
