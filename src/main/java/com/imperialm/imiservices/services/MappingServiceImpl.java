package com.imperialm.imiservices.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.imperialm.imiservices.dto.BrainBoostWinndersGraphDTO;
import com.imperialm.imiservices.dto.CertProfsExpertGraphDTO;
import com.imperialm.imiservices.dto.CertProfsWinnersGraphDTO;
import com.imperialm.imiservices.dto.CustomerFirstGraphDTO;
import com.imperialm.imiservices.dto.MSEREarningsDTO;
import com.imperialm.imiservices.dto.MSERGraphDTO;
import com.imperialm.imiservices.dto.MSERTopNDTO;
import com.imperialm.imiservices.dto.RewardRedemptionGraphDTO;
import com.imperialm.imiservices.dto.SIRewardsDetailsGraphDTO;
import com.imperialm.imiservices.dto.SIRewardsYOYGraphDTO;
import com.imperialm.imiservices.dto.TTTAEnrolledDTO;
import com.imperialm.imiservices.dto.TTTATopNDTO;
import com.imperialm.imiservices.model.Chart;
import com.imperialm.imiservices.model.ChartData;
import com.imperialm.imiservices.model.TileAttribute1;
import com.imperialm.imiservices.model.TopTenTableData;
import com.imperialm.imiservices.model.response.TotalName;

@Service
public class MappingServiceImpl {

	public MappingServiceImpl(){}
	
	
	public Chart MapMSEREarningsDTOtoChart(List<MSEREarningsDTO> MSEREarningDTO, String title, String subTitle, String xaxisTitle, String yaxisTitle, String type){
		Chart chart = new Chart();
		chart.setTitle(title);
		chart.setSubTitle(subTitle);
		chart.setType(type);
		chart.setXaxisTitle(xaxisTitle);
		chart.setYaxisTitle(yaxisTitle);
		
		chart.setData(this.MapMSEREarningDTOtoChartData(MSEREarningDTO));
		
		return chart;
	}
	
	
	public Chart MapMSERGraphDTOtoChart(List<MSERGraphDTO> MSERGraphDTO, String title, String subTitle, String xaxisTitle, String yaxisTitle, String type){
		Chart chart = new Chart();
		chart.setTitle(title);
		chart.setSubTitle(subTitle);
		chart.setType(type);
		chart.setXaxisTitle(xaxisTitle);
		chart.setYaxisTitle(yaxisTitle);
		
		chart.setData(this.MapMSERGraphDTOtoChartData(MSERGraphDTO));
		
		return chart;
	}
	
	
	public Chart MapTTTAEnrolledDTOtoChart(List<TTTAEnrolledDTO> TTTAEnrolledDTO, String title, String subTitle, String xaxisTitle, String yaxisTitle, String type){
		Chart chart = new Chart();
		chart.setTitle(title);
		chart.setSubTitle(subTitle);
		chart.setType(type);
		chart.setXaxisTitle(xaxisTitle);
		chart.setYaxisTitle(yaxisTitle);
		
		chart.setData(this.MapTTTAEnrolledDTOtoChartData(TTTAEnrolledDTO));
		
		return chart;
	}
	
	public Chart BrainBoostWinndersGraphDTOtoChart(List<BrainBoostWinndersGraphDTO> BrainBoostWinndersGraphDTO, String title, String subTitle, String xaxisTitle, String yaxisTitle, String type, String graph){
		Chart chart = new Chart();
		chart.setTitle(title);
		chart.setSubTitle(subTitle);
		chart.setType(type);
		chart.setXaxisTitle(xaxisTitle);
		chart.setYaxisTitle(yaxisTitle);
				
		chart.setData(this.BrainBoostWinndersGraphDTOtoChartData(BrainBoostWinndersGraphDTO, graph));
		
		return chart;
	}
	
