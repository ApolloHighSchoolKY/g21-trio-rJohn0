//Write your answer here
public class Trio 
{
   private String grass;
   private String liquid;
   private String sandwitch; 
   private double grassPrice;
   private double liquidPrice;
   private double sandwitchPrice;

    public Trio(Sandwhich sandwhich, Salad salad, Drink drink)
    {
        grass = salad.getName();
        sandwitch = sandwhich.getName();
        liquid = drink.getName(); 
        grassPrice = salad.getPrice();
        sandwitch = sandwhich.getPrice();
        liquid = drink.getPrice();
    }

    public double price()
    {
        double smallest = 0.0; 

        if(smallest > grassPrice)
        {
            smallest = grassPrice;

        } else if(smallest > liquidPrice) 
        {
            smallest = liquidPrice;

        } else if(smallest > sandwitchPrice)
        {
            smallest > sandwitchPrice;
        } else {
            smallest = smallest; 
        }
           

        return grassPrice + liquidPrice + sandwitchPrice - smallest; 
    }
    
    public String toString()
    {
        return "" + sandwitch +"/ " + grass +"/ " + liquid +" Trio"; 
    }



}