package Encryption_Coding;

public class ASCII {
	public String EnCode(String Source,String Split,int PMNumber)
    {
        Split = CheckSelectItem(Split);//�ָ�����ȡ
        StringBuilder ASCIIL = new StringBuilder();//�������
        StringBuilder ssvb = new StringBuilder();//����ֵ
        String[] ss = Source.split("");
        for (String ik : ss) {
            ssvb.append(ik);
        }
        char[] chars = ssvb.toString().toCharArray();//����ֵ����Ϊchar����
        for (int i = 0; i < chars.length; i++) {
            if(i != chars.length - 1)
            {
                ASCIIL.append(Integer.valueOf(chars[i])+PMNumber).append(Split);
            }
            else {
                ASCIIL.append(Integer.valueOf(chars[i])+PMNumber);
            }
        }//ASCIIת��
        return ASCIIL.toString();
    }

    public String DeCode(String a,String s)
    {
        s = CheckSelectItem(s);//�ָ�����ȡ
        String out;//���
        if(s.equals(""))
        {
            out = "������ѡ��ո�ָ���зָ�";
        }
        else
        {
            StringBuilder sbu = new StringBuilder();
            String[] chars = a.split(s);//����ֵ��Ƭ
            for (String aChar : chars) {
                sbu.append((char) Integer.parseInt(aChar));
            }//ASCIIת��
            out = sbu.toString();
        }
        return out;
    }

    private String CheckSelectItem(String i)
    {
        String delc;
        if ("NULL".equals(i)) {
            delc = "";
        } else if ("    Space".equals(i)) {
            delc = " ";
        } else if ("\\n Newline".equals(i)) {
            delc = "\n";
        } else {
            delc = i;
        }
        return delc;
    }//���طָ���
}