	public Chart SIRewardsDetailsGraphDTOtoChart(List<SIRewardsDetailsGraphDTO> SIRewardsDetailsGraphDTO, String title, String subTitle, String xaxisTitle, String yaxisTitle, String type, String graph){
		Chart chart = new Chart();
		chart.setTitle(title);
		chart.setSubTitle(subTitle);
		chart.setType(type);
		chart.setXaxisTitle(xaxisTitle);
		chart.setYaxisTitle(yaxisTitle);
				
		chart.setData(this.SIRewardsDetailsGraphDTOtoChartData(SIRewardsDetailsGraphDTO, graph));
		
		return chart;
	}
	
	public Chart RewardRedemptionGraphDTOtoChart(List<RewardRedemptionGraphDTO> RewardRedemptionGraphDTO, String title, String subTitle, String xaxisTitle, String yaxisTitle, String type, String graph){
		Chart chart = new Chart();
		chart.setTitle(title);
		chart.setSubTitle(subTitle);
		chart.setType(type);
		chart.setXaxisTitle(xaxisTitle);
		chart.setYaxisTitle(yaxisTitle);
				
		chart.setData(this.RewardRedemptionGraphDTOtoChartData(RewardRedemptionGraphDTO, graph));
		
		return chart;
	}
	
	public Chart CertProfsExpertGraphDTOtoChartTotalPoints(List<CertProfsExpertGraphDTO> CertProfsExpertGraphDTO, String title, String subTitle, String xaxisTitle, String yaxisTitle, String type){
		Chart chart = new Chart();
		chart.setTitle(title);
		chart.setSubTitle(subTitle);
		chart.setType(type);
		chart.setXaxisTitle(xaxisTitle);
		chart.setYaxisTitle(yaxisTitle);
		
		chart.setData(this.CertProfsExpertGraphDTOtoChartDataTotalPoints(CertProfsExpertGraphDTO));
		
		return chart;
	}
	
	public Chart CertProfsExpertGraphDTOtoChartCert(List<CertProfsExpertGraphDTO> CertProfsExpertGraphDTO, String title, String subTitle, String xaxisTitle, String yaxisTitle, String type){
		Chart chart = new Chart();
		chart.setTitle(title);
		chart.setSubTitle(subTitle);
		chart.setType(type);
		chart.setXaxisTitle(xaxisTitle);
		chart.setYaxisTitle(yaxisTitle);
		
		chart.setData(this.CertProfsExpertGraphDTOtoChartDataCert(CertProfsExpertGraphDTO));
		
		return chart;
	}
	
	public Chart CertProfsWinnersGraphDTOtoChart(List<CertProfsWinnersGraphDTO> CertProfsWinnersGraphDTO, String title, String subTitle, String xaxisTitle, String yaxisTitle, String type){
		Chart chart = new Chart();
		chart.setTitle(title);
		chart.setSubTitle(subTitle);
		chart.setType(type);
		chart.setXaxisTitle(xaxisTitle);
		chart.setYaxisTitle(yaxisTitle);
		
		chart.setData(this.CertProfsWinnersGraphDTOtoChartData(CertProfsWinnersGraphDTO));
		
		return chart;
	}
	
	public Chart CustomerFirstGraphDTOtoChart(List<CustomerFirstGraphDTO> CustomerFirstGraphDTO, String title, String subTitle, String xaxisTitle, String yaxisTitle, String type){
		Chart chart = new Chart();
		chart.setTitle(title);
		chart.setSubTitle(subTitle);
		chart.setType(type);
		chart.setXaxisTitle(xaxisTitle);
		chart.setYaxisTitle(yaxisTitle);
		
		chart.setData(this.CustomerFirstGraphDTOtoChartData(CustomerFirstGraphDTO));
		
		return chart;
	}
	
	
	public Chart SIRewardsYOYGraphDTOtoChart(List<SIRewardsYOYGraphDTO> SIRewardsYOYGraphDTO, String title, String subTitle, String xaxisTitle, String yaxisTitle, String type){
		Chart chart = new Chart();
		chart.setTitle(title);
		chart.setSubTitle(subTitle);
		chart.setType(type);
		chart.setXaxisTitle(xaxisTitle);
		chart.setYaxisTitle(yaxisTitle);
		
		chart.setData(this.SIRewardsYOYGraphDTOtoChartData(SIRewardsYOYGraphDTO));
		
		return chart;
	}
	
