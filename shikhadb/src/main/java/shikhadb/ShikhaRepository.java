package shikhadb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShikhaRepository extends JpaRepository<ShikhaRepo, Integer>{
	
	public ShikhaRepo findByName(String name);

}
