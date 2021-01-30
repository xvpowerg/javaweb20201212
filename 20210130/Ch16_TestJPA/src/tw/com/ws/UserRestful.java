package tw.com.ws;

import javax.ejb.EJB;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import tw.com.ejb.MyUserBeanLocal;
import tw.com.entity.MyUser;

@Path("user")
@Produces(MediaType.APPLICATION_JSON)
public class UserRestful {
	private String passJson = "{\"state\":\"Pass\"}";
	private String failJson = "{\"state\":\"Fail\"}";
	@EJB
	private MyUserBeanLocal userBean;
	@POST
	public String  createUser(@FormParam("account") String account,
			@FormParam("password") String password) {
		MyUser myUser = new MyUser();
		myUser.setAccount(account);
		myUser.setPassword(password);
	boolean pass = userBean.createUser(myUser);
		return pass? passJson:failJson;
	}
	@POST
	@Path("login")
	public String login(@FormParam("account") String account,
			@FormParam("password") String password) {
		MyUser myUser = userBean.findMyUser(account, password);
		ObjectMapper objMap = new ObjectMapper(); 
		String json = "";
		try {
			//
			json = objMap.writeValueAsString(myUser);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return myUser==null?failJson:json;
	}
	
}
