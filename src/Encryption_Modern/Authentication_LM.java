package Encryption_Modern;

import Encryption_Coding.Conversion;
import Encryption_Coding.HEXCoder;

import java.io.UnsupportedEncodingException;

public class Authentication_LM {

    public static HEXCoder hex = new HEXCoder();
    public static Conversion con = new Conversion();
    public static String LMEncrypt(String S)
    {
        if(S.length()>14)
        {
            return "超出最大长度！";
        }
        else
        {
            S = LM14check(S.toUpperCase());
            return LM56check(con.HEXECBin(S.subSequence(0,14).toString(),"16"));
        }
    }

    public static String LM14check(String S)
    {
        StringBuilder sb = null;
        try {
            sb = new StringBuilder(hex.Encode(S,""));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            for (int i = hex.Encode(S,"").length(); i < 28; i++)
            {
                sb.append("0");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //System.out.println(sb.toString());
        return sb.toString();
    }

    public static String LM56check(String S)
    {
        if(S.length()==56)
        {
            return S;
        }
        else if(S.length()<56)
        {
            StringBuffer set = new StringBuffer(S);
            for (int i = 56 - (56 - S.length()); i < 56; i++) {
                set.insert(0,"0");
            }
            return set.toString();
        }
        return null;
    }

    public static String LM2T16(String S)
    {
        String[] set = new String[8];
        StringBuilder out = new StringBuilder();
        int k = 0;
        for (int i = 7; i < 56+7; i = i+7) {
            set[k] = S.substring(i-7,i)+"0";
            k++;
        }

        for (int i = 0; i <= 7; i++) {
            set[i] = con.BinECHEX(set[i].substring(0,4),"HEX")+con.BinECHEX(set[i].substring(4,8),"HEX");
        }

        for (String a:set)
        {
            out.append(a);
        }
        return out.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(LMEncrypt("161560"));
        System.out.println(LM2T16(LMEncrypt("161560")));
    }
}

