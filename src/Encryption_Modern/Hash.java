package Encryption_Modern;

//import Encryption_Modern.Hash_add;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {
    public String HashEncode(String message,String check)
    {
        MessageDigest mc = null;//实例化MessageDigest方法用来作MD5转换
        String checking;
        checking = check;
        if(checking.equals("MD4")||checking.equals("")) {
        	Hash_add Hash_add = new Hash_add();
            return  Hash_add.getMD4ofStr(message);
        }//MD4
        else if(checking.equals("MD5"))
        {
            try {
                mc = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            assert mc != null;
            mc.update(message.getBytes());//hash摘要
            byte[] out = mc.digest();
            return java.util.Base64.getEncoder().encodeToString(out);
        }
        else {
            try {
                mc = MessageDigest.getInstance(checking);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            assert mc != null;
            mc.update(message.getBytes());//hash摘要
            byte[] out = mc.digest();
            return java.util.Base64.getEncoder().encodeToString(out);
        }
    }
}

