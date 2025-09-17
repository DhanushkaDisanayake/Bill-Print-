import java.util.*;
class billPrint{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println();
		System.out.println("__          __  _                             _           _ __  __            _");
		System.out.println("\\ \\        / / | |                           | |         (_)  \\/  |          | |");
		System.out.println(" \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___   | |_ ___     _| \\  / | __ _ _ __| |_");
		System.out.println("  \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\  | __/ _ \\   | | |\\/| |/ _` | `__| __|");
		System.out.println("   \\  /\\  /  __/ | (_| (_) | | | | | |  __/  | || (_) |  | | |  | | (_| | |  | |_");
		System.out.println("    \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|   \\__\\___/   |_|_|  |_|\\__,_|_|   \\__|");
		System.out.println();
		System.out.println("==================================================================================");
		System.out.println();

		System.out.print("Enter Customer Phone Number - ");
		int number=input.nextInt();
		System.out.println();

		System.out.print("Enter Customer Name         - ");
		String name=input.next();

		System.out.println();
		System.out.println();
		System.out.println("==================================================================================");
		System.out.println();

		System.out.print("Basmathi Qty(Kg   - ");
		int BQ =input.nextInt();
		System.out.println();

		System.out.print("Dhal Qty(Kg)      - ");
		int DQ =input.nextInt();
		System.out.println();

		System.out.print("Sugar Qty(Kg)     - ");
		int SQ =input.nextInt();
		System.out.println();

		System.out.print("Higland Qty       - ");
		int HQ =input.nextInt();
		System.out.println();

		System.out.print("Yoghurt Qty       - ");
		int YQ =input.nextInt();
		System.out.println();

		System.out.print("flour Qty(Kg)     - ");
		int FQ =input.nextInt();
		System.out.println();

		System.out.print("Soap Qty          - ");
		int sQ =input.nextInt();
		System.out.println();

		double B=250.0*BQ;
		double D=180.0*DQ;
		double S=150.0*SQ;
		double H=1200.0*HQ;
		double Y=50.0*YQ;
		double F=120.0*FQ;
		double s=160.0*sQ;

		double T,Dis,P;
		T = B+D+S+H+Y+F+s;
		Dis = T*0.1;
		P = T-Dis;

		System.out.println("+--------------------------------------------------------------------------------+");
		System.out.println("|                       _   __  __          _____ _______                        |");
		System.out.println("|                      (_) |  \\/  |   /\\   |  __ \\__  ___|                       |");
		System.out.println("|                       _  | \\  / |  /  \\  | |__) | | |                          |");
		System.out.println("|                      | | | |\\/| | / /\\ \\ |  _  /  | |                          |");
		System.out.println("|                      | | | |  | |/ ____ \\| | \\ \\  | |                          |");
		System.out.println("|                      |_| |_|  |_/_/    \\_\\_|  \\_\\ |_|                          |");
		System.out.println("|                          225,Galle Road, Panadura.                             |");
		System.out.println("|                                                                                |");
		System.out.println("|                                                                                |");
		System.out.println("+--------------------------------------------------------------------------------+");
		System.out.printf("|                           # Tel   : %-43d|\n",number);
		System.out.printf("|                           # Name  : %-43s|\n",name);
		System.out.println("+--------------------------------------------------------------------------------+");
		System.out.println("|                     |      Qty      |     unit price     |        Price        |");
		System.out.println("+--------------------------------------------------------------------------------+");
		System.out.printf("| # Basmathi          |        %-7d|         250.0      |        %-13.1f|\n",BQ,B);
		System.out.println("|                     |               |                    |                     |");
		System.out.printf("| # Dhal              |        %-7d|         180.0      |        %-13.1f|\n",DQ,D);
		System.out.println("|                     |               |                    |                     |");
		System.out.printf("| # Sugar             |        %-7d|         150.0      |        %-13.1f|\n",SQ,S);
		System.out.println("|                     |               |                    |                     |");
		System.out.printf("| # Higland           |        %-7d|        1200.0      |        %-13.1f|\n",HQ,H);
		System.out.println("|                     |               |                    |                     |");
		System.out.printf("| # Yoghurt           |        %-7d|          50.0      |        %-13.1f|\n",YQ,Y);
		System.out.println("|                     |               |                    |                     |");
		System.out.printf("| # Flour             |        %-7d|         120.0      |        %-13.1f|\n",FQ,F);
		System.out.println("|                     |               |                    |                     |");
		System.out.printf("| # Soap              |        %-7d|         160.0      |        %-13.1f|\n",sQ,s);
		System.out.println("|                     |               |                    |                     |");
		System.out.println("+--------------------------------------------------------------------------------+");
		System.out.printf("|                                     |  Total             |        %-13.1f|\n",T);
		System.out.println("|                                     +--------------------+---------------------+");
		System.out.printf("|                                     |  %-17s |        %-13.1f|\n","Discount(10%)",Dis);
		System.out.println("|                                     +--------------------+---------------------+");
		System.out.printf("|                                     |  Price             |        %-13.1f|\n",P);
		System.out.println("+------------------------------------ +--------------------+---------------------+\n");

