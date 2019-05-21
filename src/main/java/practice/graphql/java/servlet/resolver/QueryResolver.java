package practice.graphql.java.servlet.resolver;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import practice.graphql.java.servlet.model.GraphQLServletModel;
import practice.graphql.java.servlet.repo.GraphQLServletRepository;

@Component
public class QueryResolver implements GraphQLQueryResolver {

	@Autowired
	GraphQLServletRepository graphQLServletRepository;
	
	public QueryResolver(GraphQLServletRepository graphQLServletRepository) {
		this.graphQLServletRepository = graphQLServletRepository;
	}


	public List<GraphQLServletModel> models() {
		System.out.println("Inside Query : " + graphQLServletRepository);
		return graphQLServletRepository.findAll();
	}

	public Optional<GraphQLServletModel> modelById(Integer id) {
		return graphQLServletRepository.findById(id);
	}

	public List<GraphQLServletModel> modelByName(String name) {
		return graphQLServletRepository.findByName(name);
	}

	public List<GraphQLServletModel> modelByCost(Integer cost) {
		return graphQLServletRepository.findByCost(cost);
	}

	public List<GraphQLServletModel> modelByFlag(Boolean flag) {
		return graphQLServletRepository.findByFlag(flag);
	}

}
