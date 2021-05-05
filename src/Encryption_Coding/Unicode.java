package Encryption_Coding;

public class Unicode {
    //�ַ���ת��unicode
    public String stringToUnicode(String string) {
        StringBuilder unico = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);// ȡ��ÿһ���ַ�
            unico.append("\\u");
            for (int j = 0; j < 4-Integer.toHexString(c).length(); j++) {
                unico.append("0");
            }
            unico.append(Integer.toHexString(c));// ת��Ϊunicode
        }
        return unico.toString();
    }

    //unicode ת�ַ���
    public String unicodeToString(String unicode) {
        StringBuilder str = new StringBuilder();
        String[] hex = unicode.split("\\\\u");
        for (int i = 1; i < hex.length; i++) {
            int data = Integer.parseInt(hex[i], 16);// ת����ÿһ�������
            str.append((char) data);// ׷�ӳ�string
        }
        return str.toString();
    }
}