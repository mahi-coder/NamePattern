package namePattern.PatternProgram;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i =1 ; i<= 5; i++) {
			for(int k = 1; k<= 5; k++) {
				charr(i,k);
			}
		}
	}
	static void charr(int i, int c) {
		
	}

	static void pWait() {
		try {
			Thread.sleep(170);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void nextLine() {
		System.out.println("");
	}

	static void space() {
		String space = "  ";
		System.out.print(space);
	}

	static void starSpace() {
		System.out.print(" ");
	}

	static void blank() {
		String blank = "  ";
		System.out.print(blank);
	}

	static void star() {
		System.out.print("*");
		starSpace();
	}

	static void char_c(int l) {
		for (int c = 1; c <= 5; c++) {
//		if (l == 1 && c == 1) {
////			System.out.print("  ");
//			blank();
//		} 
//		else 
			if (l == 1 && (c == 2 || c == 3 || c == 4 || c == 5)) {
				star();
//			System.out.print("* ");
			} else if ((l == 2 || l == 3 || l == 4) && c == 1) {
				star();
//			System.out.print("* ");
			}
//		else if (l == 5 && c == 1) {
////			System.out.print("  ");
//			blank();
//
//		} 
			else if (l == 5 && (c == 2 || c == 3 || c == 4 || c == 5)) {
//			star();
				System.out.print("* ");
			} else {
				blank();

			}
		}
//		System.out.print(" i is ="+l);
//		System.out.print(" c is =" + c);

		space();

	}

//	static void char_m(int l) {
//		if (l == 1) {
//			System.out.print("*       *");
//		}
//		if (l == 2) {
//			System.out.print("* *   * *");
//		}
//		if (l == 3) {
//			System.out.print("*   *   *");
//		}
//		if (l == 4) {
//			System.out.print("*       *");
//		}
//		if (l == 5) {
//			System.out.print("*       *");
//		}
//		space();
//
//	}
//
//	static void char_a(int l) {
//		if (l == 1) {
//			System.out.print("    *    ");
//		}
//		if (l == 2) {
//			System.out.print("  *   *  ");
//		}
//		if (l == 3) {
//			System.out.print("* * * * *");
//		}
//		if (l == 4) {
//			System.out.print("*       *");
//		}
//		if (l == 5) {
//			System.out.print("*       *");
//		}
//		space();
//	}
//
//	static void char_h(int l) {
//		if (l == 1) {
//			System.out.print("*       *");
//		}
//		if (l == 2) {
//			System.out.print("*       *");
//		}
//		if (l == 3) {
//			System.out.print("* * * * *");
//		}
//		if (l == 4) {
//			System.out.print("*       *");
//		}
//		if (l == 5) {
//			System.out.print("*       *");
//		}
//		space();
//	}
//
//	static void char_i(int l) {
//		if (l == 1) {
//			System.out.print("* * * * *");
//		}
//		if (l == 2) {
//			System.out.print("    *    ");
//		}
//		if (l == 3) {
//			System.out.print("    *    ");
//		}
//		if (l == 4) {
//			System.out.print("    *    ");
//		}
//		if (l == 5) {
//			System.out.print("* * * * *");
//		}
//		space();
//	}
//
//	static void char_t(int l) {
//		if (l == 1) {
//			System.out.print("* * * * *");
//		}
//		if (l == 2) {
//			System.out.print("    *    ");
//		}
//		if (l == 3) {
//			System.out.print("    *    ");
//		}
//		if (l == 4) {
//			System.out.print("    *    ");
//		}
//		if (l == 5) {
//			System.out.print("    *    ");
//		}
//		space();
//	}
//
//	static void char_r(int l) {
//		if (l == 1) {
//			System.out.print("* * * *  ");
//		}
//		if (l == 2) {
//			System.out.print("*       *");
//		}
//		if (l == 3) {
//			System.out.print("* *  *   ");
//		}
//		if (l == 4) {
//			System.out.print("*     *  ");
//		}
//		if (l == 5) {
//			System.out.print("*       *");
//		}
//		space();
//	}
//
//	static void char_o(int l) {
//		if (l == 1) {
//			System.out.print("  * * *  ");
//		}
//		if (l == 2) {
//			System.out.print("*       *");
//		}
//		if (l == 3) {
//			System.out.print("*       *");
//		}
//		if (l == 4) {
//			System.out.print("*       *");
//		}
//		if (l == 5) {
//			System.out.print("  * * *  ");
//		}
//		space();
//	}

	
	
	static void char_(int l) {
		for (int c = 1; c <= 5; c++) {
			if(l == 1 && (c == 1 || c == 2 || c == 3 || c == 4)) {
				star();
			}else if (l == 2) {
				
			}else if (l == 3) {
				
			}else if (l == 4) {
				
			}else if (l == 5) {
				
			}
		}
		space();
	}
	
	
	
	
	
	
	
	
	
	
	
}

