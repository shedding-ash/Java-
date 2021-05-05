package Encryption_Coding;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URL {
    public String URLDecode(String in) throws UnsupportedEncodingException {
        return URLDecoder.decode(in,"UTF-8");
    }

    public String URLEncode(String in) throws UnsupportedEncodingException {
        return URLEncoder.encode(in,"UTF-8").replaceAll("\\+","%20");
    }
}
