package com.imperialm.imiservices.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imperialm.imiservices.dao.UserProfileDAO;
import com.imperialm.imiservices.dto.UserDetailsImpl;
import com.imperialm.imiservices.dto.UserProfileDTO;
import com.imperialm.imiservices.dto.request.InputRequest;
import com.imperialm.imiservices.model.NoTile;

@Service
public class UserProfileServiceImpl implements UserProfileService {

	@Autowired
	private UserProfileDAO userProfileDAO;
	
	//UR2.1
	private List<String> tile1 = new ArrayList<String>(Arrays.asList("01","02","07","13","14","16","19","20","22","23","27","2S","32","33","34","35","36","37","39","3S","40","46","47","49","4S","56","60","65","6W","70","71","74","7L","7M","7N","7P","7Q","82","83","84","87","88","89","8D","8E","8U","90","94","97","98","99","CI","EA","EN","ES","ET","LV","N1","N2","SC","SD","UB","VT"));
	//UR3.1
	private List<String> tile2 = new ArrayList<String>(Arrays.asList("46","47","49","4S","56","60","65","6W","70","71","74","7L","82","83","84","87","88","89","8D","8E","8U","90","94","97","98","99","CI","EA","EN","LV","N1","N2","SC","SD","UB","VT"));
	//UB4.1
	private List<String> tile3 = new ArrayList<String>(Arrays.asList("01","02","03","04","05","06","07","10","12","13","14","15","16","18","19","1F","20","22","23","24","25","26","27","28","29","2A","2B","2C","2D","2S","2T","30","31","32","33","34","35","36","37","38","39","3T","40","41","42","46","47","48","49","4N","4S","4T","50","52","56","60","64","65","6W","70","71","74","75","79","7A","7L","7M","7N","7P","7Q","80","81","82","84","85","87","88","89","8D","8E","8V","90","94","98","99","CI","EA","EN","ES","ET","FL","IM","LV","N1","N2","N3","N4","N5","N6","N7","N8","N9","SA","SB","SC","SD","SE","SF","U5","U6","UB","VT","WF","WP"));
	//UB5.1
	private List<String> tile4 = new ArrayList<String>(Arrays.asList("46","47","49","4N","4S","4T","50","52","56","60","64","65","6W","70","71","74","75","79","7A","7L","80","81","82","83","84","85","87","88","89","8D","8E","8U","8V","90","94","97","98","99","CI","EA","EN","FL","LV","N1","N2","N3","N4","N5","N6","N7","N8","N9","SA","SB","SC","SD","SE","SF","U5","U6","UB","VT","WF","WP","01","02","03","04","05","06","07","10","19","1F","22","25","27","2C","2D","2S","2T","30","31","32","33","35","36","37","38","39","3T","40","41","7M","7N","7P","7Q"));
	//UB6.1
	private List<String> tile5 = new ArrayList<String>(Arrays.asList("01","02","03","04","05","06","07","10","12","13","14","15","16","18","19","1F","20","22","23","24","25","26","27","28","29","2A","2B","2C","2D","2S","2T","30","31","32","33","34","35","36","37","38","39","3T","40","41","42","46","47","48","49","4S","50","56","60","65","6W","70","71","74","7L","7M","7N","7P","7Q","82","84","87","88","89","8D","8E","90","94","98","99","CI","EA","EN","ES","ET","IM","LV","N1","N2","SC","SD","UB","VT"));
	//UB7.1
	private List<String> tile6 = new ArrayList<String>(Arrays.asList("46","47","49","4S","50","56","60","65","6W","70","71","74","7L","82","83","84","87","88","89","8D","8E","8U","90","94","97","98","99","CI","EA","EN","LV","N1","N2","SC","SD","UB","VT","01","02","03","04","05","06","07","10","19","1F","22","25","27","2C","2D","2S","2T","30","31","32","33","35","36","37","38","39","3T","40","41","7M","7N","7P","7Q"));
	//UB 8.1
	private List<String> tile7 = new ArrayList<String>(Arrays.asList("46","47","49","4S","50","56","60","65","6W","70","71","74","7L","82","83","84","87","88","89","8D","8E","8U","90","94","97","98","99","CI","EA","EN","LV","N1","N2","SC","SD","UB","VT","01","02","03","04","05","06","07","10","19","1F","22","25","27","2C","2D","2S","2T","30","31","32","33","35","36","37","38","39","3T","40","41","7M","7N","7P","7Q"));
	//UB 9.1
	private List<String> tile8 = new ArrayList<String>(Arrays.asList("01","02","03","04","05","06","07","10","12","13","14","15","16","18","19","1F","20","22","23","24","25","26","27","28","29","2A","2B","2C","2D","2S","2T","30","31","32","33","34","35","36","37","38","39","3T","40","41","42","46","47","48","49","4N","4S","4T","50","52","56","60","64","65","6W","70","71","74","75","79","7A","7L","7M","7N","7P","7Q","80","81","82","83","84","85","87","88","89","8D","8E","8U","8V","90","94","97","98","99","CI","EA","EN","ES","ET","FL","IM","LV","N1","N2","N3","N4","N5","N6","N7","N8","N9","SA","SB","SC","SD","SE","SF","U5","U6","UB","VT","WF","WP"));
	//UB 10.1
	private List<String> tile9 = new ArrayList<String>(Arrays.asList("46","47","49","4N","4S","4T","50","52","56","60","64","65","6W","70","71","74","75","79","7A","7L","80","81","82","84","85","87","88","89","8D","8E","8V","90","94","98","99","CI","EA","EN","FL","LV","N1","N2","N3","N4","N5","N6","N7","N8","N9","SA","SB","SC","SD","SE","SF","U5","U6","UB","VT","WF","WP","01","02","03","04","05","06","07","10","19","1F","22","25","27","2C","2D","2S","2T","30","31","32","33","35","36","37","38","39","3T","40","41","7M","7N","7P","7Q"));
	//UB 11.1
	private List<String> tile10 = new ArrayList<String>(Arrays.asList("46","47","49","4N","4S","4T","50","52","56","60","64","65","6W","70","71","74","75","79","7A","7L","80","81","82","83","84","85","87","88","89","8D","8E","8U","8V","90","94","97","98","99","CI","EA","EN","FL","LV","N1","N2","N3","N4","N5","N6","N7","N8","N9","SA","SB","SC","SD","SE","SF","U5","U6","UB","VT","WF","WP","01","02","03","04","05","06","07","10","19","1F","22","25","27","2C","2D","2S","2T","30","31","32","33","35","36","37","38","39","3T","40","41","7M","7N","7P","7Q"));
	//UB 12.1
	private List<String> tile11 = new ArrayList<String>(Arrays.asList("01","02","13","14","19","22","27","2S","32","33","35","36","37","39","40","46","47","49","4S","56","60","65","6W","70","71","74","7L","7M","7N","7P","7Q","82","83","84","87","88","89","8D","8E","8U","90","94","97","98","99","CI","EA","EN","ES","LV","N1","N2","SC","SD","UB","VT"));
	//UB 13.1
	private List<String> tile12 = new ArrayList<String>(Arrays.asList("01","02","13","14","19","22","27","2S","32","33","35","36","37","39","40","46","47","49","4S","56","60","65","6W","70","71","74","7L","7M","7N","7P","7Q","82","83","84","87","88","89","8D","8E","8U","90","94","97","98","99","CI","EA","EN","ES","LV","N1","N2","SC","SD","UB","VT"));
	//UB 14.1
	private List<String> tile13 = new ArrayList<String>(Arrays.asList("46","47","49","4S","56","60","65","6W","70","71","74","7L","82","83","84","87","88","89","8D","8E","8U","90","94","97","98","99","CI","EA","EN","LV","N1","N2","SC","SD","UB","VT"));
	//UB 15.1
	private List<String> tile14 = new ArrayList<String>(Arrays.asList("46","47","49","4S","56","60","65","6W","70","71","74","7L","82","83","84","87","88","89","8D","8E","8U","90","94","97","98","99","CI","EA","EN","LV","N1","N2","SC","SD","UB","VT"));
	//UB 16.1
	private List<String> tile15 = new ArrayList<String>(Arrays.asList("01","02","13","14","19","22","27","2S","32","33","35","36","37","39","40","46","47","49","4S","56","60","65","6W","70","71","74","7L","7M","7N","7P","7Q","82","83","84","87","88","89","8D","8E","8U","90","94","97","98","99","CI","EA","EN","ES","LV","N1","N2","SC","SD","UB","VT"));
	//UB 17.1
	private List<String> tile16 = new ArrayList<String>(Arrays.asList("01","02","13","14","19","22","27","2S","32","33","35","36","37","39","40","46","47","49","4S","56","60","65","6W","70","71","74","7L","7M","7N","7P","7Q","82","83","84","87","88","89","8D","8E","8U","90","94","97","98","99","CI","EA","EN","ES","LV","N1","N2","SC","SD","UB","VT"));
	//UB 18.1
	private List<String> tile17 = new ArrayList<String>(Arrays.asList("01","02","13","14","19","22","27","2S","32","33","35","36","37","39","40","46","47","49","4S","56","60","65","6W","70","71","74","7L","7M","7N","7P","7Q","82","83","84","87","88","89","8D","8E","8U","90","94","97","98","99","CI","EA","EN","ES","LV","N1","N2","SC","SD","UB","VT"));
	//UB 19.1
	private List<String> tile18 = new ArrayList<String>(Arrays.asList("01","02","13","14","19","22","27","2S","32","33","35","36","37","39","40","46","47","49","4S","56","60","65","6W","70","71","74","7L","7M","7N","7P","7Q","82","83","84","87","88","89","8D","8E","8U","90","94","97","98","99","CI","EA","EN","ES","LV","N1","N2","SC","SD","UB","VT"));
	//UB 20.1
	private List<String> tile19 = new ArrayList<String>(Arrays.asList("01","02","13","14","20","23","28","2S","33","34","35","36","37","39","40","7M","7N","7P","7Q","ES","ET"));
	//21.1
	private List<String> tile20 = new ArrayList<String>(Arrays.asList("46","47","49","4S","50","56","60","65","6W","70","71","74","7L","82","83","84","87","88","89","8D","8E","8U","90","94","97","98","99","CI","EA","EN","LV","N1","N2","SC","SD","UB","VT"));
	//UB 22.1 SUMMARY table
	private List<String> tile21 = new ArrayList<String>();
	//UB 23.1
	private List<String> tile22 = new ArrayList<String>(Arrays.asList("01","02","23","36","37","39","46","47","49","4S","50","56","60","65","6W","70","71","74","7L","82","83","84","87","88","89","8D","8E","8U","90","94","97","98","99","CI","EA","EN","LV","N1","N2","SC","SD","UB","VT"));
	//UB 24.1
	private List<String> tile23 = new ArrayList<String>(Arrays.asList("01","02","23","36","37","39","46","47","49","4S","50","56","60","65","6W","70","71","74","7L","82","83","84","87","88","89","8D","8E","8U","90","94","97","98","99","CI","EA","EN","LV","N1","N2","SC","SD","UB","VT"));
	//UB 25.1
	private List<String> tile24 = new ArrayList<String>();
	//UB 26.1
	private List<String> tile25 = new ArrayList<String>(Arrays.asList("01","02","22","36","37","39","46","47","49","4S","50","56","60","65","6W","70","71","74","7L","82","83","84","87","88","89","8D","8E","8U","90","94","97","98","99","CI","EA","EN","LV","N1","N2","SC","SD","UB","VT","03","04","05","06","07","08","09","10","11","17","19","1F","26","28","2C","2D","2S","2T","31","32","33","34","35","38","3T","40","41","7M","7N","7P","7Q"));
	//UB 27.1
	private List<String> tile26 = new ArrayList<String>(Arrays.asList("46","47","49","4S","50","56","60","65","6W","70","71","74","7L","82","83","84","87","88","89","8D","8E","8U","90","94","97","98","99","CI","EA","EN","LV","N1","N2","SC","SD","UB","VT"));
	//UB 28.1
	private List<String> tile27 = new ArrayList<String>();
	//UB 29.1
	private List<String> tile28 = new ArrayList<String>();
	//UB 30.1
	private List<String> tile29 = new ArrayList<String>();
	
