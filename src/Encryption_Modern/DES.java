package Encryption_Modern;

import javax.crypto.Cipher;

public class DES {
    private static String strDefaultKey = "jIAn";    //Ԥ����Կ
    private StringBuffer objSb          = null;
    private Cipher objCipher;
    private java.security.Key objKey    = null;
    private int intStringLength         = 0;
    private int intTemp                 = 0;

    //���캯��
    public DES() throws Exception
    {
        this(strDefaultKey);
    }

    //��Կ
    public DES(String arg_strKey) throws Exception
    {
        setKey(arg_strKey.getBytes());
        objCipher = Cipher.getInstance("DES");
    }

    //��ָ�����ִ��u����耣�����������Ԫ����L�Ȟ�8λ�����㼰���^��Ҫ̎��
    private void setKey(byte[] arg_strPrivateKey) {
        byte[] arrTempByteArray = new byte[8];
        // ��ԭʼ��Ԫ����D�Q��8λ
        for (int i = 0; i < arg_strPrivateKey.length && i < arrTempByteArray.length; i++)
        {
            arrTempByteArray[i] = arg_strPrivateKey[i];
        }
        // �O�����
        objKey = new javax.crypto.spec.SecretKeySpec(arrTempByteArray, "DES");
    }

    //��byte����D�Q16�M��ֵ���ִ����磺byte[]{1,18}�D�Q�飺0112
    private String byte2Hex(byte[] arg_bteArray) {
        intStringLength = arg_bteArray.length;
        objSb = new StringBuffer(intStringLength * 2);
        for (int i = 0; i < intStringLength; i++)
        {
            intTemp = arg_bteArray[i];
            //ؓ����Ҫ�D������
            if(intTemp < 0)
            {
                intTemp = intTemp + 256;
            }
            // С�0F��Ҫ�a0
            if (intTemp < 16)
            {
                objSb.append("0");
            }
            objSb.append(Integer.toString(intTemp, 16));
        }
        return objSb.toString();
    }


    //��16�M��ֵ���ִ��D��byte���
    private byte[] hex2Byte(String arg_strHexString) {
        byte[] arrByteDAta = arg_strHexString.getBytes();
        intStringLength = arrByteDAta.length;
        byte[] aryRetuenData = new byte[intStringLength / 2];
        for (int i = 0; i < intStringLength; i = i + 2)
        {
            aryRetuenData[i / 2] =  (byte)Integer.parseInt(new String(arrByteDAta, i, 2), 16);
        }
        return aryRetuenData;
    }

    //�����ִ�
    private byte[] doEncrypt(byte[] arg_bteArray) throws Exception
    {
        objCipher.init(Cipher.ENCRYPT_MODE, objKey);
        return objCipher.doFinal(arg_bteArray);
    }

    public String encrypt(String arg_strToEncriptString) throws Exception
    {
        return byte2Hex(doEncrypt(arg_strToEncriptString.getBytes()));
    }

    private byte[] doDecrypt(byte[] arg_bteArray) throws Exception
    {
        objCipher.init(Cipher.DECRYPT_MODE, objKey);
        return objCipher.doFinal(arg_bteArray);
    }
    //�����ִ�
    public String decrypt(String arg_strToDecriptString) throws Exception
    {
        return new String(doDecrypt(hex2Byte(arg_strToDecriptString)));
    }
    
    public static void main(String[] args)
    {
        try
        {
            String test = "jIAn";
            DES des = new DES("KGS!@#$%");
            System.out.println("����ǰ���ַ���"+test);
            System.out.println("���ܺ���ַ���"+des.encrypt(test));
            System.out.println("���ܺ���ַ���"+des.decrypt(des.encrypt(test)));
        }
        catch (Exception e)
        {

            e.printStackTrace();
        }

    }
}
