package tw.com.beans;

public class MyUser {
		private int id;
		private String account;
		private String password;
		
		
		public MyUser(int id, String account, String password) {
			super();
			this.id = id;
			this.account = account;
			this.password = password;
		}
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
