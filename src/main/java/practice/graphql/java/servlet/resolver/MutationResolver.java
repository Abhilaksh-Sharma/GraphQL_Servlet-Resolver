package practice.graphql.java.servlet.resolver;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import practice.graphql.java.servlet.model.GraphQLServletModel;
import practice.graphql.java.servlet.repo.GraphQLServletRepository;

@Component
public class MutationResolver implements GraphQLMutationResolver {

	@Autowired
	GraphQLServletRepository graphQLServletRepository;
	
	public MutationResolver(GraphQLServletRepository graphQLServletRepository) {
		this.graphQLServletRepository = graphQLServletRepository;
	}

	public GraphQLServletModel createModel(Integer id, String name, Integer cost, Boolean flag) {
		return graphQLServletRepository.save(new GraphQLServletModel(id, name, cost, flag));
	}

	public Optional<GraphQLServletModel> deleteModel(Integer id) {
		Optional<GraphQLServletModel> graphQLModel = graphQLServletRepository.findById(id);
		graphQLServletRepository.deleteById(id);
		return graphQLModel;
	}

	public GraphQLServletModel updateModel(Integer id, String name, Integer cost, Boolean flag) {
		return graphQLServletRepository.save(new GraphQLServletModel(id, name, cost, flag));
	}

}
