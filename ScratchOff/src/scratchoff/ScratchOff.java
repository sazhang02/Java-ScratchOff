/*Samantha Zhang
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scratchoff;

/**
 *
 * @author sazhang
 */
public class ScratchOff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int r,a,c=0;
        int w[] = new int[4];
        int user[] = new int[12];
        double money=0;

        System.out.println("User scratch-off #s: ");
        for (int j=0; j<12;j++)
        {
            a= rand();
            user[j] = a; 
            System.out.println(a);
        }
        System.out.println("Winning scratch-off #s: ");
        for (int i=0; i<4;i++)
        {
            r= rand();
            w[i] = r; 
            for (int k=0; k<12;k++)
            {
                if (r==(user[k]))
                {
                    c=c+1;
                }
            }
            System.out.println(r);
        }
        

        if (c>0)
        {
        money = Math.pow(10,c);
        }
        System.out.println("You won: "+ money);
        
    }
    public static int rand()
    {
       int value; 
       value =  1+(int)(Math.random()*80);
       return value;
    }    
}
