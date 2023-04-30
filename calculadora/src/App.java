import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
		
		System.out.println("\033[1;33mQual operação deseja realizar? \033[m");
		System.out.println("[1] = Soma");
		System.out.println("[2] = Subtração");
		System.out.println("[3] = multiplicação");
		System.out.println("[4] = divisão");
		System.out.println("[5] = potênciação");
		System.out.println("[6] = Raiz quadrada");
		System.out.println("[7] = Raiz cúbica");
		System.out.println("[8] = logarítmo");
		System.out.println("[9] = fatorial");
		System.out.println("[10] = Bhaskara");
		System.out.println();
		System.out.print("\033[1;33mEscolha: \033[m");
		int opr= ler.nextInt();
		System.out.println();
		
		double result= 0;
		double num1=0;
		double num2=0;
		int cont = 1;
		
		switch(opr){
			case 1:
				System.out.print("Digite um num: ");
				num1= ler.nextFloat();
				System.out.print("Digite +1 num: ");
				num2= ler.nextFloat();
				result= num1+num2;
				System.out.printf("%.2f + %.2f = %.2f ", num1, num2, result);
				break;
			case 2:
				System.out.print("Digite um num: ");
				num1= ler.nextFloat();
				System.out.print("Digite +1 num: ");
				num2= ler.nextFloat();
				result= num1-num2;	
				System.out.printf("%.2f - %.2f = %.2f ", num1, num2, result);
				break;
			case 3:
				System.out.print("Digite um num: ");
				num1= ler.nextFloat();
				System.out.print("Digite +1 num: ");
				num2= ler.nextFloat();
				result= num1 * num2;	
				System.out.printf("%.2f x %.2f = %.2f ", num1, num2, result);	
				break;
			case 4:
				System.out.print("Digite um num: ");
				num1= ler.nextFloat();
				System.out.print("Digite +1 num: ");
				num2= ler.nextFloat();
				result= num1 / num2;	
				System.out.printf("%.2f ÷ %.2f = %.2f ", num1, num2, result);
				break;
			case 5:
				System.out.print("Digite um num: ");
				num1= ler.nextDouble();
				System.out.print("Digite +1 num: ");
				num2= ler.nextDouble();
				result= Math.pow(num1, num2);	
				System.out.printf("%.2f ^ %.2f = %.2f", num1, num2, result);
				break;
			case 6:
				System.out.print("Digite um num: ");
				num1= ler.nextFloat();
				result= Math.sqrt(num1);	
				System.out.printf("√ %.2f = %.2f", num1, result);
				break;		
			case 7:
				System.out.print("Digite um num: ");
				num1= ler.nextFloat();
				result= Math.cbrt(num1);	
				System.out.printf("√ %.2f = %.2f", num1, result);
				break;
			case 8:
				System.out.print("Digite um num: ");
				num1= ler.nextFloat();
				result= Math.log(num1);	
				System.out.printf("log(%.2f)= %.2f", num1, result);
				break;
			case 9:
				System.out.print("Digite um num: ");
				int fat=ler.nextInt();
				cont=fat;
				result=1;
				System.out.printf("%d! = %d", fat, fat);
				while (cont>=1){
					result*=cont;
					cont--;
					if (cont>0){	
					System.out.printf(" × %d", cont);
					}
				}
				System.out.printf(" = %.2f", result);
				break;
			case 10:
				System.out.print("Digite o valor de A: ");
				double a= ler.nextDouble();
				System.out.print("Digite o valor de B: ");
				double b= ler.nextDouble();
				System.out.print("Digite o valor de C: ");
				double c= ler.nextDouble();
				double delta = (b*b) - (4*a*c);
				if (delta<0){
					System.out.println("A função do segundo grau possui raiz no conjunto dos números imaginários; ");
				}else if(delta==0){
					System.out.println("A função do segundo grau possui duas raizes iguais:  ");
					double x1= ((-b)+ (Math.sqrt(delta)))/(2*a);
					double x2= ((-b)- (Math.sqrt(delta)))/(2*a);
					System.out.printf("Raizes %.2f e %.2f / ∆= %.2f", x1, x2, delta);
				}else{
					System.out.println("A função do segundo grau possui duas raizes diferentes: ");					
                    double x1= ((-b)+ (Math.sqrt(delta)))/(2*a);
					double x2= ((-b)- (Math.sqrt(delta)))/(2*a);
			        System.out.printf("Raizes %.2f e %.2f / ∆= %.2f", x1, x2, delta);
				}
				break;
				default: 
				    System.out.println("Erro na analise dos dados, tente novamente mais tarde");

            System.out.println("\033[H\033[2J");
        }        
    }
}
