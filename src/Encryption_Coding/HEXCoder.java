package Encryption_Coding;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class HEXCoder{
    public String Encode(String i,String d) throws UnsupportedEncodingException {
        d = CheckSelectItem(d);
        //����ת�����
        String hexString;
        //java����ת���ַ�
        String[] escapeArray = {"\b","\t","\n","\f","\r"};
        //У������Ƿ��������ת���ַ�
        //boolean flag = false;
        //����
        for(String escapeStr : escapeArray)
        {
            i = i.replace(escapeStr,"");
        }
        //16�����ַ�
        char[] hexArray = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F',};
        StringBuilder sb = new StringBuilder();
        //String ---> byte[]
        byte[] bs = i.getBytes("UTF-8");
        int bit;
        if(d.equals("0x"))
        {
            sb.append(d);
        }
        for (byte b : bs) {
            if (d.equals("\\x")) {
                sb.append(d);
                bit = (b & 0x0f0) >> 4;
                sb.append(hexArray[bit]);
                bit = b & 0x0f;
                sb.append(hexArray[bit]);
            } else if (Objects.equals(d, "0x")) {
                bit = (b & 0x0f0) >> 4;
                sb.append(hexArray[bit]);
                bit = b & 0x0f;
                sb.append(hexArray[bit]);
            } else {
                bit = (b & 0x0f0) >> 4;
                sb.append(hexArray[bit]);
                bit = b & 0x0f;
                sb.append(hexArray[bit]);
                sb.append(d);
            }
        }
        if(d.equals(",")||d.equals(";")||d.equals(":")||d.equals("\n")||d.equals(" "))
        {
            sb.deleteCharAt(sb.length() - 1);
        }
        hexString = sb.toString();
        return hexString;
    }

    public String Decode(String i,String d)
    {
        d = CheckSelectItem(d);
        //���ս��
        String result;
        //ת����д
        i = i.toUpperCase();
        //16�����ַ�
        String hexDigital = "0123456789ABCDEF";
        String ika;

        if(Objects.equals(d, "0x"))
        {
            ika = i.replace("0X", "");
        }
        else if(Objects.equals(d, "\\x"))
        {
            ika = i.replace("\\X","");
        }
        else
        {
            StringBuilder ssvb = new StringBuilder();
            String[] ss = i.split(d);
            for (String ik : ss) {
                ssvb.append(ik);
            }
            ika = ssvb.toString();
        }

        char[] hexs = ika.toCharArray();
        //�ܱ�16����һ�����Ա�2����
        byte[] bytes = new byte[ika.length()/2];
        int n;

        for (int j = 0; j < bytes.length; j++) {
            n = hexDigital.indexOf(hexs[2 * j]) * 16 + hexDigital.indexOf(hexs[2 * j + 1]);
            bytes[j] = (byte)(n & 0xff);
        }

        result = new String(bytes, StandardCharsets.UTF_8);

        return result;
    }

    private String CheckSelectItem(String i)
    {
        String delc;
        switch (i)
        {
            case "0x": delc = "0x";break;
            case "\\x": delc = "\\x";break;
            case "NULL": delc = "";break;
            case "    Space": delc = " ";break;
            case ",   Comma": delc = ",";break;
            case ";   Semicolon": delc = ";";break;
            case ":   Colon": delc = ":";break;
            case "\\n Newline": delc = "\n";break;
            default: delc = i;
        }
        return delc;
    }
}