		System.out.print("Enter Cash    :  ");
		double ca = input.nextInt();
		System.out.println();

		double ch = ca - P;

		System.out.println("+-------------------------------------+------------------------------------------+ ");
		System.out.printf("|%12s%-25s|%15s%-27.1f|\n","","Net Amount","",P);
		System.out.println("+-------------------------------------+------------------------------------------+ ");
		System.out.printf("|%12s%-25s|%15s%-27.1f|\n","","Cash","",ca);
		System.out.println("+-------------------------------------+------------------------------------------+ ");
		System.out.printf("|%12s%-25s|%15s%-27.1f|\n","","Change","",ch);
		System.out.println("+-------------------------------------+------------------------------------------+\n\n ");

		double s5000,s2000,s1000,s500,s100,s50,s20,s10,s5,s2,s1;
		double se5000,se2000,se1000,se500,se100,se50,se20,se10,se5,se2,se1;
		
		s5000 = ch / 5000;
		se5000 = ch % 5000;
		
		s2000 = se5000 / 2000;
		se2000 = se5000 % 2000;
		
		s1000 = se2000 / 1000;
		se1000 = se2000 % 1000;
		
		s500 = se1000 / 500;
		se500 = se1000 % 500;
		
		s100 = se500 / 100;
		se100 = se500 % 100;
		
		s50 = se100 / 50;
		se50 = se100 % 50;
		
		s20 = se50 / 20;
		se20 = se50 % 20;
		
		s10 = se20 / 10;
		se10 = se20 % 10;
		
		s5 = se10 / 5;
		se5 = se10 % 5;
		
		s2 = se5 / 2;
		se2 = se5 % 2;
		
		s1 = se2 / 1;g
		
		double notes = s5000+s2000+s1000+s500+s100+s50+s20;
		double coins = s10+s5+s2+s1;

		System.out.println("+-------------------------------------+--------------------+");
		System.out.printf("|%13s%-24s|%9s%-11s|\n","","Value","","No");
		System.out.println("+-------------------------------------+--------------------+");
		System.out.printf("|%12s%-25s|%9s%-11.0f|\n","","Rs.5000","",s5000);
		System.out.println("+-------------------------------------+--------------------+");
		System.out.printf("|%12s%-25s|%9s%-11.0f|\n","","Rs.2000","",s2000);
		System.out.println("+-------------------------------------+--------------------+");
		System.out.printf("|%12s%-25s|%9s%-11.0f|\n","","Rs.1000","",s1000);
		System.out.println("+-------------------------------------+--------------------+");
		System.out.printf("|%12s%-25s|%9s%-11.0f|\n","","Rs. 500","",s500);
		System.out.println("+-------------------------------------+--------------------+");
		System.out.printf("|%12s%-25s|%9s%-11.0f|\n","","Rs. 100","",s100);
		System.out.println("+-------------------------------------+--------------------+");
		System.out.printf("|%12s%-25s|%9s%-11.0f|\n","","Rs.  50","",s50);
		System.out.println("+-------------------------------------+--------------------+");
		System.out.printf("|%12s%-25s|%9s%-11.0f|\n","","Rs.  20","",s20);
		System.out.println("+-------------------------------------+--------------------+");
		System.out.printf("|%12s%-25s|%9s%-11.0f|\n","","Rs.  10","",s10);
		System.out.println("+-------------------------------------+--------------------+");
		System.out.printf("|%12s%-25s|%9s%-11.0f|\n","","Rs.   5","",s5);
		System.out.println("+-------------------------------------+--------------------+");
		System.out.printf("|%12s%-25s|%9s%-11.0f|\n","","Rs.   2","",s2);
		System.out.println("+-------------------------------------+--------------------+");
		System.out.printf("|%12s%-25s|%9s%-11.0f|\n","","Rs.   1","",s1);
		System.out.println("+-------------------------------------+--------------------+");
		System.out.printf("|%10s%-27s|%9s%-11.0f|\n","","No of Notes","",notes);
		System.out.println("+-------------------------------------+--------------------+");
		System.out.printf("|%10s%-27s|%9s%-11.0f|\n","","No of coins","",coins);
		System.out.println("+-------------------------------------+--------------------+\n");

		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("                      THANK YOU FOR SHOPPING WITH US");
		System.out.println("----------------------------------------------------------------------------------");


	}
}
