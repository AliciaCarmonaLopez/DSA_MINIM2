package edu.upc.dsa.services;
import edu.upc.dsa.RankingResource;
import edu.upc.dsa.models.Message;
import edu.upc.dsa.models.Ranking;
import io.swagger.annotations.Api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Comparator;
import java.util.List;

@Api(value = "/stats", description = "Endpoint to User Service")
@Path("/stats")
public class RankingService {
    private RankingResource rankingService = new RankingResource();

    @GET
    @Path("/rankings")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMessages() {
        List<Ranking> rankings = rankingService.getRankings();

        Comparator<Ranking> hourscomparator = Comparator.comparingInt(Ranking::getPoints);
        rankings.sort(hourscomparator.reversed());
        GenericEntity<List<Ranking>> entity = new GenericEntity<List<Ranking>>(rankings) {};
        return Response.status(200).entity(entity).build();
    }
}
