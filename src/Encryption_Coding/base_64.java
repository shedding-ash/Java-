package Encryption_Coding;

import java.nio.charset.StandardCharsets;

public class base_64 {
    public String Base64Decode(String in)
    {
        byte[] bs64 = java.util.Base64.getDecoder().decode(in);//��ȡ�û������ַ�ͨ��base64���ܣ����byte������ֵ
        return new String(bs64, StandardCharsets.UTF_8);//��byte����ת����String���
    }

    public String Base64Encode(String in)
    {
        byte[] bytes = in.getBytes(StandardCharsets.UTF_8);//���û������ַ�ת����byte��utf-8���룩
        return java.util.Base64.getEncoder().encodeToString(bytes);//���ֵ
    }
}
