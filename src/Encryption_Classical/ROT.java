package Encryption_Classical;

public class ROT {
	public String ROTEncode(String in,String rotnum)
    {
        rotnum = rotnum.replace("ROT","");
        StringBuilder s = new StringBuilder();//�����Stringֵ
        for (int i = 0; i < in.length(); i++) {
            char c = in.charAt(i);//��ȡString�ַ���ĳһ��λ�õ��ַ�����ֵ��c
            if ((c >= 'A') && (c <= 'Z')) {
                c += Integer.parseInt(rotnum)+1;
                if (c > 'Z')
                    c -= 26;
            } else if ((c >= 'a') && (c <= 'z')) {
                c += Integer.parseInt(rotnum)+1;
                if (c > 'z')
                    c -= 26;
            } else if ((c >= '0') && (c <= '9')) {
                c += Integer.parseInt(rotnum)-8;
                if (c > '9')
                    c -= 10;
            }
            s.append(c);
        }//ROT�㷨�����ƿ�������
        return s.toString();
    }
}
