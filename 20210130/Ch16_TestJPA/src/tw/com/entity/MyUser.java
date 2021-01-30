package tw.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name="findMyUser",
			query="SELECT myUserObj FROM MyUser myUserObj WHERE myUserObj.account =:account")	
})
public class MyUser {
@Id//•D¡‰ primary key
@GeneratedValue
private int id;
private String account;
private String password;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAccount() {
	return account;
}
public void setAccount(String account) {
	this.account = account;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "MyUser [id=" + id + ", account=" + account + ", password=" + password + "]";
}

}