	public List<ChartData> MapMSEREarningDTOtoChartData(List<MSEREarningsDTO> MSEREarningDTO){
		List<ChartData> list = new ArrayList<ChartData>();
		
		for (MSEREarningsDTO Earning : MSEREarningDTO) {
			list.add(this.MapMSEREarningDTOtoChartData(Earning));
		}
		
		return list;
	}
	
	
	public List<ChartData> MapMSERGraphDTOtoChartData(List<MSERGraphDTO> MSERGraphDTO){
		List<ChartData> list = new ArrayList<ChartData>();
		
		for (MSERGraphDTO Earning : MSERGraphDTO) {
			list.add(this.MapMSERGraphDTOtoChartData(Earning));
		}
		
		return list;
	}
	
	public List<ChartData> MapTTTAEnrolledDTOtoChartData(List<TTTAEnrolledDTO> TTTAEnrolledDTO){
		List<ChartData> list = new ArrayList<ChartData>();
		
		for (TTTAEnrolledDTO Earning : TTTAEnrolledDTO) {
			list.add(this.MapTTTAEnrolledDTOtoChartData(Earning));
		}
		
		return list;
	}
	
	public List<ChartData> BrainBoostWinndersGraphDTOtoChartData(List<BrainBoostWinndersGraphDTO> BrainBoostWinndersGraphDTO, String type){
		List<ChartData> list = new ArrayList<ChartData>();
		
		if(type.equals("Winners")){
			for (BrainBoostWinndersGraphDTO item : BrainBoostWinndersGraphDTO) {
				list.add(this.BrainBoostWinndersGraphDTOtoChartDataWinners(item));
			}
		}else if(type.equals("Awards")){
			for (BrainBoostWinndersGraphDTO item : BrainBoostWinndersGraphDTO) {
				list.add(this.BrainBoostWinndersGraphDTOtoChartDataAwards(item));
			}
		}
		
		return list;
	}
	
	public List<ChartData> SIRewardsDetailsGraphDTOtoChartData(List<SIRewardsDetailsGraphDTO> SIRewardsDetailsGraphDTO, String type){
		List<ChartData> list = new ArrayList<ChartData>();
		
		if(type.equals("Projected")){
			for (SIRewardsDetailsGraphDTO item : SIRewardsDetailsGraphDTO) {
				list.add(this.SIRewardsDetailsGraphDTOtoChartDataProjected(item));
			}
		}else if(type.equals("Average Score")){
			for (SIRewardsDetailsGraphDTO item : SIRewardsDetailsGraphDTO) {
				list.add(this.SIRewardsDetailsGraphDTOtoChartDataAverageScore(item));
			}
		}
		
		return list;
	}
	
	public List<ChartData> RewardRedemptionGraphDTOtoChartData(List<RewardRedemptionGraphDTO> RewardRedemptionGraphDTO, String type){
		List<ChartData> list = new ArrayList<ChartData>();
		
		if(type.equals("EarnedPoints")){
			for (RewardRedemptionGraphDTO item : RewardRedemptionGraphDTO) {
				list.add(this.RewardRedemptionGraphDTOtoChartDataEarnedPoints(item));
			}
		}
		
		return list;
	}
	
	public List<ChartData> CertProfsExpertGraphDTOtoChartDataTotalPoints(List<CertProfsExpertGraphDTO> CertProfsExpertGraphDTO){
		List<ChartData> list = new ArrayList<ChartData>();
		
		for (CertProfsExpertGraphDTO item : CertProfsExpertGraphDTO) {
			list.add(this.CertProfsExpertGraphDTOtoChartDataTotalPoints(item));
		}
		
		return list;
	}
	
