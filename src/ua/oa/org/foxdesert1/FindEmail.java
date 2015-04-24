package ua.oa.org.foxdesert1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by vasylchenko on 24.04.2015.
 */
public class FindEmail {
    public static void main(String[] args) {
        String str = "Black list\n" +
                "Bpdtcnyst yfv rjynfrns yt xtcnys[ pfrfpxbrjd hf,jnf.ob[ d catht rjyntynþ <elmnt ,lbntkmys:\n" +
                "\n" +
                "(bobnt yf cnhfybwt xthtp ctrl+f)\n" +
                "\n" +
                "nfhfhf nano@in.co.nz\n"+
                "seo2x2x@yandex.ru - êðàæà êîíòåíòà\n" +
                "Dbrnjh Ujhkjd - seopro82@bk.ru\n" +
                "A`ljh Cbljhjd - coopersworks@ukr.net\n" +
                "Cnfybckfd Jktqybr - oleinsny@mail.ru\n" +
                "Fynjy Dtytlbrnjd - antonycity@mail.ru\n" +
                "Hjvfy Bkby - anchorncs@mail.ru\n" +
                "Cthutq Ghj[jhjd - projober@mail.ru\n" +
                "Ghj[jhjdf Dfktynbyf - prohorova_valentina@ro.ru\n" +
                "xxx - ushenkos@list.ru\n" +
                "xxx - svetlanka_ivanova_79@inbox.ru\n" +
                "xxx - labirint.vacancy@gmail.com\n" +
                "Vfhbz Rhfcbdcrfz - maryladymary89@gmail.com\n" +
                "Bingo bongo - fcv@csltd.com.ua";
        Pattern pat1 = Pattern.compile("\\w+@\\w+.\\w+ |\\w+@\\w+.\\w+\\.\\w+");
        Matcher mat1 = pat1.matcher(str);
        while (mat1.find()){
            System.out.println(mat1.group());
        }

    }
}
