package zb.com.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptUtil {
	
	// 签名
	public static String sign(String str, String type) {
		String s = Encrypt(str, type);
		return s;
	}

	public static String Encrypt(String strSrc, String encName) {
		MessageDigest md = null;
		String strDes = null;
		byte[] bt = strSrc.getBytes();
		try {
			md = MessageDigest.getInstance(encName);
			md.update(bt);
			strDes = bytes2Hex(md.digest()); // to HexString
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			System.out.println("签名失败！");
			return null;
		}
		return strDes;
	}

	public static String bytes2Hex(byte[] bts) {
		String des = "";
		String tmp = null;
		for (int i = 0; i < bts.length; i++) {
			tmp = (Integer.toHexString(bts[i] & 0xFF));
			if (tmp.length() == 1) {
				des += "0";
			}
			des += tmp;
		}
		return des;
	}

    /*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String signString="Thank you!";
	    String type = EncryptType.SHA_1;
	    String result=sign(signString,type);
	    System.out.println("采用"+type+"加密之后的串为："+result);
	    type="MD5";
	    result=sign(signString,type);
	    System.out.println("采用"+type+"加密之后的串为："+result);
	    type="SHA-256";
	    result=sign(signString,type);
	    System.out.println("采用"+type+"加密之后的串为："+result);
	    type="SHA-384";
	    result=sign(signString,type);
	    System.out.println("采用"+type+"加密之后的串为："+result);
	}
	*/
}
