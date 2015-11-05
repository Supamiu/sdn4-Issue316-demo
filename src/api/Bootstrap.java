package api;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;


@SpringBootApplication
@Import(config.ApiConfiguration.class)
@EnableNeo4jRepositories
public class Bootstrap extends Neo4jConfiguration{
	
	public Bootstrap(){
		setBasePackage("api");
	}
	
	@Bean(destroyMethod = "shutdown")
	public GraphDatabaseService graphDatabaseService() {
		return new GraphDatabaseFactory().newEmbeddedDatabase("/var/neo4j/data/graph.db");
	}
	
	public static void main(String[] args){
        SpringApplication.run(Bootstrap.class, args);
	}
}
