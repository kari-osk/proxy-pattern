import exception.FilmeNaoHabilitadoException;
import service.GradeDeFilmes;
import service.GradeDeFilmesProxy;
import service.IGradeDeFilmes;

public class Main {
    public static void main(String[] args) {

        try{
            GradeDeFilmesProxy filme1 = new GradeDeFilmesProxy();
            System.out.println(filme1.getFilme("Minority Report","Argentina", "000.255.255.255"));

            GradeDeFilmesProxy filme2 = new GradeDeFilmesProxy();
            System.out.println(filme2.getFilme("Blade Runner 2049", "Brasil", "051.255.255.255"));

            GradeDeFilmesProxy filme3 = new GradeDeFilmesProxy();
            System.out.println(filme3.getFilme("Guardiões da Galáxia", "Colombia", "110.255.255.255"));

            GradeDeFilmesProxy filme4 = new GradeDeFilmesProxy();
            System.out.println(filme4.getFilme("Robots", "Brasil","042.255.255.255"));

        }catch (FilmeNaoHabilitadoException e) {
            System.out.println("Erro " + e);
        }
    }
}
