package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Dao.PaymentDao;
import com.niit.model.Payment;

@SuppressWarnings("unused")
@Controller
public class PaymentController {
	 @Autowired
	 Payment payment;
	
	@Autowired

    PaymentDao paymentDao;
	 
	 @ModelAttribute("payment")

		public Payment paymodel()
		{
			System.out.println("created payment model");
			return new Payment();

		}
	/* @RequestMapping("/payment")
		public ModelAndView()
		{
			ModelAndView mv = new ModelAndView("payment");
			return mv;

		}*/

@RequestMapping("/Payment")
      public String pay()
    {
	
	       return "Payment";
    
    }


@ModelAttribute("addtopymt")
public Payment newpayt()
{
	return new Payment();
	
}

@RequestMapping(value="/addpayment",method=RequestMethod.POST)
public String addingpytm(@ModelAttribute("addtopymt") Payment addtopymt )
{
	paymentDao.insertPayment(addtopymt);
	return "redirect:/";
}
@RequestMapping("/Checkout")
public String check()
{
	return "Checkout";
}











}