	public List<ChartData> CertProfsWinnersGraphDTOtoChartData(List<CertProfsWinnersGraphDTO> CertProfsWinnersGraphDTO){
		List<ChartData> list = new ArrayList<ChartData>();
		
		for (CertProfsWinnersGraphDTO item : CertProfsWinnersGraphDTO) {
			list.add(this.CertProfsWinnersGraphDTOtoChartData(item));
		}
		
		return list;
	}
	
	public List<ChartData> CustomerFirstGraphDTOtoChartData(List<CustomerFirstGraphDTO> CustomerFirstGraphDTO){
		List<ChartData> list = new ArrayList<ChartData>();
		
		for (CustomerFirstGraphDTO item : CustomerFirstGraphDTO) {
			list.add(this.CustomerFirstGraphDTOtoChartData(item));
		}
		
		return list;
	}
	
	public List<ChartData> SIRewardsYOYGraphDTOtoChartData(List<SIRewardsYOYGraphDTO> SIRewardsYOYGraphDTO){
		List<ChartData> list = new ArrayList<ChartData>();
		
		for (SIRewardsYOYGraphDTO item : SIRewardsYOYGraphDTO) {
			list.add(this.SIRewardsYOYGraphDTOtoChartData(item));
		}
		
		return list;
	}
	
	public List<ChartData> CertProfsExpertGraphDTOtoChartDataCert(List<CertProfsExpertGraphDTO> CertProfsExpertGraphDTO){
		List<ChartData> list = new ArrayList<ChartData>();
		for (CertProfsExpertGraphDTO item : CertProfsExpertGraphDTO) {
			boolean addNew = true;
				for(ChartData chart: list){
					if(chart.getName().equals(item.getParentTerritory())){
						chart.addData(this.CertProfsExpertGraphDTOtoChartDataCert(item));
						addNew = false;
					}
				}
				
			if(addNew){
				ChartData data = new ChartData();
				data.setName(item.getParentTerritory());
				data.addData(this.CertProfsExpertGraphDTOtoChartDataCert(item));
				list.add(data);
			}
		}
		
		return list;
	}
	
	public ChartData MapMSEREarningDTOtoChartData(MSEREarningsDTO MSEREarningDTO){
		ChartData chartData = new ChartData();
		
		chartData.setName(MSEREarningDTO.getTerritory());
		
		List<ChartData> data = new ArrayList<ChartData>();
		ChartData MoparParts , mvp, MagnetiMarelli, PartsCounter, ExpressLane, wiAdvisor, uConnect;
		MoparParts = new ChartData("Mopar Parts", MSEREarningDTO.getMoparParts());
		mvp = new ChartData("mvp",MSEREarningDTO.getMvp());
		MagnetiMarelli = new ChartData("Magneti Marelli",MSEREarningDTO.getMagnetiMarelli());
		PartsCounter = new ChartData("Parts Counter", MSEREarningDTO.getPartsCounter());
		wiAdvisor = new ChartData("wiAdvisor", MSEREarningDTO.getWiAdvisor());
		ExpressLane = new ChartData("Express Lane", MSEREarningDTO.getExpressLane());
		uConnect = new ChartData("uConnect", MSEREarningDTO.getuConnect());
		
		data.add(MoparParts);
		data.add(mvp);
		data.add(MagnetiMarelli);
		data.add(PartsCounter);
		data.add(wiAdvisor);
		data.add(ExpressLane);
		data.add(uConnect);
		
		chartData.setData(data);
		
		return chartData;
	}
	
