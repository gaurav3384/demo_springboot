package shikhadb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/db")
public class Shikhadb {
	/*private String username;
	private String password;*/
	@Autowired
	private ShikhaRepository shikhaRepository;
	
	/*public Shikhadb(String username, String pasword) {
		this.username=username;
		this.password=password;
	}*/
	@GetMapping("/{name}")
	public ShikhaRepo getUsername(@PathVariable("name")final String name){
		ShikhaRepo shikhaRepo=shikhaRepository.findByName(name);
		System.out.println("shikharepo: "+shikhaRepo);
		return shikhaRepo;
	}
	
	@PostMapping("/add")
	public ShikhaRepo addUser(@RequestBody  ShikhaRepo shikharepo){
		shikharepo.getAge();
		//shikharepo.getId();
		shikharepo.getName();
		shikharepo.getSex();
		//shikhadb.addUser(shikharepo);
		shikharepo =  shikhaRepository.save(shikharepo);
		return shikharepo;
	}
}
