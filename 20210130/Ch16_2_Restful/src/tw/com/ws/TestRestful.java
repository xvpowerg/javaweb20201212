package tw.com.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test")
@Produces(MediaType.APPLICATION_JSON)
public class TestRestful {
	//GET �d���
	//POST �Ψӷs�W���
	//PATCH �i�Ψӭק���
	//DELETE �ΨӧR�����
	@GET
	public String testHello() {
		return "{\"value\":\"Hello!!\"}";
				
	}
}
