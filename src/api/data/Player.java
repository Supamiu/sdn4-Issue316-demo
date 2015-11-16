package api.data;

import java.util.Set;

import org.neo4j.graphdb.Direction;
import org.springframework.data.annotation.Transient;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
/**
 * 
 * @author Miu
 *
 * Modèle qui représente le joueur
 */
public class Player {

	@GraphId Long id;
	/**
	 * Le nom du player dans la base
	 */
	String name;
	
	/**
	 * L'email du player
	 */
	String email;
	
	/**
	 * Le hash SHA-256 du password du player
	 */
	@Transient
	String password;
	
	/**
	 * La quote elo du joueur, pour les classements
	 */
	int elo = 1200;
	
	@RelatedTo(type="FRIEND_WITH", direction = Direction.BOTH)
	Set<Player> friends;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getElo() {
		return elo;
	}

	public void setElo(int elo) {
		this.elo = elo;
	}

	public Set<Player> getFriends() {
		return friends;
	}

	public void setFriends(Set<Player> friends) {
		this.friends = friends;
	}	
}
