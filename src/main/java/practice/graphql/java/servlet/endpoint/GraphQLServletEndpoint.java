package practice.graphql.java.servlet.endpoint;

import javax.servlet.annotation.WebServlet;

import com.coxautodev.graphql.tools.SchemaParser;

import graphql.servlet.SimpleGraphQLServlet;
import practice.graphql.java.servlet.repo.GraphQLServletRepository;
import practice.graphql.java.servlet.resolver.MutationResolver;
import practice.graphql.java.servlet.resolver.QueryResolver;

@WebServlet(urlPatterns = "/graphql")
public class GraphQLServletEndpoint extends SimpleGraphQLServlet {

	/**
	 * Default Serial VersionID used during Deserialization of the object
	 */
	private static final long serialVersionUID = 1L;

	public GraphQLServletEndpoint(GraphQLServletRepository graphQLServletRepository) {
		super(SchemaParser.newParser().file("mySchema.graphqls")
				.resolvers(new QueryResolver(graphQLServletRepository), new MutationResolver(graphQLServletRepository))
				.build().makeExecutableSchema());
		System.out.println("Initializng Respository : " + graphQLServletRepository);
	}

	
}
