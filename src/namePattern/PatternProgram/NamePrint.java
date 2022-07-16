package namePattern.PatternProgram;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class NamePrint {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter your name to print : ");
			String name = scan.nextLine();
			System.out.println();

			for (int i = 1; i <= 5; i++) {

				for (int j = 0; j < name.length(); j++) {
					char ch = name.toLowerCase().charAt(j);
					if (ch != ' ') {
						Method method;
						try {
							method = NamePrint.class.getDeclaredMethod("char_" + ch, int.class);
							try {
								method.invoke(null, i);
							} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						} catch (NoSuchMethodException | SecurityException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						pWait();
					} else {
						MethodSpace(i);
					}
				}

				nextLine();
			}
		}
	}

	static void pWait() {
		try {
			Thread.sleep(170);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void MethodSpace(int l) {
		for (int c = 1; c <= 2; c++) {
			space();
//			space();
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

	static void char_a(int l) {
		for (int c = 1; c <= 5; c++) {
			if (l == 1 && c == 3) {
				star();
			} else if (l == 2 && (c == 2 || c == 4)) {
				star();
			} else if (l == 3 && (c == 1 || c == 2 || c == 3 || c == 4 || c == 5)) {
				star();
			} else if (l == 4 && (c == 1 || c == 5)) {
				star();
			} else if (l == 5 && (c == 1 || c == 5)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_b(int l) {
		for (int c = 1; c <= 5; c++) {
			if (l == 1 && (c == 1 || c == 2 || c == 3 || c == 4)) {
				star();
			} else if (l == 2 && (c == 1 || c == 5)) {
				star();
			} else if (l == 3 && (c == 1 || c == 2 || c == 3 || c == 4)) {
				star();
			} else if (l == 4 && (c == 1 || c == 5)) {
				star();
			} else if (l == 5 && (c == 1 || c == 2 || c == 3 || c == 4)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_c(int l) {
		for (int c = 1; c <= 5; c++) {
			if (l == 1 && (c == 2 || c == 3 || c == 4 || c == 5)) {
				star();
			} else if ((l == 2 || l == 3 || l == 4) && c == 1) {
				star();
			} else if (l == 5 && (c == 2 || c == 3 || c == 4 || c == 5)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_d(int l) {
		for (int c = 1; c <= 5; c++) {
			if (l == 1 && (c == 1 || c == 2 || c == 3 || c == 4)) {
				star();
			} else if ((l == 2 || l == 3 || l == 4) && (c == 1 || c == 5)) {
				star();
			} else if (l == 5 && (c == 1 || c == 2 || c == 3 || c == 4)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_e(int l) {
		for (int c = 1; c <= 5; c++) {
			if ((l == 1 || l == 3 || l == 5) && (c == 1 || c == 2 || c == 3 || c == 4 || c == 5)) {
				star();
			} else if ((l == 2 || l == 4) && c == 1) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_f(int l) {
		for (int c = 1; c <= 5; c++) {
			if (l == 1 && (c == 1 || c == 2 || c == 3 || c == 4 || c == 5)) {
				star();
			} else if ((l == 2 || l == 4 || l == 5) && c == 1) {
				star();
			} else if (l == 3 && (c == 1 || c == 2 || c == 3)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_g(int l) {
		for (int c = 1; c <= 5; c++) {
			if ((l == 1 || l == 5) && (c == 1 || c == 2 || c == 3 || c == 4 || c == 5)) {
				star();
			} else if ((l == 2) && c == 1) {
				star();
			} else if (l == 3 && (c == 1 || c == 3 || c == 4 || c == 5)) {
				star();
			} else if ((l == 4) && (c == 1 || c == 3 || c == 5)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_h(int l) {
		for (int c = 1; c <= 5; c++) {
			if ((l == 1 || l == 2 || l == 4 || l == 5) && (c == 1 || c == 5)) {
				star();
			} else if (l == 3 && (c == 1 || c == 2 || c == 3 || c == 4 || c == 5)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_i(int l) {
		for (int c = 1; c <= 5; c++) {
			if ((l == 1 || l == 5) && (c == 1 || c == 2 || c == 3 || c == 4 || c == 5)) {
				star();
			} else if ((l == 2 || l == 3 || l == 4) && c == 3) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_j(int l) {
		for (int c = 1; c <= 5; c++) {
			if ((l == 1) && (c == 1 || c == 2 || c == 3 || c == 4 || c == 5)) {
				star();
			} else if ((l == 2 || l == 3) && c == 3) {
				star();
			} else if (l == 4 && (c == 1 || c == 3)) {
				star();
			} else if (l == 5 && (c == 1 || c == 2 || c == 3)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_k(int l) {
		for (int c = 1; c <= 5; c++) {
			if ((l == 1 || l == 5) && (c == 1 || c == 4 || c == 5)) {
				star();
			} else if ((l == 2 || l == 4) && (c == 1 || c == 3)) {
				star();
			} else if ((l == 3) && (c == 1 || c == 2)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_l(int l) {
		for (int c = 1; c <= 5; c++) {
			if (c == 1 && (l == 1 || l == 2 || l == 3 || l == 4)) {
				star();
			} else if ((l == 5) && (c == 1 || c == 2 || c == 3 || c == 4 || c == 5)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_m(int l) {
		for (int c = 1; c <= 5; c++) {
			if ((l == 1 || l == 4 || l == 5) && (c == 1 || c == 5)) {
				star();
			} else if ((l == 2) && (c == 1 || c == 2 || c == 4 || c == 5)) {
				star();
			} else if (l == 3 && (c == 1 || c == 3 || c == 5)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_n(int l) {
		for (int c = 1; c <= 5; c++) {
			if ((l == 1 || l == 5) && (c == 1 || c == 5)) {
				star();
			} else if (l == 2 && (c == 1 || c == 2 || c == 5)) {
				star();
			} else if (l == 3 && (c == 1 || c == 3 || c == 5)) {
				star();
			} else if (l == 4 && (c == 1 || c == 4 || c == 5)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_o(int l) {
		for (int c = 1; c <= 5; c++) {
			if ((l == 1 || l == 5) && (c == 2 || c == 3 || c == 4)) {
				star();
			} else if ((l == 2 || l == 2 || l == 3 || l == 4) && (c == 1 || c == 5)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_p(int l) {
		for (int c = 1; c <= 5; c++) {
			if (l == 1 && (c == 1 || c == 2 || c == 3 || c == 4)) {
				star();
			} else if (l == 2 && (c == 1 || c == 5)) {
				star();
			} else if (l == 3 && (c == 1 || c == 2 || c == 3 || c == 4)) {
				star();
			} else if ((l == 4 || l == 5) && c == 1) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_q(int l) {
		for (int c = 1; c <= 5; c++) {
			if ((l == 1 || l == 5) && (c == 2 || c == 3 || c == 4)) {
				star();
			} else if ((l == 2 || l == 2 || l == 3 || l == 4) && (c == 1 || c == 5)) {
				star();
			} else if (l == 3 && c == 3) {
				star();
			} else if (l == 4 && c == 4) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_r(int l) {
		for (int c = 1; c <= 5; c++) {
			if (l == 1 && (c == 1 || c == 2 || c == 3 || c == 4)) {
				star();
			} else if (l == 2 && (c == 1 || c == 5)) {
				star();
			} else if (l == 3 && (c == 1 || c == 2 || c == 3 || c == 4)) {
				star();
			} else if (l == 4 && (c == 1 || c == 3)) {
				star();
			} else if (l == 5 && (c == 1 || c == 4)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_s(int l) {
		for (int c = 1; c <= 5; c++) {
			if (l == 1 && (c == 2 || c == 3 || c == 4 || c == 5)) {
				star();
			} else if (l == 2 && c == 1) {
				star();
			} else if (l == 3 && (c == 2 || c == 3 || c == 4)) {
				star();
			} else if (l == 4 && c == 5) {
				star();
			} else if (l == 5 && (c == 1 || c == 2 || c == 3 || c == 4)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_t(int l) {
		for (int c = 1; c <= 5; c++) {
			if ((l == 1) && (c == 1 || c == 2 || c == 3 || c == 4 || c == 5)) {
				star();
			} else if ((l == 2 || l == 3 || l == 4 || l == 5) && c == 3) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_u(int l) {
		for (int c = 1; c <= 5; c++) {
			if ((l == 1 || l == 2 || l == 3 || l == 4) && (c == 1 || c == 5)) {
				star();
			} else if (l == 5 && (c == 2 || c == 3 || c == 4)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_v(int l) {
		for (int c = 1; c <= 5; c++) {
			if ((l == 1 || l == 2 || l == 3) && (c == 1 || c == 5)) {
				star();
			} else if (l == 4 && (c == 2 || c == 4)) {
				star();
			} else if (l == 5 && c == 3) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_w(int l) {
		for (int c = 1; c <= 5; c++) {
			if ((l == 1 || l == 2) && (c == 1 || c == 5)) {
				star();
			} else if (l == 3 && (c == 1 || c == 3 || c == 5)) {
				star();
			} else if (l == 4 && (c == 1 || c == 2 || c == 4 || c == 5)) {
				star();
			} else if (l == 5 && (c == 1 || c == 5)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_x(int l) {
		for (int c = 1; c <= 5; c++) {
			if ((l == 1) && (c == 1 || c == 5)) {
				star();
			} else if (l == 2 && (c == 2 || c == 4)) {
				star();
			} else if (l == 3 && (c == 3)) {
				star();
			} else if (l == 4 && (c == 2 || c == 4)) {
				star();
			} else if ((l == 5) && (c == 1 || c == 5)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_y(int l) {
		for (int c = 1; c <= 5; c++) {
			if (l == 1 && (c == 1 || c == 5)) {
				star();
			} else if (l == 2 && (c == 2 || c == 4)) {
				star();
			} else if ((l == 3 || l == 4 || l == 5) && c == 3) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_z(int l) {
		for (int c = 1; c <= 5; c++) {
			if ((l == 1 || l == 5) && (c == 1 || c == 2 || c == 3 || c == 4 || c == 5)) {
				star();
			} else if (l == 2 && c == 4) {
				star();
			} else if (l == 3 && c == 3) {
				star();
			} else if (l == 4 && c == 2) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_1(int l) {
		for (int c = 1; c <= 5; c++) {
			if (l == 5 && (c == 1 || c == 2 || c == 3 || c == 4 || c == 5)) {
				star();
			} else if (l == 1 && c == 3) {
				star();
			} else if (l == 2 && (c == 2 || c == 3)) {
				star();
			} else if (l == 3 && (c == 1 || c == 3)) {
				star();
			} else if (l == 4 && c == 3) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_2(int l) {
		for (int c = 1; c <= 5; c++) {
			if (l == 1 && (c == 2 || c == 3 || c == 4)) {
				star();
			} else if (l == 2 && (c == 1 || c == 5)) {
				star();
			} else if (l == 3 && c == 4) {
				star();
			} else if (l == 4 && c == 3) {
				star();
			} else if (l == 5 && (c == 1 || c == 2 || c == 3 || c == 4 || c == 5)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_3(int l) {
		for (int c = 1; c <= 5; c++) {
			if ((l == 1 || l == 5) && (c == 1 || c == 2 || c == 3 || c == 4)) {
				star();
			} else if ((l == 2 || l == 4) && (c == 5)) {
				star();
			} else if (l == 3 && (c == 3 || c == 4)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_4(int l) {
		for (int c = 1; c <= 5; c++) {
			if (l == 1 && (c == 3 || c == 4)) {
				star();
			} else if (l == 2 && (c == 2 || c == 4)) {
				star();
			} else if (l == 3 && (c == 1 || c == 2 || c == 3 || c == 4 || c == 5)) {
				star();
			} else if (l == 4 && c == 4) {
				star();
			} else if (l == 5 && (c == 1 || c == 2 || c == 3 || c == 4 || c == 5)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_5(int l) {
		for (int c = 1; c <= 5; c++) {
			if (l == 1 && (c == 1 || c == 2 || c == 3 || c == 4 || c == 5)) {
				star();
			} else if (l == 2 && c == 1) {
				star();
			} else if (l == 3 && (c == 1 || c == 2 || c == 3 || c == 4)) {
				star();
			} else if (l == 4 && c == 5) {
				star();
			} else if (l == 5 && (c == 1 || c == 2 || c == 3 || c == 4)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_6(int l) {
		for (int c = 1; c <= 5; c++) {
			if (l == 1 && (c == 2 || c == 3 || c == 4 || c == 5)) {
				star();
			} else if (l == 2 && c == 1) {
				star();
			} else if (l == 3 && (c == 1 || c == 2 || c == 3 || c == 4)) {
				star();
			} else if (l == 4 && (c == 1 || c == 5)) {
				star();
			} else if (l == 5 && (c == 2 || c == 3 || c == 4)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_7(int l) {
		for (int c = 1; c <= 5; c++) {
			if (l == 1 && (c == 1 || c == 2 || c == 3 || c == 4 || c == 5)) {
				star();
			} else if (l == 2 && c == 4) {
				star();
			} else if (l == 3 && c == 3) {
				star();
			} else if (l == 4 && c == 2) {
				star();
			} else if (l == 5 && c == 1) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_8(int l) {
		for (int c = 1; c <= 5; c++) {
			if ((l == 1 || l == 5) && (c == 2 || c == 3 || c == 4)) {
				star();
			} else if ((l == 2 || l == 4) && (c == 1 || c == 5)) {
				star();
			} else if (l == 3 && (c == 2 || c == 3 || c == 4)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_9(int l) {
		for (int c = 1; c <= 5; c++) {
			if (l == 1 && (c == 2 || c == 3 || c == 4)) {
				star();
			} else if (l == 2 && (c == 1 || c == 5)) {
				star();
			} else if (l == 3 && (c == 1 || c == 2 || c == 3 || c == 4 || c == 5)) {
				star();
			} else if (l == 4 && c == 5) {
				star();
			} else if (l == 5 && (c == 1 || c == 2 || c == 3 || c == 4)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_0(int l) {
		for (int c = 1; c <= 5; c++) {
			if ((l == 1 || l == 5) && (c == 2 || c == 3 || c == 4)) {
				star();
			} else if (l == 2 && (c == 1 || c == 2 || c == 5)) {
				star();
			} else if (l == 3 && (c == 1 || c == 3 || c == 5)) {
				star();
			} else if (l == 4 && (c == 1 || c == 4 || c == 5)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

	static void char_11(int l) {
		for (int c = 1; c <= 5; c++) {
			if (l == 1 && (c == 1 || c == 2 || c == 3 || c == 4)) {
				star();
			} else if (l == 2) {

			} else if (l == 3) {

			} else if (l == 4) {

			} else if (l == 5) {

			}
		}
		space();
	}

	static void char__(int l) {
		for (int c = 1; c <= 5; c++) {
			if (l == 5 && (c == 1 || c == 2 || c == 3 || c == 4 || c == 5)) {
				star();
			} else {
				blank();
			}
		}
		space();
	}

}