	public ChartData MapMSERGraphDTOtoChartData(MSERGraphDTO MSERGraphDTO){
		ChartData chartData = new ChartData();
		
		chartData.setName(MSERGraphDTO.getChild());
		
		List<ChartData> data = new ArrayList<ChartData>();
		ChartData MoparParts , mvp, MagnetiMarelli, PartsCounter, ExpressLane, wiAdvisor, uConnect;
		
		MoparParts = new ChartData("Mopar Parts", 0);
		mvp = new ChartData("MVP",0);
		MagnetiMarelli = new ChartData("Magneti Marelli",0);
		PartsCounter = new ChartData("Part Counter", 0);
		wiAdvisor = new ChartData("wiAdvisor", 0);
		ExpressLane = new ChartData("Express Lane", 0);
		uConnect = new ChartData("uConnect", 0);
		
		if(MSERGraphDTO.getProgram().equals("Express Lane")){
			ExpressLane.setValue(MSERGraphDTO.getAmount());
    	}else if(MSERGraphDTO.getProgram().equals("Magneti Marelli")){
    		MagnetiMarelli.setValue(MSERGraphDTO.getAmount());
    	}else if(MSERGraphDTO.getProgram().equals("Mopar Parts")){
    		MoparParts.setValue(MSERGraphDTO.getAmount());
    	}else if(MSERGraphDTO.getProgram().equals("MVP")){
    		mvp.setValue(MSERGraphDTO.getAmount());
    	}else if(MSERGraphDTO.getProgram().equals("Part Counter")){
    		PartsCounter.setValue(MSERGraphDTO.getAmount());
    	}else if(MSERGraphDTO.getProgram().equals("wiAdvisor")){
    		wiAdvisor.setValue(MSERGraphDTO.getAmount());
    	}else if(MSERGraphDTO.getProgram().equals("uConnect")){
    		uConnect.setValue(MSERGraphDTO.getAmount());
    	}
		
		
		
		data.add(MoparParts);
		data.add(mvp);
		data.add(MagnetiMarelli);
		data.add(PartsCounter);
		data.add(wiAdvisor);
		data.add(ExpressLane);
		data.add(uConnect);
		
		chartData.setData(data);
		
		return chartData;
	}
	
	public ChartData MapTTTAEnrolledDTOtoChartData(TTTAEnrolledDTO TTTAEnrolledDTO){
		ChartData chartData = new ChartData();
		
		chartData.setName(TTTAEnrolledDTO.getTerritory());
		
		List<ChartData> data = new ArrayList<ChartData>();
		ChartData groupA , groupB, groupC, groupD, groupE;
		groupA = new ChartData("Group A", TTTAEnrolledDTO.getGroupA());
		groupB = new ChartData("Group B",TTTAEnrolledDTO.getGroupB());
		groupC = new ChartData("Group C",TTTAEnrolledDTO.getGroupC());
		groupD = new ChartData("Group D", TTTAEnrolledDTO.getGroupD());
		groupE = new ChartData("Group E", TTTAEnrolledDTO.getGroupE());
		
		data.add(groupA);
		data.add(groupB);
		data.add(groupC);
		data.add(groupD);
		data.add(groupE);
		
		chartData.setData(data);
		
		return chartData;
	}
	
	public ChartData BrainBoostWinndersGraphDTOtoChartDataWinners(BrainBoostWinndersGraphDTO BrainBoostWinndersGraphDTO){
		ChartData chartData = new ChartData();		
		chartData.setName(BrainBoostWinndersGraphDTO.getParentTerritory());
		chartData.setValue(BrainBoostWinndersGraphDTO.getWinners());
		return chartData;
	}
	
	public ChartData SIRewardsDetailsGraphDTOtoChartDataProjected(SIRewardsDetailsGraphDTO SIRewardsDetailsGraphDTO){
		ChartData chartData = new ChartData();		
		chartData.setName(SIRewardsDetailsGraphDTO.getParentTerritory());
		chartData.setValue(SIRewardsDetailsGraphDTO.getProjectedEarnings());
		return chartData;
	}
	
	public ChartData SIRewardsDetailsGraphDTOtoChartDataAverageScore(SIRewardsDetailsGraphDTO SIRewardsDetailsGraphDTO){
		ChartData chartData = new ChartData();		
		chartData.setName(SIRewardsDetailsGraphDTO.getParentTerritory());
		chartData.setValue(SIRewardsDetailsGraphDTO.getAvgSurveyScore());
		return chartData;
	}
	
