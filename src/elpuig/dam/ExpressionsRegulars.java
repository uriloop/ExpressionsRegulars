package elpuig.dam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionsRegulars {

    public static void main(String[] args) {

        // llegir file.

        LectorCases lc=new LectorCases();
        List<Casa> cases = lc.getCases();


        // buscar patterns
        for (Casa casa: cases
             ) {
            Pattern p= Pattern.compile("\\*<]:-DOo");
            Matcher m= p.matcher(casa.getFoto());
            while (m.find()) casa.setParenoel();
            p=Pattern.compile(">:o\\)");
            m=p.matcher(casa.getFoto());
            while(m.find()) casa.setRen();
            p=Pattern.compile("<]:-D");
            m=p.matcher(casa.getFoto());
            while (m.find()) casa.setFollet();
        }

        // El cas del follet i el pare noel
        // Mostrar el resultat
        for (Casa casa :
                cases) {
            casa.treuElFollet();
            System.out.println(casa);
        }





    }


}
