package app2;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
// Import the Scanner class to read text files
import java.util.*;

public class app2 {
    static String selectedPlans = "F5,F2,F9,F0,F7,F6,F8,F3";
	public static void main(String[] args) {
        List<ServicePlans> servicePlans = new ArrayList<>();
		List<Result> results = new ArrayList<>();
        try {
            
        	selectedPlans = args[1];
        	File myObj = new File(args[0]);
            //File myObj = new File("example1.txt");
            Scanner myReader = new Scanner(myObj);

            while(myReader.hasNextLine()) {
	            String data = myReader.nextLine();
	            String[] arrOfStr=data.split(",",3);
	            
	            servicePlans.add(new ServicePlans(arrOfStr[0], (long)Integer.parseInt(arrOfStr[1]), arrOfStr[2]));
	    		
	    		//Initialize the result pool table
	    		results.add(new Result(arrOfStr[0], (long)Integer.parseInt(arrOfStr[1]), arrOfStr[2].split(",",0)));
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

		//Begin finding the best plan
        String[] arrOfSelection=selectedPlans.split(",",0);
        for(int i=0; i < arrOfSelection.length; ++i) {
        	//Get all the Plans which match the requested service.
        	List<ServicePlans> selectedPlans = new ArrayList<>();
            for(int x=0; x<servicePlans.size(); ++x){
                if(servicePlans.get(x).getServices().contains(arrOfSelection[i])){
                    selectedPlans.add(new ServicePlans(servicePlans.get(x).getPlanName(),servicePlans.get(x).getPrice(),servicePlans.get(x).getServices()));
                }
            }
        	//For each of these Plans, check if they already exist in our results pool.
        	for(int j=0; j < selectedPlans.size(); ++j) {
        		for(int k=0; k < results.size(); ++k) {
        			results.get(k).addPlan(selectedPlans.get(j).getPlanName(),selectedPlans.get(j).getPrice(), arrOfSelection[i]);
        		}
        	}
        }
        Collections.sort(results);
        System.out.println(results.get(0));
		
	}
}