package com.cg.mob.ctrl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.mob.dto.Mobile;
import com.cg.mob.dto.PurchaseDetails;
import com.cg.mob.service.IMobileService;


@Controller
@RequestMapping("/mobile")
public class MobileController {
	
	
	@Autowired
	private IMobileService mobSer;
	
	
	
	public IMobileService getMobSer() {
		return mobSer;
	}



	public void setMobSer(IMobileService mobSer) {
		this.mobSer = mobSer;
	}

	
	
	public Model setDataInModel(int mId, Model m){
		
		System.out.println("Mobile id is "+mId);
		
		Mobile mob = mobSer.getMobileById(mId);
		System.out.println(mob);
		
		
		List<Integer> idList = mobSer.getAllMobileIds();
		System.out.println(idList);
	
		m.addAttribute("mList",idList);
		m.addAttribute("mobDetails",mob);
		m.addAttribute("purchaseDetails",new PurchaseDetails());
		
		return m;
	}
	
	
	@RequestMapping("/book")
	public String prepareBooking(@RequestParam("mobId") int mobId,Model m){
		
		m = setDataInModel(mobId, m);
		
	return "pages/MobileBook";
	}
	
	//public String addMobileDetails(@RequestParam("mobId") int mId,@ModelAttribute("purchaseDetails")@Valid PurchaseDetails pDetail,BindingResult result,Model m){
		
	@RequestMapping("/addMobile")
	public ModelAndView addMobileDetails(@RequestParam("mobId") int mId,@ModelAttribute("purchaseDetails")@Valid PurchaseDetails pDetail,BindingResult result,Model m){
		/**
		
		ModelAndView mv = new ModelAndView("redirect:list.obj");
		if(result.getErrorCount()==0){
			itemService.addItem(item);
		}else{
			mv.addObject("item",item);
			mv.setViewName("items/new");
		}
		
		* */
		
		if(result.getErrorCount() == 0){
			System.out.println("Comming Mobile Id"+mId);
			
			System.out.println("in insert part" + pDetail);
			
			Mobile mob = mobSer.getMobileById(mId);
			System.out.println(mob);
			pDetail.setTotalAmt((pDetail.getBookedQuan() * mob.getPrice()));
			
			//update quantity
			mobSer.updateMobileQuantity(pDetail.getBookedQuan(),mob.getMobileId());
			
			
			
			//Add Purchase Details
			pDetail = mobSer.addPurchaseDetails(pDetail);
			
			
			ModelAndView mv = new ModelAndView("pages/SuccessPage");
			
			
			System.out.println("After  "+pDetail);	
			
			mv.addObject("mobileDetails",mob);
			mv.addObject("purDetails",pDetail);
			
			return mv;
			
		}
		
		else{
			System.out.println("in error function");
			//m = setDataInModel(mId, m);
			/*******************************************/
			
			Mobile mob = mobSer.getMobileById(mId);
			System.out.println(mob);
			
			
			List<Integer> idList = mobSer.getAllMobileIds();
			System.out.println(idList);
			
			ModelAndView mv = new ModelAndView("pages/MobileBook");

			mv.addObject("mList",idList);
			mv.addObject("mobDetails",mob);
			//mv.addObject("purchaseDetails",new PurchaseDetails());
			
			/******************************************/
			
			return mv;
		}
		
		
			
	}
	
}