	private List<NoTile> noTileList = new ArrayList<NoTile>();
	
	private List<NoTile> userTiles = new ArrayList<NoTile>();
	
	public UserProfileServiceImpl(UserProfileDAO userProfileDAO){
		this.userProfileDAO = userProfileDAO;
		
		this.noTileList.add(new NoTile(2,"","tile", "","mser-logo.jpg","www.mopar.com"));
		this.noTileList.add(new NoTile(19,"","chart", "","mser-logo.jpg","www.mopar.com"));
		this.noTileList.add(new NoTile(9,"","chart", "","brainboost.jpg","www.mopar.com"));
		this.noTileList.add(new NoTile(12,"","chart", "","brainboost.jpg","www.mopar.com"));
		this.noTileList.add(new NoTile(25,"","tile", "","cert-pro-banner.jpg","www.mopar.com"));
		this.noTileList.add(new NoTile(11,"","chart", "","cert-pro-experts.jpg","www.mopar.com"));
		this.noTileList.add(new NoTile(10,"","chart", "","cert-pro-experts.jpg","www.mopar.com"));
		this.noTileList.add(new NoTile(13,"","chart", "","cert-pro-banner.jpg","www.mopar.com"));
		this.noTileList.add(new NoTile(14,"","tile", "","topadvisor.jpg","www.mopar.com"));
		this.noTileList.add(new NoTile(15,"","tile", "","toptech.jpg","www.mopar.com"));
		this.noTileList.add(new NoTile(16,"","chart", "","toptech-topadv.jpg","www.mopar.com"));
		this.noTileList.add(new NoTile(17,"","chart", "","toptech-topadv.jpg","www.mopar.com"));
		this.noTileList.add(new NoTile(3,"","tile", "","mser-logo.jpg","www.mopar.com"));
		this.noTileList.add(new NoTile(4,"","tile", "","mser-logo.jpg","www.mopar.com"));
		this.noTileList.add(new NoTile(5,"","tile", "","mser-logo.jpg","www.mopar.com"));
		this.noTileList.add(new NoTile(6,"","tile", "","mser-logo.jpg","www.mopar.com"));
		this.noTileList.add(new NoTile(7,"","tile", "","mser-logo.jpg","www.mopar.com"));
		this.noTileList.add(new NoTile(8,"","tile", "","uconnect-logo.jpg","www.mopar.com"));
		this.noTileList.add(new NoTile(18,"","tile", "","wiadvisor-logo.jpg","www.mopar.com"));
		this.noTileList.add(new NoTile(20,"","chart", "","wiadvisor-logo.jpg","www.mopar.com"));
		this.noTileList.add(new NoTile(21,"","chart", "","wiadvisor-logo.jpg","www.mopar.com"));
		this.noTileList.add(new NoTile(22,"","chart", "","wiadvisor-logo.jpg","www.mopar.com"));
		this.noTileList.add(new NoTile(23,"","chart", "","wiadvisor-logo.jpg","www.mopar.com"));
		//this.noTileList.add(new NoTile(24,"","tile", "","wiadvisor-logo.jpg","www.mopar.com"));
		//this.noTileList.add(new NoTile(25,"","tile", "","wiadvisor-logo.jpg","www.mopar.com"));
		
	}

