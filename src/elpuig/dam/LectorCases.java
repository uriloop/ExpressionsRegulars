package elpuig.dam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LectorCases {

    List<Casa> cases= new ArrayList<>();

    public LectorCases() {

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/santako.txt"));
            String foto;
            try {
            while((foto=br.readLine())!=null)
                    cases.add(new Casa(foto));
            }catch ( Exception e){
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public List<Casa> getCases() {
        return cases;
    }
}
