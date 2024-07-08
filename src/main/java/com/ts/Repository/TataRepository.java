package com.ts.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ts.model.Tata;


@Repository
public interface TataRepository extends JpaRepository<Tata, Long> {
	
public List<Tata> findByusername(String username);
	
	

	

}
