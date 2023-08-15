package interview3;

import org.apache.commons.codec.binary.Base32;

public class Encoding {
	public static String base32Encode(byte[] data) {
		 Base32 encoder = new Base32();
		 return new String(encoder.encode(data)).replace("\r\n", "");
	}
}
