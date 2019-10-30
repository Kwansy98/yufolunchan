package utils;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class AESTools {
    private static final Base64.Decoder decoder = Base64.getDecoder();
    private static final Base64.Encoder encoder = Base64.getEncoder();
	public static byte[] AESEncode(String password, byte[] content) {
		try {
			KeyGenerator keygen = KeyGenerator.getInstance("AES");
			SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
			random.setSeed(password.getBytes());
			keygen.init(128, random);
			SecretKey originalKey = keygen.generateKey();
			SecretKey key = new SecretKeySpec(originalKey.getEncoded(), "AES");
			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.ENCRYPT_MODE, key);
			return Base64Tools.encode(cipher.doFinal(content)); // 加密后用base64编码
		} catch (NoSuchAlgorithmException e) {
			// e.printStackTrace();
		} catch (InvalidKeyException e) {
			// e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			// e.printStackTrace();
		} catch (BadPaddingException e) {
			// e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			// e.printStackTrace();
		}
		return null;
	}

	public static byte[] AESDecode(String password, byte[] content) {
		try {
			KeyGenerator keygen = KeyGenerator.getInstance("AES");
			SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
			random.setSeed(password.getBytes());
			keygen.init(128, random);
			SecretKey originalKey = keygen.generateKey();
			SecretKey key = new SecretKeySpec(originalKey.getEncoded(), "AES");
			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.DECRYPT_MODE, key);
			return cipher.doFinal(Base64Tools.decode(content));
		} catch (NoSuchAlgorithmException e) {
			// e.printStackTrace();
		} catch (InvalidKeyException e) {
			// e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			// e.printStackTrace();
		} catch (BadPaddingException e) {
			// e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			// e.printStackTrace();
		}
		return null;
	}

}
