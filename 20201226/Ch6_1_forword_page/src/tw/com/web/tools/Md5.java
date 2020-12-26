package tw.com.web.tools;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
//使用MD5加密
public class Md5 {
   public static String getMD5(String str) {
	   String reuslt ="";
	   
	   try {
		MessageDigest md =  MessageDigest.getInstance("MD5");
		md.update(str.getBytes());
			//1　表示只取正數
			// 把md.digest() 轉為二進位 
		    // 再轉為16進位
		reuslt =  new BigInteger(1,md.digest()).toString(16);
	} catch (NoSuchAlgorithmException e) {
		System.out.println("NoSuchAlgorithmException:"+e);
	}
	   
	   return reuslt;
	   
   }
}
