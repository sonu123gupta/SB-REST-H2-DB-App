package in.ashokit.resst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Porduct;
import in.ashokit.repo.ProductRepository;

@RestController
public class ProductRestController {

	@Autowired
	private ProductRepository repo;
	
	@PostMapping(value="/product",consumes = "application/json")
	public ResponseEntity<String> addProduct(@RequestBody Porduct product){
		
		repo.save(product);
		
		return new ResponseEntity<String> ("product saved",HttpStatus.CREATED);
		
	}
	
	@GetMapping(value = "/products", produces="application/json")
	public ResponseEntity<List<Porduct>> products(){
		
		List<Porduct> products = repo.findAll();
		return new ResponseEntity<List<Porduct>>(products, HttpStatus.OK);
		
	}
	
	
	
}
