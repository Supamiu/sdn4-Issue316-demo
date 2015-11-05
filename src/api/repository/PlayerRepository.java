package api.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import api.data.Player;

@RepositoryRestResource(collectionResourceRel="player", path="player")
public interface PlayerRepository extends PagingAndSortingRepository<Player, Long> {
	
	Player findByid(@Param("0") long id);
}
