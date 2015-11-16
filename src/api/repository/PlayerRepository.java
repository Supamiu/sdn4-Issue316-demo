package api.repository;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import api.data.Player;

@RepositoryRestResource(collectionResourceRel="player", path="player")
public interface PlayerRepository extends PagingAndSortingRepository<Player, Long> {
	
	@Transactional
	@Query("Match (p:Player) WHERE p.name = {0}")
	public Player findByName(@Param("0") String name);
	
}
