package lec07.jth.world.main;

import lec07.jth.world.vo.chemical.Hcc;
import lec07.jth.world.vo.chemical.LGChem;
import lec07.jth.world.vo.chemical.LotteChemical;
import lec07.jth.world.vo.electronics.LGElectronics;
import lec07.jth.world.vo.electronics.SKhynix;
import lec07.jth.world.vo.electronics.SamsungElectronics;

public class MainMethod {
	
	public static void main(String[] args) {
		
		// 기업정보 셋팅
		// 한화솔루션 케미칼
		Hcc hcc 						= Hcc.getInstance();
		String hccName 					= String.valueOf("한화솔루션케미칼");
		String hccCompanyProperty 		= String.valueOf("화학");
		String hccHeadOfficeAddress 	= String.valueOf("서울특별시 중구 청계천로 86 한화빌딩");
		int hccTotalEmployee			= 5730;
		int hccSalesAmount 				= 34493;
		int hccPropertyAmount			= 82446;
		int hccDebtAmount				= 32289;
		
		hcc.setCompanyName(hccName);
		hcc.setCompanyProperty(hccCompanyProperty);
		hcc.setHeadOfficeAddress(hccHeadOfficeAddress);
		hcc.setTotalEmployee(hccTotalEmployee);
		hcc.setSalesAmount(hccSalesAmount);
		hcc.setPropertyAmount(hccPropertyAmount);
		hcc.setDebtAmount(hccDebtAmount);
		hcc.setCapitalAmount(hccPropertyAmount, hccDebtAmount);
		
		// 엘지화학
		LGChem lgChem 						= LGChem.getInstance();
		String lgChemName 					= String.valueOf("LG화학");
		String lgChemCompanyProperty 		= String.valueOf("화학");
		String lgChemHeadOfficeAddress 		= String.valueOf("서울 영등포구 여의대로 128");
		int lgChemTotalEmployee				= 20073;
		int lgChemSalesAmount 				= 286250;
		int lgChemPropertyAmount			= 340244;
		int lgChemDebtAmount				= 166406;
		
		lgChem.setCompanyName(lgChemName);
		lgChem.setCompanyProperty(lgChemCompanyProperty);
		lgChem.setHeadOfficeAddress(lgChemHeadOfficeAddress);
		lgChem.setTotalEmployee(lgChemTotalEmployee);
		lgChem.setSalesAmount(lgChemSalesAmount);
		lgChem.setPropertyAmount(lgChemPropertyAmount);
		lgChem.setDebtAmount(lgChemDebtAmount);
		lgChem.setCapitalAmount(lgChemPropertyAmount, lgChemDebtAmount);
		
		// 롯데케미칼
		LotteChemical lotteChemical 		= LotteChemical.getInstance();
		String lochemName 				= String.valueOf("롯데케미칼");
		String lochemCompanyProperty 		= String.valueOf("화학");
		String lochemHeadOfficeAddress 		= String.valueOf("서울특별시 송파구 올림픽로 300, 롯데월드타워 14F~16F");
		int lochemTotalEmployee				= 4540;
		int lochemSalesAmount 				= 151234;
		int lochemPropertyAmount			= 200431;
		int lochemDebtAmount				= 59899;
		
		lotteChemical.setCompanyName(lochemName);
		lotteChemical.setCompanyProperty(lochemCompanyProperty);
		lotteChemical.setHeadOfficeAddress(lochemHeadOfficeAddress);
		lotteChemical.setTotalEmployee(lochemTotalEmployee);
		lotteChemical.setSalesAmount(lochemSalesAmount);
		lotteChemical.setPropertyAmount(lochemPropertyAmount);
		lotteChemical.setDebtAmount(lochemDebtAmount);
		lotteChemical.setCapitalAmount(lochemPropertyAmount, lochemDebtAmount);
		
		// 엘지전자
		LGElectronics lgElectronics 		= LGElectronics.getInstance();
		String lgEName 						= String.valueOf("LG전자");
		String lgECompanyProperty 			= String.valueOf("전자");
		String lgEHeadOfficeAddress 		= String.valueOf("서울시 영등포구 여의대로 128 LG트윈타워");
		int lgETotalEmployee				= 39765;
		int lgESalesAmount 					= 286544;
		int lgEPropertyAmount				= 448598;
		int lgEDebtAmount					= 284347;
		
		lotteChemical.setCompanyName(lgEName);
		lotteChemical.setCompanyProperty(lgECompanyProperty);
		lotteChemical.setHeadOfficeAddress(lgEHeadOfficeAddress);
		lotteChemical.setTotalEmployee(lgETotalEmployee);
		lotteChemical.setSalesAmount(lgESalesAmount);
		lotteChemical.setPropertyAmount(lgEPropertyAmount);
		lotteChemical.setDebtAmount(lgEDebtAmount);
		lotteChemical.setCapitalAmount(lgEPropertyAmount, lgEDebtAmount);
		
		// 삼성전자
		SamsungElectronics samElec 				= SamsungElectronics.getInstance();
		String samElecName 						= String.valueOf("삼성전자");
		String samElecCompanyProperty 			= String.valueOf("전자");
		String samElecHeadOfficeAddress 		= String.valueOf("경기도 수원시 영통구 삼성로 129");
		int samElecTotalEmployee				= 106461;
		int samElecSalesAmount 					= 1547000;
		int samElecPropertyAmount				= 3017521;
		int samElecDebtAmount					= 872607;
		
		samElec.setCompanyName(samElecName);
		samElec.setCompanyProperty(samElecCompanyProperty);
		samElec.setHeadOfficeAddress(samElecHeadOfficeAddress);
		samElec.setTotalEmployee(samElecTotalEmployee);
		samElec.setSalesAmount(samElecSalesAmount);
		samElec.setPropertyAmount(samElecPropertyAmount);
		samElec.setDebtAmount(samElecDebtAmount);
		samElec.setCapitalAmount(samElecPropertyAmount, samElecDebtAmount);
		
		// sk하이닉스
		SKhynix skhynix 				= SKhynix.getInstance();
		String skhynixName 						= String.valueOf("SK하이닉스");
		String skhynixCompanyProperty 			= String.valueOf("전자");
		String skhynixHeadOfficeAddress 		= String.valueOf("경기도 이천시 부달읍 경청재돌 2091");
		int skhynixTotalEmployee				= 28482;
		int skhynixSalesAmount 					= 253000;
		int skhynixPropertyAmount				= 322160;
		int skhynixDebtAmount					= 168462;
		
		skhynix.setCompanyName(skhynixName);
		skhynix.setCompanyProperty(skhynixCompanyProperty);
		skhynix.setHeadOfficeAddress(skhynixHeadOfficeAddress);
		skhynix.setTotalEmployee(skhynixTotalEmployee);
		skhynix.setSalesAmount(skhynixSalesAmount);
		skhynix.setPropertyAmount(skhynixPropertyAmount);
		skhynix.setDebtAmount(skhynixDebtAmount);
		skhynix.setCapitalAmount(skhynixPropertyAmount, skhynixDebtAmount);
		
		System.out.println(hcc.toString());
		System.out.println(lgChem.toString());
		System.out.println(lotteChemical.toString());
		System.out.println(lgElectronics.toString());
		System.out.println(samElec.toString());
		System.out.println(skhynix.toString());
		
	}

}
