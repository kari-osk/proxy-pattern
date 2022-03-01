package service;

import java.util.Locale;

public class GradeDeFilmes implements IGradeDeFilmes {

    public String getFilme(String nomeFilme, String pais, String ip) {
        String link;
        link = "www." + nomeFilme.replace(" ","").toLowerCase();
        return link;
    }

}
