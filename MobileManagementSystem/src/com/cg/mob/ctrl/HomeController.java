package com.cg.mob.ctrl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.mob.dto.Mobile;
import com.cg.mob.service.IMobileService;

@Controller
public class HomeController {

	
	@Autowired
	private IMobileService mobSer;
	
	
	
	public IMobileService getMobSer() {
		return mobSer;
	}



	public void setMobSer(IMobileService mobSer) {
		this.mobSer = mobSer;
	}



	@RequestMapping("/index")
	public String getHomePage(HttpServletRequest req,Model m){
		m.addAttribute("appTitle",req.getServletContext().getServletContextName());
		List<Mobile> mobList = new ArrayList<Mobile>();
		mobList = mobSer.getAllMobile();
		
 		m.addAttribute("mList",mobList);
		
		return "index";
	}
	
	@RequestMapping("/book")
	public String prepareBooking(@RequestParam("mobId") int mobId,Model m){
		
		System.out.println("Mobile id is "+mobId);
		
		Mobile mob = mobSer.getMobileById(mobId);
		System.out.println(mob);
		m.addAttribute("mobDetails",mob);
		
	return "pages/MobileBook";
	}
	
}
