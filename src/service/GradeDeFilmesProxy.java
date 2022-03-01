package service;

import exception.FilmeNaoHabilitadoException;

public class GradeDeFilmesProxy {
    private int ipNumero;

    public String getFilme(String nomeFilme, String pais, String ip) throws FilmeNaoHabilitadoException {
        checkIp(ip, pais);
        GradeDeFilmes filme = new GradeDeFilmes();
        return filme.getFilme(nomeFilme, pais, ip);
    }


    public void checkIp(String ip, String pais) throws FilmeNaoHabilitadoException  {
        int ipNumero = Integer.parseInt(ip.substring(0,3));

        //System.out.println(ipNumero);

        if (ipNumero <= 49 && pais.equalsIgnoreCase("Argentina")) {
            System.out.println("País: Argentina");
        } else if ((ipNumero >= 50 && ipNumero <= 99) && pais.equalsIgnoreCase("Brasil")) {
            System.out.println("País: Brasil");
        } else if ((ipNumero >= 100 && ipNumero <= 149) && pais.equalsIgnoreCase("Colombia")) {
            System.out.println("País: Colômbia");
        } else {
            System.out.println("Ip inválido");
            throw new FilmeNaoHabilitadoException("Filme não disponível no seu país");
        }
    }


}