	public ChartData RewardRedemptionGraphDTOtoChartDataEarnedPoints(RewardRedemptionGraphDTO RewardRedemptionGraphDTO){
		ChartData chartData = new ChartData();		
		chartData.setName(RewardRedemptionGraphDTO.getParentTerritory());
		chartData.setValue(RewardRedemptionGraphDTO.getEarnedPoints());
		return chartData;
	}
	
	public ChartData BrainBoostWinndersGraphDTOtoChartDataAwards(BrainBoostWinndersGraphDTO BrainBoostWinndersGraphDTO){
		ChartData chartData = new ChartData();
		ChartData excellenceCard = new ChartData();
		ChartData awardPoints = new ChartData();
		
		chartData.setName(BrainBoostWinndersGraphDTO.getParentTerritory());
		
		excellenceCard.setName("Excellence Card");
		excellenceCard.setValue(BrainBoostWinndersGraphDTO.getEarnings());
		
		awardPoints.setName("Award Points");
		awardPoints.setValue(BrainBoostWinndersGraphDTO.getPoints());
		
		chartData.addData(excellenceCard);
		chartData.addData(awardPoints);
		
		return chartData;
	}
	
	public ChartData CertProfsExpertGraphDTOtoChartDataTotalPoints(CertProfsExpertGraphDTO CertProfsExpertGraphDTO){
		ChartData chartData = new ChartData();		
		chartData.setName(CertProfsExpertGraphDTO.getParentTerritory());
		chartData.setValue(CertProfsExpertGraphDTO.getTotalPoints());
		return chartData;
	}
	
	public ChartData CertProfsExpertGraphDTOtoChartDataCert(CertProfsExpertGraphDTO CertProfsExpertGraphDTO){
		ChartData chartData = new ChartData();		
		chartData.setName(CertProfsExpertGraphDTO.getCertType());
		chartData.setValue(CertProfsExpertGraphDTO.getCert());
		return chartData;
	}
	
	public ChartData CertProfsWinnersGraphDTOtoChartData(CertProfsWinnersGraphDTO CertProfsWinnersGraphDTO){
		ChartData chartData = new ChartData();
		ChartData certified = new ChartData();
		ChartData certifiedSpacialist = new ChartData();
		ChartData masterCertified = new ChartData();
		
		chartData.setName(CertProfsWinnersGraphDTO.getParentTerritory());
		
		certified.setName("Certified");
		certified.setValue(Double.parseDouble(CertProfsWinnersGraphDTO.getCertified()));
		
		certifiedSpacialist.setName("Certified Spacialist");
		certifiedSpacialist.setValue(Double.parseDouble(CertProfsWinnersGraphDTO.getCertifiedSpecalist()));
		
		masterCertified.setName("Master Certified");
		masterCertified.setValue(Double.parseDouble(CertProfsWinnersGraphDTO.getMasterCertified()));
		
		chartData.addData(certified);
		chartData.addData(certifiedSpacialist);
		chartData.addData(masterCertified);
		
		chartData.setName(CertProfsWinnersGraphDTO.getParentTerritory());
		return chartData;
	}
	
	public ChartData CustomerFirstGraphDTOtoChartData(CustomerFirstGraphDTO CustomerFirstGraphDTO){
		ChartData chartData = new ChartData();
		ChartData certified = new ChartData();
		ChartData certifiedSpacialist = new ChartData();
		ChartData voe = new ChartData();
		ChartData training = new ChartData();
		ChartData facility = new ChartData();
		ChartData masterCertified = new ChartData();
		ChartData CFAFEAwardCertification = new ChartData();
		
		chartData.setName(CustomerFirstGraphDTO.getChildTerritory());
		
		certified.setName("Level 0");
		certified.setValue(CustomerFirstGraphDTO.getNoCertification());
		
		certifiedSpacialist.setName("Performance");
		certifiedSpacialist.setValue(CustomerFirstGraphDTO.getPerformance());
		
		masterCertified.setName("Process");
		masterCertified.setValue(CustomerFirstGraphDTO.getProcess());
		
		voe.setName("Voice of Employee");
		voe.setValue(CustomerFirstGraphDTO.getVoiceofEmployee());
		
		training.setName("Training");
		training.setValue(CustomerFirstGraphDTO.getTraining());
		
		facility.setName("Facility");
		facility.setValue(CustomerFirstGraphDTO.getFacility());
		
		CFAFEAwardCertification.setName("CFAFE Award Certification");
		CFAFEAwardCertification.setValue(CustomerFirstGraphDTO.getFacility());
		
		
		chartData.addData(certified);
		chartData.addData(certifiedSpacialist);
		chartData.addData(masterCertified);
		chartData.addData(voe);
		chartData.addData(training);
		chartData.addData(facility);
		chartData.addData(CFAFEAwardCertification);
		
		return chartData;
	}
	
