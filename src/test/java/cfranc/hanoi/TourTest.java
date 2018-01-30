package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	@Test
	public void test() {
            
            //Test aux limites des classes valides 
            //Test Disque = 1 tour vide
            Tour tour1 = new Tour();
            Disque disque1 = new Disque(1);
            boolean resEmpile = tour1.empiler(disque1);
            assertTrue("Un disque de taille 1 n'a pas pu être empilé sur une tour vide", resEmpile);
            
            //Test Disque = MAX_VALUE tour vide
            Tour tour2 = new Tour();
            Disque disque2 = new Disque(Integer.MAX_VALUE);
            resEmpile = tour2.empiler(disque2);
            assertTrue("Un disque de taille max n'a pas pu être empilé sur une tour vide", resEmpile);
            
            
            //Test aux limites des classes invalides
            //Test Disque <= 0 tour vide
            Tour tour3 = new Tour();
            Disque disque3 = new Disque(0);
            resEmpile = tour3.empiler(disque3);
            assertFalse("Un disque de taille nulle/négative a pas pu être empilé sur une tour vide", resEmpile);
            
            //Test Disque > MAX_VALUE tour vide
            Tour tour4 = new Tour();
            Disque disque4 = new Disque(Integer.MAX_VALUE+1);
            resEmpile = tour4.empiler(disque4);
            assertFalse("Un disque de taille superieur a MAX_VALUE a pas pu être empilé sur une tour vide", resEmpile);
            
            
            //Test aux limites classes valides
            //Test Disque = 1 tour rempli
            Tour tour5 = new Tour();
            Disque disqueBase1 = new Disque(4);
            Disque disqueBase2 = new Disque(3);
            tour5.empiler(disqueBase1);
            tour5.empiler(disqueBase2);
            Disque disque5 = new Disque(1);
            resEmpile = tour5.empiler(disque5);
            assertTrue("Un disque de taille 1 n'a pas pu être empilé sur une tour contenant 2 disques", resEmpile);
            
            //Test Disque = dernierDisque - 1 tour rempli
            Tour tour6 = new Tour();
            tour6.empiler(disqueBase1);
            tour6.empiler(disqueBase2);
            Disque disque6 = new Disque(disqueBase2.d-1);
            resEmpile = tour6.empiler(disque6);
            assertTrue("Un disque de taille inferieur a dernier disque n'a pas pu être empilé sur une tour contenant 2 disques", resEmpile);
            
            //Test aux limites classes invalides
            //Test Disque <= 0 tour rempli
            //Pas très utile sachant que un disque ne peut jamais être nul ou négatif peut importe si la tour est vide ou non
            Tour tour7 = new Tour();
            tour7.empiler(disqueBase1);
            tour7.empiler(disqueBase2);
            Disque disque7 = new Disque(0);
            resEmpile = tour7.empiler(disque7);
            assertFalse("Un disque de taille nulle/negative a pas pu être empilé sur une tour contenant 2 disques", resEmpile);
            
            //Test Disque = DernierDisque tour rempli
            Tour tour8 = new Tour();
            Disque disque8 = new Disque(2);
            tour8.empiler(disque8);
            Disque disque9 = new Disque(disque8.d);
            resEmpile = tour8.empiler(disque9);
            assertFalse("Un disque de même taille que le dernier disque a pas pu être empilé sur une tour contenant 2 disques", resEmpile);
            
            //Test si l'on peut rajouter un disque sur une tour pleine
            Disque disque10 = new Disque(disqueBase2.d-1);
            resEmpile = tour8.empiler(disque10);
            assertFalse("Un disque a pu être ajouté à une tour pleine", resEmpile);
	}

}
