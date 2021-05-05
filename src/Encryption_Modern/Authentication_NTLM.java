package Encryption_Modern;

import Encryption_Coding.HEXCoder;
import java.io.UnsupportedEncodingException;

public class Authentication_NTLM {
    public String NTLMEncrypt(String in)
    {
        HEXCoder HexCoder = new HEXCoder();
        Hash_add Hash_add = new Hash_add();
        try {
            return Hash_add.getMD4ofStr(HexCoder.Decode(HexCoder.Encode(in," ").replace(" ","00")+"00",""));
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }
}
