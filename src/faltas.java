import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class faltas {
	
	    public static void main (String[] args){

	        Scanner imput = new Scanner(System.in);

	        String data[] = {"26/05/2021","27/05/2021","28/05/2021"};
	        String aluno[] = {"Carlos","Veronica","Didi"};

	        String [] [] chamada = new String [data.length][aluno.length];

	          for (int i  = 0; i < data.length; i++ ) {
	              System.out.println("Lista de presença do dia" + data[i]);
	              for (int x = 0; x < aluno.length; x++) {
	                  System.out.println(aluno[x] + " esta presente");
	                  chamada[i][x] = imput.nextLine();

	              }
	          }
	          System.out.println("Data");
	          for (int dt = 0; dt < data.length; dt++ ){
	              System.out.println(data[dt] + " ");

	          }
	          System.out.println("");

	          for(int i = 0; i < aluno.length; i++ ){
	              System.out.println(aluno[i] + " ");
	              for(int x = 0; x < data.length; x++ ){
	                  System.out.println(chamada [i] [x] );

	              }

	              System.out.println("");

	          }



	    }
	}

