package com.imperialm.imiservices.dao;

import java.util.List;
import com.imperialm.imiservices.dto.SIRewardsYOYGraphDTO;

public interface SIRewardsYOYGraphDAO {

	public static String SELECT_BY_PARENT_TERRITORY_AND_TOGGLE = "SELECT [ParentTerritory] 'parentTerritory', [ChildTerritory] 'childTerritory', [Toggle] 'toggle', [2016 YTD Earnings] 'earnings2016YTD', [BCDealerRank] 'bCDealerRank', [2017 YTD Earnings] 'earnings2017YTD', '' as error FROM [mser2].[dbo].[SIRewardsYOYGraph] where [ParentTerritory] LIKE ?0 AND [Toggle] LIKE ?1";
	public static String SELECT_BY_PARENT_TERRITORY_LIST_AND_TOGGLE = "SELECT [ParentTerritory] 'parentTerritory', [ChildTerritory] 'childTerritory', [Toggle] 'toggle', [2016 YTD Earnings] 'earnings2016YTD', [BCDealerRank] 'bCDealerRank', [2017 YTD Earnings] 'earnings2017YTD', '' as error FROM [mser2].[dbo].[SIRewardsYOYGraph] where [ParentTerritory] IN (?0) AND [Toggle] LIKE ?1";
	public static String SELECT_BY_PARENT_TERRITORY_LIST_AND_TOGGLE_DISTICT_PARENT = "SELECT [ParentTerritory] 'parentTerritory', '' as 'childTerritory', '' as 'toggle', SUM([2016 YTD Earnings]) 'earnings2016YTD', SUM([BCDealerRank]) 'bCDealerRank', SUM([2017 YTD Earnings]) 'earnings2017YTD', '' as error FROM [mser2].[dbo].[SIRewardsYOYGraph] where [ParentTerritory] IN (?0) AND [Toggle] LIKE ?1 GROUP BY [ParentTerritory]";
	
	public List<SIRewardsYOYGraphDTO> getSIRewardsYOYGraphByTerritoryAndToggle(String territory, String toggle);
	public List<SIRewardsYOYGraphDTO> getSIRewardsYOYGraphByTerritoryAndToggle(List<String> territory, String toggle);
	public List<SIRewardsYOYGraphDTO> getSIRewardsYOYGraphByTerritoryAndToggleFilterParent(List<String> territory, String toggle);
}
