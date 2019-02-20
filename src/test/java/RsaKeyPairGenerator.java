import java.security.*;
import static org.apache.commons.codec.binary.Base64.encodeBase64String;

public class RsaKeyPairGenerator {

	public static void main(String[] args) throws Exception {
		new RsaKeyPairGenerator().generate();
	}

	public void generate() throws NoSuchAlgorithmException {
		// Create a new generator
		KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
		// Set the key size
		generator.initialize(2024);
		// Generate a pair
		KeyPair keyPair = generator.generateKeyPair();
		// Output the public key as base64
		String publicK = encodeBase64String(keyPair.getPublic().getEncoded());
		// Output the private key as base64
		String privateK = encodeBase64String(keyPair.getPrivate().getEncoded());

		System.out.println(publicK);
		System.out.println(privateK);
	}
}
