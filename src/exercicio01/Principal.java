package exercicio01;

import java.awt.List;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Lanche l1 = new Lanche();
		Lanche l2 = new Lanche();
		l1.setPreco(100);
		l2.setPreco(20);
		
		MaquinaDeVenderLanches m1 = new MaquinaDeVenderLanches();
		
		m1.setLanche(l1);
		m1.venderLanche(110);
		m1.venderLanche(110);
		
		m1.setLanche(l2);
		m1.venderLanche(10);
		m1.getValorTotal();
		
		
		

		
	}

}
