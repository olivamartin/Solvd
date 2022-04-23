import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.solvd.army.Models.barracks.Barracks;
import com.solvd.army.Models.division.Division;
import com.solvd.army.Models.grenade.Grenade;
import com.solvd.army.Models.officer.Officer;
import com.solvd.army.Models.officer.ranks.Rank;
import com.solvd.army.Models.soldier.Soldier;
import com.solvd.army.Models.weapon.AssaultRifle.AssaultRifle;
import com.solvd.army.Models.exceptions.*;
import org.apache.logging.log4j.*;


public class Run {
	
	private final static Logger logger = LogManager.getLogger(Run.class);
	
	private static void WeaponWeight(AssaultRifle ar) throws WeaponTooHeavy {
		if (ar.getWeight()<10) {
			System.out.println("Weapon weight ok");
			logger.info("Weapon weight ok");
			logger.debug("This is debug");
			}
		else 
			{
			throw new WeaponTooHeavy("Weapon is too heavy");
			
			}
	}
	
	private static void TimeExplosive(Grenade gr) throws NoTimeExplosive {
		if (gr.getTime()>0) {
			System.out.println("Time is ok");
			logger.info("Time is ok");	
		}
		else throw new NoTimeExplosive("Set a time major to 0 or it will explode instantly");		
	}
	
	private static void DivisionResponsibilities(Division div) throws NoResponsibilities {
		if (div.getResponsabilities() == null || div.getResponsabilities().isEmpty() || div.getResponsabilities().trim().isEmpty())  
			throw new NoResponsibilities("Please set responsibilites for the division");
		else {
			System.out.println("Responsibilities of division: "+ div.getResponsabilities());
			logger.info("Responsibilities of division: "+ div.getResponsabilities());
		}
	}
		
	private static void VerifyRank(Officer of) throws NotEnoughRank {
		final Set<String> ranks = new HashSet<String>(Arrays.asList("Private", "Private First Class", "Specialist", "Corporal", "Sergeant",  "Staff Sergeant" , "Sergeant First Class", "Master Sergeant", "First Sergeant", "Sergeant Major", "Command Sergeant Major", "Sergeant Major of the army" ));
		if(!ranks.contains(of.getRank())){
			System.out.println("Allowed to be an officer");
			logger.info("Allowed to be an officer");
		}
		else throw new NotEnoughRank("A higher rank is required to be an officer");
	}
		
	private static void CheckBarracksCapacity(ArrayList<Soldier> s, Barracks b) throws NoBarracksCapacity {
		
		if(s.size()<=b.getCapacity()){
			System.out.println("Enough capacity for soldiers");
		}
		else throw new NoBarracksCapacity("More space is required to fit all soldiers in the barracks");
	
		
	}
	
	
	public static void main(String[] args) {
		
		AssaultRifle ar = new AssaultRifle(30,100,50,"Burst");
		Grenade gr = new Grenade(5,"Fragmentation",0);
		Barracks br = new Barracks(2,"Small","Delta");
		Division div = new Division("Armored division", "");
		Officer of = new Officer(1, Rank.CHIEFWARRANTOFFICER2);
		ArrayList<Soldier> soldiers = new ArrayList<Soldier>();
		Soldier s1 = new Soldier("Martin", 1.72, 70);
		Soldier s2 = new Soldier("Joshua", 1.75, 73.5);
		Soldier s3 = new Soldier("Savior", 1.80, 78);
		soldiers.add(s1);
		soldiers.add(s2);
		soldiers.add(s3);
		
		try  
        {   
            WeaponWeight(ar); 
        }  
        catch (WeaponTooHeavy e)  
        {  
            System.out.println("Exception occured: " + e);
            logger.error("Exception occured: " + e);
            
            
        }  
		
		try  
        {   
            TimeExplosive(gr); 
        }  
        catch (NoTimeExplosive e)  
        {  
            System.out.println("Exception occured: " + e);  
            logger.error("Exception occured: " + e);
        }
		
		try  
        {   
            DivisionResponsibilities(div); 
        }  
        catch (NoResponsibilities e)  
        {  
            e.printStackTrace();
            logger.error("Exception occured: " + e);
        }
		try  
        {   
            VerifyRank(of);
        }  
        catch (NotEnoughRank e)  
        {  
            e.printStackTrace();
            logger.error("Exception occured: " + e);
        }
		try  
        {   
            CheckBarracksCapacity(soldiers, br);
        }  
        catch (NoBarracksCapacity e)  
        {  
            e.printStackTrace();
            logger.error("Exception occured: " + e);
        }
		

		

	}

	

	


}