	public ChartData SIRewardsYOYGraphDTOtoChartData(SIRewardsYOYGraphDTO SIRewardsYOYGraphDTO){
		ChartData chartData = new ChartData();
		ChartData certified = new ChartData();
		ChartData certifiedSpacialist = new ChartData();
		
		chartData.setName(SIRewardsYOYGraphDTO.getParentTerritory());
		
		certified.setName("2016");
		certified.setValue(SIRewardsYOYGraphDTO.getEarnings2016YTD());
		
		certifiedSpacialist.setName("2017");
		certifiedSpacialist.setValue(SIRewardsYOYGraphDTO.getEarnings2017YTD());
		
		chartData.addData(certified);
		chartData.addData(certifiedSpacialist);
		
		chartData.setName(SIRewardsYOYGraphDTO.getParentTerritory());
		return chartData;
	}
	
	
	public TopTenTableData MapTTTATopNDTOtoTopTenTableData(List<TTTATopNDTO> TTTATopNDTO, String tableName, List<String> tableHeader){
		TopTenTableData topTenTableData = new TopTenTableData();
		
		topTenTableData.setTableHeader(tableHeader);
		topTenTableData.setTableName(tableName);
		
		List<Object> data = new ArrayList<Object>();
		
		for(TTTATopNDTO item: TTTATopNDTO){
			List<Object> items = new ArrayList<Object>();
			if(item.getError().equals("") || item.getError().equals(null)){
				items.add(item.getName());
				items.add(item.getDealerName());
				items.add(item.getParentTerritory());
				items.add(item.getTotalSurveys());
				items.add(item.getAvgSurveyScore());
			}
			data.add(items);
		}
		
		topTenTableData.setData(data);
		
		return topTenTableData;
	}
	
	public TopTenTableData MapMSERTopNDTOtoTopTenTableData(List<MSERTopNDTO> MSERTopNDTO, String tableName, List<String> tableHeader){
		TopTenTableData topTenTableData = new TopTenTableData();
		
		topTenTableData.setTableHeader(tableHeader);
		topTenTableData.setTableName(tableName);
		
		List<Object> data = new ArrayList<Object>();
		if(MSERTopNDTO.size() == 10){
		for(MSERTopNDTO item: MSERTopNDTO){
			List<Object> items = new ArrayList<Object>();
			if(item.getError().equals("") || item.getError().equals(null)){
				items.add(item.getName());
				items.add(item.getDealerName());
				items.add(item.getParentTerritory());
				items.add(item.getEarnings());
			}
			data.add(items);
		}
		}else{
			for(MSERTopNDTO item: MSERTopNDTO){
				List<Object> items = new ArrayList<Object>();
				if(item.getError().equals("") || item.getError().equals(null)){
					items.add(item.getName());
					items.add(item.getQuantity());
				}
				data.add(items);
			}
		}
		
		topTenTableData.setData(data);
		
		return topTenTableData;
	}
	
	public TileAttribute1 MapTotalNameToTileAttribute(TotalName totalName){
		TileAttribute1 attribute= new TileAttribute1();
		attribute.setName(totalName.getName());
		attribute.setValue(totalName.getTotal());
		return attribute;
	}
	
}
