package co.grandcircus.hotelsearch.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.grandcircus.hotelsearch.entity.Hotel;




@Repository
@Transactional
public class HotelDao {

	@PersistenceContext
	EntityManager em;
		
	public List<Hotel> findAll(){
		List<Hotel> hotels = em.createQuery("FROM Hotel", Hotel.class)
		.getResultList();
		return hotels;
	}
	
	public List<Hotel> findByCity(){
		List<Hotel> hotels = em.createQuery("FROM Hotel", Hotel.class)
		.getResultList();
		return hotels;
	}
	
//	public interface HotelSearchDao extends JpaRepository<Hotel,Long>{
//		
//		List<Hotel> findAllByCityOrderByPricePerNightDesc(String city);
//	}

//	public List<Hotel> findAllByCityOrderByPricePerNight(String city) {
//		return null;
//	}
//	
	
	
}


