package domaci_22_02_2019;

import java.util.Scanner;

public class PrviZadatak {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numberCount;
		int divide;
		boolean isNumberAZero = true;
		int sumForDivade = 0;
                int sumFS = 1;

		while (isNumberAZero) {

			int firstNumber = 1;
			int secondNumber = 1;
			System.out.println("\nUnesite broj za ispis Fibonacijevog niza:\nili unesite broj 0 za izlaz iz programa ");
			numberCount = scan.nextInt();
                        
                        int tempFirst = 1;
                        int tempSecond = 0;
                        
			if (numberCount != 0) {
				System.out.println("Unesite broj sa kojim ce se proveriti deljivost Fibonacijevog niza: ");
				divide = scan.nextInt();

				for (int i = 1; i <= numberCount; ++i) {

//					for(int j = 0; j < numberCount; j++ ) {
//						sumForDivade += firstNumber + secondNumber;
//					}
                                        sumForDivade = tempFirst + tempSecond;    
                             //           System.out.println("+"+sumForDivade+"+");
					if (sumForDivade % divide == 0) {
						System.out.print(firstNumber + " ");
					}
					sumFS = firstNumber + secondNumber;
                                        tempFirst = firstNumber;
                                        tempSecond = secondNumber - tempFirst;
					firstNumber = secondNumber;
					secondNumber = sumFS;		
				}
			} else {
				isNumberAZero = false;
				System.out.println("Kraj programa");
			}
		}
		scan.close();
	}

}