	@Override
	public UserProfileDTO getUserProfile(final InputRequest userRoleReq) {
		return this.userProfileDAO.getUserProfile(userRoleReq);
	}
	
	
	public List<NoTile> getuserTiles(String positionCode, String roleId, UserDetailsImpl user) {
		this.userTiles = new ArrayList<NoTile>();
		if(tile1.contains(positionCode)){
		this.userTiles.add(new NoTile(2,"","tile", "","mser-logo.jpg","www.mopar.com"));
		}
		
		if(tile2.contains(positionCode) || user.getUserId().toLowerCase().equals("dave") || user.getUserId().toLowerCase().equals("T1894DS".toLowerCase()) || user.getUserId().toLowerCase().equals("T0725BH".toLowerCase())){
		this.userTiles.add(new NoTile(19,"","chart", "","mser-logo.jpg","www.mopar.com"));
		}
		
		if(tile3.contains(positionCode)){
			this.userTiles.add(new NoTile(25,"","tile", "","cert-pro-banner.jpg","www.mopar.com"));
			}
		if(tile4.contains(positionCode)){
			this.userTiles.add(new NoTile(13,"","chart", "","cert-pro-banner.jpg","www.mopar.com"));
			}
		
		if(tile5.contains(positionCode)){
			this.userTiles.add(new NoTile(26,"","tile", "","brainboost.jpg","www.mopar.com"));
			}
		if(tile6.contains(positionCode)){
			this.userTiles.add(new NoTile(9,"","chart", "","brainboost.jpg","www.mopar.com"));
			}
		
		if(tile7.contains(positionCode)){
			this.userTiles.add(new NoTile(12,"","chart", "","brainboost.jpg","www.mopar.com"));
			}
		
		if(tile8.contains(positionCode)){
			this.userTiles.add(new NoTile(28,"","tile", "","cert-pro-experts.jpg","www.mopar.com"));
			}
		
		if(tile9.contains(positionCode)){
			this.userTiles.add(new NoTile(11,"","chart", "","cert-pro-experts.jpg","www.mopar.com"));
			}
		
		if(tile10.contains(positionCode)){
			this.userTiles.add(new NoTile(10,"","chart", "","cert-pro-experts.jpg","www.mopar.com"));
			}
		
		if(tile11.contains(positionCode)){
			this.userTiles.add(new NoTile(14,"","tile", "","topadvisor.jpg","www.mopar.com"));
			}
		
		
		if(tile12.contains(positionCode)){
			this.userTiles.add(new NoTile(15,"","tile", "","toptech.jpg","www.mopar.com"));
			}
		
		/*if(tile13.contains(positionCode)){
			this.userTiles.add(new NoTile(16,"","chart", "","toptech-topadv.jpg","www.mopar.com"));
			}*/
		//enrolled not enrolled 2 tiles
		if(tile14.contains(positionCode)){
			this.userTiles.add(new NoTile(16,"","chart", "","toptech-topadv.jpg","www.mopar.com"));
			this.userTiles.add(new NoTile(17,"","chart", "","toptech-topadv.jpg","www.mopar.com"));
			}
		
		if(tile15.contains(positionCode)){
			this.userTiles.add(new NoTile(29,"","tile", "","service-incentive.jpg","www.mopar.com")); //SERVICE INCENTIVE
			}
		
		
		if(tile16.contains(positionCode)){
			this.userTiles.add(new NoTile(20,"","chart", "","service-incentive.jpg","www.mopar.com")); // SERVICE INCENTIVE
			}
		
		if(tile17.contains(positionCode)){
			this.userTiles.add(new NoTile(22,"","chart", "","service-incentive.jpg","www.mopar.com")); // SERVICE INCENTIVE
			}
		
		if(tile18.contains(positionCode)){ 
			this.userTiles.add(new NoTile(21,"","chart", "","service-incentive.jpg","www.mopar.com")); // SERVICE INCENTIVE
			}
		
		if(tile19.contains(positionCode)){ 
			this.userTiles.add(new NoTile(24,"","tile", "","rewards.jpg","www.mopar.com")); // REWARDRED
			}
		
		if(tile20.contains(positionCode) || user.getUserId().toLowerCase().equals("dave") || user.getUserId().toLowerCase().equals("T1894DS".toLowerCase()) || user.getUserId().toLowerCase().equals("T0725BH".toLowerCase())){ 
			this.userTiles.add(new NoTile(23,"","chart", "","rewards.jpg","www.mopar.com")); // REWARDRED
			}
		
		/*// SUMMARY
		if(tile21.contains(positionCode)){ 
			this.userTiles.add(new NoTile(23,"","chart", "","mser-logo.jpg","www.mopar.com")); // SUMMARY
			}
			*/
			//Customer first
			if(tile22.contains(positionCode)){ 
			this.userTiles.add(new NoTile(32,"","chart", "","blank.jpg","www.mopar.com")); // //customer first
			}
			
			//customer first
			if(tile23.contains(positionCode)){ 
			this.userTiles.add(new NoTile(33,"","chart", "","blank.jpg","www.mopar.com")); // //customer first
			}
			/*
			//NOTHING
			if(tile24.contains(positionCode)){ 
			this.userTiles.add(new NoTile(23,"","chart", "","mser-logo.jpg","www.mopar.com")); // MVP
			}
			
		*/
		if(tile25.contains(positionCode) || user.getUserId().toLowerCase().equals("dave") || user.getUserId().toLowerCase().equals("T1894DS".toLowerCase()) || user.getUserId().toLowerCase().equals("T0725BH".toLowerCase())){ 
			this.userTiles.add(new NoTile(30,"","tile", "","blank.jpg","www.mopar.com")); // RETENTION
			}
			
			if(tile26.contains(positionCode) || user.getUserId().toLowerCase().equals("dave") || user.getUserId().toLowerCase().equals("T1894DS".toLowerCase()) || user.getUserId().toLowerCase().equals("T0725BH".toLowerCase())){ 
			this.userTiles.add(new NoTile(31,"","chart", "","blank.jpg","www.mopar.com")); // RETENTION
			}
			
		
		
		
		
		if(user.getUserId().toLowerCase().equals("dave") || user.getUserId().toLowerCase().equals("T1894DS".toLowerCase()) || user.getUserId().toLowerCase().equals("T0725BH".toLowerCase())){
			this.userTiles.add(new NoTile(3,"","tile", "","mser-logo.jpg","www.mopar.com"));
			this.userTiles.add(new NoTile(4,"","tile", "","mser-logo.jpg","www.mopar.com"));
			this.userTiles.add(new NoTile(5,"","tile", "","mser-logo.jpg","www.mopar.com"));
			this.userTiles.add(new NoTile(6,"","tile", "","mser-logo.jpg","www.mopar.com"));
			this.userTiles.add(new NoTile(7,"","tile", "","mser-logo.jpg","www.mopar.com"));
			this.userTiles.add(new NoTile(18,"","tile", "","wiadvisor-logo.jpg","www.mopar.com"));
			//this.userTiles.add(new NoTile(8,"","tile", "","uconnect-logo.jpg","www.mopar.com"));
		}
		
		
		return userTiles;
	}

}
