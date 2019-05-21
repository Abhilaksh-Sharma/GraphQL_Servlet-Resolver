package practice.graphql.java.servlet.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import practice.graphql.java.servlet.model.GraphQLServletModel;

//By-default all methods in interface are public & abstract.
@Repository
public interface GraphQLServletRepository extends MongoRepository<GraphQLServletModel, Integer>{

	List<GraphQLServletModel> findByName(String name);

	List<GraphQLServletModel> findByCost(Integer cost);

	List<GraphQLServletModel> findByFlag(Boolean flag);

}
