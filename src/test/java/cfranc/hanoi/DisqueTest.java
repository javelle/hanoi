package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {

	@Test
	public void testCompareTo() {
		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);
		Disque grand = new Disque(3);
                
		assertEquals("le petit disque est plus grand que le moyen disque",-1, petit.compareTo(moyen));
		assertEquals("le moyen disque est plus grand que le grand disque",-1, moyen.compareTo(grand));
                assertEquals("le petit disque est plus grand que grand disque",-1,petit.compareTo(grand));
                assertEquals("le grand disque est plus petit que petit disque",1,grand.compareTo(petit));
                assertEquals("le grand disque est plus petit que moyen disque",1,grand.compareTo(moyen));
                assertEquals("le moyen disque est plus petit que petit disque",1,moyen.compareTo(petit));
                assertEquals("les deux petit disques ne sont pas de même taille ",0,petit.compareTo(petit));
                assertEquals("les deux moyens disques ne sont pas de même taille",0,moyen.compareTo(moyen));
                assertEquals("les deux grands disques ne sont pas de même taille",0,grand.compareTo(grand));
                
                
	}

}
