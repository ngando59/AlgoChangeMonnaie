
public class Change {
	
	int coin2;
	int bill5;
	int bill10;
	
	public Change(int coin2, int bill5, int bill10) {
		super();
		this.coin2 = coin2;
		this.bill5 = bill5;
		this.bill10 = bill10;
	}

	public String toString() {
		String result = "";
		result+= "[2 €]  : "+this.coin2+"\n";
		result+= "[5 €]  : "+this.bill5+"\n";
		result+= "[10 €] : "+this.bill10+"\n";
		result+= "\n";
		result+= "Total  : "+((2*coin2)+(5*bill5)+(10*bill10))+ " €";
		return result;
	}

	public static void main(String[] args) {
		/* L'objectif est de faire le change de façon optimale de la somme s
		 * (avec le moins de pièces de 2 € possibles, et le moins de billets de 5 € possible) 
		 * avec
		 * des pièces de 2,
		 * des billets de 5,
		 * des billets de 10
		 * 
		 * le change de 1 est impossible
		 * */
		long s = 3L; 
				
		int coin2 = 0;
		int bill5 = 0;
		int bill10 = 0;
		long tmpS = s;
		// Ne marche pas avec 11, 13, 21, 23, 31, 33 etc...
		while(tmpS > 0) {
			if(tmpS == 1) {
				break;
			}
			if( (tmpS >= 10) && (tmpS % 10 != 1) && (tmpS % 10 != 3) ) {
				tmpS-=10;
				bill10++;
			} else
			if( (tmpS >= 5) && (tmpS % 2 != 0) ) {
				tmpS-=5;
				bill5++;
			} else
			if(tmpS >= 2) {
				tmpS-=2;
				coin2++;
			}	
		}
		
		System.out.println("Change pour "+s+" €");
		System.out.println("--------------------");
		Change c = new Change(coin2, bill5, bill10);
		System.out.println(c.toString());
		System.out.println("--------------------");
	}

}
