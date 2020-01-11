
import java.util.ArrayList;

public class PowerSet {
   
    /*
     * This method uses the idea that counting up from 0 to 11..11 (with 'n' number
     * of 1's) is effectively a power-set of 11..11.
     * So for 1111 counting up from 0 gives you {0, 0001, 0010, 0011....1110, 1111}
     *
     * By assigning each number a variable we get the superset.
     */
   
    // ArrayList<String> variables=new ArrayList<String>(); // this should be de-commented if you wish to find the power-set of a set of strings.
	//variables.add(variable); etc. add all variables to list.
   
    public ArrayList<ArrayList<Integer>> powerset(int n)
    {
        int lastset=(int) Math.pow(2, n); //this number is the 11..11 we will count up to.
       
        ArrayList<ArrayList<Integer>> powersetarray=new ArrayList<ArrayList<Integer>>();
        
        for(int m=0; m<=lastset; m++) // this is the counter; every number up to 11..11 is processed by the following code
        {
            ArrayList<Integer> subsetarray=new ArrayList<Integer>(); //sets up array for subset. Should change to String if you are looking at  set of strings.
           
            String binaryString=Integer.toBinaryString(m); //gets number and convert it variable
           
            for(int o=0; o<binaryString.length(); o++)  //goes through every character of string
            {
                if(binaryString.charAt(o)==1) //checks if there is a 1 at that particular character
                {
                    // subsetarray.add(variables.get(o)); 
                    subsetarray.add(o); //adds variable to the new subset
                }
            }
            powersetarray.add(subsetarray); //adds the subset to the power-set array.
            
        }
         return powersetarray;
    }
    
    public int getSubset(ArrayList<Integer> subset)
    {
    	for(int n=0; n<=subset.size(); n++)
    	{
    		return subset.get(n);
    	}
    }
    
    
    public void printPowerset(ArrayList<ArrayList<Integer>> powerset)
    {
    	for(int n=0; n<=powerset.size(); n++)
    	{
    		System.out.println("{" + getSubset(powerset.get(n)) + "}");
    	}
    }
        
    
    
     
  

}