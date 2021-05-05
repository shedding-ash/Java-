package Encryption_Coding;

import java.math.BigInteger;

public class Conversion_2 {
    public String Base_Conversion(String SourceNumber,int SourceConv,int DesConv,String split)
    {
        String[] SourceNumb;
        StringBuilder sb = new StringBuilder();

        if(split.length()<=0){
            SourceNumb = SourceNumber.split(" ");
            split = " ";
        }else{
            SourceNumb = SourceNumber.split(split);
        }


        for (String a:SourceNumb) {
            sb.append(new BigInteger(a,SourceConv).toString(DesConv));
            sb.append(split);
        }
        return sb.toString();
    }

}


  