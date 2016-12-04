import java.util.Scanner;

public class Compte
{
    private int numCompte;
    private double depotInitial;
    private double decouvertMax;
    private double debitmax;        //montant à retire

    public Compte(int numCompte,  double depotInitial, double decouvertMax, double debitmax)
    {
        this.numCompte = numCompte;
        this.depotInitial = depotInitial;
        this.decouvertMax = decouvertMax;
        this.debitmax = debitmax;
    }

    public void retrait(double montant) throws TestEx, TestEx2
    {
    	if(montant<=debitmax) throw new TestEx();
    	if(depotInitial<=decouvertMax) throw new TestEx2();
    	depotInitial -=montant;
    }

    public void ajout(double montant) throws Test2
    {
    	if(montant<0) throw new Test2();
    	depotInitial +=montant;
    }
    
    public static void main(String[] args) throws TestEx2 
    {
    	Compte cmp = new Compte(123456, 20000, 5000, 2000);
    	
    	try{
    	cmp.retrait(2000);} catch (TestEx e){}
    	catch (TestEx2 e){}
    	
    	//Scanner clavier = new 
 
   
    	try{
    		cmp.ajout(-2000);
    	}catch (Test2 e){}
    }
}

