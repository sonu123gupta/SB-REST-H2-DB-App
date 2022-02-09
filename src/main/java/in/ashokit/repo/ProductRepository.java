package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Porduct;



public interface ProductRepository extends JpaRepository<Porduct, Integer>{
	
	

}
