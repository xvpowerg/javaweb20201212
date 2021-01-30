package tw.com.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test")
@Produces(MediaType.APPLICATION_JSON)
public class TestRestful {
	//GET 查資料
	//POST 用來新增資料
	//PATCH 可用來修改資料
	//DELETE 用來刪除資料
	@GET
	public String testHello() {
		return "{\"value\":\"Hello!!\"}";
				
	}
}
