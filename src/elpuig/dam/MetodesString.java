package elpuig.dam;

import java.util.List;

public class MetodesString {


    public static void main(String[] args) {
        LectorCases lc = new LectorCases();
        List<Casa> cases = lc.getCases();

        String[] patrons = {
                "*<]:-DOo",    // 0= PareNoel
                ">:o)",       // 1= Ren
                "<]:-D"         // 2= follet
        };

        for (Casa casa :
                cases) {
            for (int i = 0; i < patrons.length; i++) {
                for (int j = 0; j <= (casa.getFoto().length() /* - patrons[i].length() */); j++) {
                    if ((casa.getFoto()).startsWith(patrons[i], j)) {
                        switch (i) {
                            case 0 -> casa.setParenoel();
                            case 1 -> casa.setRen();
                            case 2 -> casa.setFollet();
                        }
                    }
                }
            }
        }
        for (Casa casa: cases
             ) {
            casa.treuElFollet();
            System.out.println(casa);
        }
    }

}
