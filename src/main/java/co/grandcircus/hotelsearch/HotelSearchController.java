package co.grandcircus.hotelsearch;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.hotelsearch.dao.HotelDao;
import co.grandcircus.hotelsearch.entity.Hotel;


@Controller
public class HotelSearchController {

@Autowired
private HotelDao dao;


//@RequestMapping("/")
//public ModelAndView list() {
//	List<Restaurant> listOfRestaurants = dao.findAll();
//	//return new ModelAndView("index", "products", listOfProducts);
//	
//	//value must match name of JSP
//	ModelAndView mav = new ModelAndView("index");
//	
//	//key(list) - value(List of Products), pair
//	mav.addObject("Restaurants", listOfRestaurants);
//	return mav;
//	}

@RequestMapping("/")
public ModelAndView index() {
	List<Hotel> hotels = dao.findAll();
	return new ModelAndView("index", "hotels", hotels);
}

@RequestMapping("/hotel-result")
public ModelAndView list(@RequestParam("city")String city) {
	List<Hotel> hotels = dao.findByCity();
	return new ModelAndView("hotel-result", "hotels", hotels);
}
	
//@RequestMapping("/hotel-result")
//public ModelAndView ShowHotels(@RequestParam("city") String city) {
//	List<Hotel> hotels = dao.findAllByCityOrderByPricePerNight(city);
//	ModelAndView mv = new ModelAndView();
//	mv.addObject("hotels", hotels);
//	mv.addObject("city", city);
//	return mv;
//}
	
}
