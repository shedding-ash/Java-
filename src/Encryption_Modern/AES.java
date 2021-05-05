package Encryption_Modern;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Objects;

public class AES {

    //byte[] >> HEX
    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte aByte : bytes) {
            String hex = Integer.toHexString(aByte & 0xFF);
            if (hex.length() < 2) {
                sb.append(0);
            }
            sb.append(hex);
        }
        return sb.toString();
    }

    //HEX >> byte
    private static byte hexToByte(String inHex) {
        return (byte) Integer.parseInt(inHex, 16);
    }

    //HEX >> byte[]
    private static byte[] hexToByteArray(String inHex) {
        int hexlen = inHex.length();
        byte[] result;
        if (hexlen % 2 == 1) {
            //����
            hexlen++;
            result = new byte[(hexlen / 2)];
            inHex = "0" + inHex;
        } else {
            //ż��
            result = new byte[(hexlen / 2)];
        }
        int j = 0;
        for (int i = 0; i < hexlen; i += 2) {
            result[j] = hexToByte(inHex.substring(i, i + 2));
            j++;
        }
        return result;
    }

    // ECB����:
    private static byte[] ECBencrypt(byte[] key, byte[] input) throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        SecretKey keySpec = new SecretKeySpec(key, "AES");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        return cipher.doFinal(input);
    }

    // ECB����:
    private static byte[] ECBdecrypt(byte[] key, byte[] input) throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        SecretKey keySpec = new SecretKeySpec(key, "AES");
        cipher.init(Cipher.DECRYPT_MODE, keySpec);
        return cipher.doFinal(input);
    }

    // CBC����:
    private static byte[] CBCencrypt(byte[] key, byte[] input) throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
        // CBCģʽ��Ҫ����һ��16 bytes��initialization vector:
        SecureRandom sr = SecureRandom.getInstanceStrong();
        byte[] iv = sr.generateSeed(16);
        IvParameterSpec ivps = new IvParameterSpec(iv);
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivps);
        byte[] data = cipher.doFinal(input);
        // IV����Ҫ���ܣ���IV������һ�𷵻�:
        return join(iv, data);
    }

    // CBC����:
    private static byte[] CBCdecrypt(byte[] key, byte[] input) throws GeneralSecurityException {
        // ��input�ָ��IV������:
        byte[] iv = new byte[16];
        byte[] data = new byte[input.length - 16];
        System.arraycopy(input, 0, iv, 0, 16);
        System.arraycopy(input, 16, data, 0, data.length);
        // ����:
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
        IvParameterSpec ivps = new IvParameterSpec(iv);
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivps);
        return cipher.doFinal(data);
    }

    private static byte[] join(byte[] bs1, byte[] bs2) {
        byte[] r = new byte[bs1.length + bs2.length];
        System.arraycopy(bs1, 0, r, 0, bs1.length);
        System.arraycopy(bs2, 0, r, bs1.length, bs2.length);
        return r;
    }

    private static byte[] keyge(int KLength, String Skey) throws NoSuchAlgorithmException {
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        kgen.init(KLength, new SecureRandom(Skey.getBytes()));
        return  kgen.generateKey().getEncoded();
    }

    public String AESEncrypt(String Source, String Skey, String Mode, String OutStyle,int KLength) throws GeneralSecurityException {
        if (Objects.equals(Mode, "ECB"))
        {
            byte[] key = keyge(KLength,Skey);
            byte[] data = Source.getBytes(StandardCharsets.UTF_8);
            byte[] encrypted = ECBencrypt(key, data);
            if (Objects.equals(OutStyle, "Base64")) {
                return Base64.getEncoder().encodeToString(encrypted);
            } else {
                return bytesToHex(encrypted).toUpperCase();
            }
        } else if (Objects.equals(Mode, "CBC")) {
            byte[] key = keyge(KLength,Skey);
            byte[] data = Source.getBytes(StandardCharsets.UTF_8);
            byte[] encrypted = CBCencrypt(key, data);
            if(Objects.equals(OutStyle, "Base64")){
                return Base64.getEncoder().encodeToString(encrypted);
            }else{
                return bytesToHex(encrypted).toUpperCase();
            }
        }
        return null;
    }

    public String AESDecrypt(String Source, String Skey, String Mode, String OutStyle,int KLength) throws GeneralSecurityException {
        if(Objects.equals(Mode,"ECB"))
        {
            byte[] key = keyge(KLength,Skey);
            if(Objects.equals(OutStyle,"Base64")) {
                return new String(ECBdecrypt(key, Base64.getDecoder().decode(Source)), StandardCharsets.UTF_8);
            }
            else {
                return new String(ECBdecrypt(key,hexToByteArray(Source)),StandardCharsets.UTF_8);
            }

        }else if (Objects.equals(Mode,"CBC")) {
            byte[] key = keyge(KLength,Skey);
            if(Objects.equals(OutStyle,"Base64")) {
                return new String(CBCdecrypt(key,Base64.getDecoder().decode(Source)), StandardCharsets.UTF_8);
            }
            else {
                return new String(CBCdecrypt(key,hexToByteArray(Source)), StandardCharsets.UTF_8);
            }
        }
        return null;
    }

    private static String zeropading(String in, int i)
    {
        if(in.length()<i)
        {
            in = in + 0;// TODO: 2020/1/14
        }else
        {
            in = in.subSequence(0,i).toString();
        }
        return in;
    }

    public static void main(String[] args) {
        System.out.println(zeropading("123",6));
    }
}

