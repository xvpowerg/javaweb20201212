package tw.com.web.tools;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
//�ϥ�MD5�[�K
public class Md5 {
   public static String getMD5(String str) {
	   String reuslt ="";
	   
	   try {
		MessageDigest md =  MessageDigest.getInstance("MD5");
		md.update(str.getBytes());
			//1�@��ܥu������
			// ��md.digest() �ର�G�i�� 
		    // �A�ର16�i��
		reuslt =  new BigInteger(1,md.digest()).toString(16);
	} catch (NoSuchAlgorithmException e) {
		System.out.println("NoSuchAlgorithmException:"+e);
	}
	   
	   return reuslt;
	   
   }
}
