package br.udesc.desbravador.repository;

import java.util.ArrayList;
import java.util.List;

import br.udesc.desbravador.R;
import br.udesc.desbravador.model.Estrelas;
import br.udesc.desbravador.model.Favorito;
import br.udesc.desbravador.model.Medalha;
import br.udesc.desbravador.model.PontoTuristico;
import br.udesc.desbravador.model.Usuario;

public class Banco {

    public static List<Usuario> usuario;
    public static List<PontoTuristico> pontoTuristico;
    public static List<Favorito> favorito;
    public static List<Medalha> medalha;
    public static List<Estrelas> estrela;


    public static boolean autenticado = false;
    public static Usuario usuarioAutenticado = null;

    /*public static List<PontoTuristico> getList(int i) {

        List<PontoTuristico> pontoTuristico = new ArrayList<>();
        pontoTuristico.add(new PontoTuristico(1, 4, "Cachoeira do Tatete", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, cons ectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.", "-27.020943", "-49.820392", "Localidade da Onça", R.drawable.tatete78, R.drawable.tatete280, 0, 0, null, null, null, null, null, null));
        pontoTuristico.add(new PontoTuristico(2, 3, "Boteco do Gel", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi Lorem ipsum dolor sit amet, cons ectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.", "-27.037314", "-49.6285276", "Rua. 1º de Maio, 222-340 - Pinheiro, Pres. Getúlio - SC, 89150-000", R.drawable.buteco78, R.drawable.buteco280, 0, 1, "(47) 99785-0958", "(47) 99785-0958", "https://www.facebook.com/botecodogel", "https://www.instagram.com/botecodogel/", null, null));

        List<PontoTuristico> pontoTuristicoRecycle = new ArrayList<>();

        for(PontoTuristico ponto : pontoTuristico){
            if (i != 0) {
                if(ponto.getIdTipoPontoTuristico() == i) {
                    pontoTuristicoRecycle.add(ponto);
                }
            }
            else {
                pontoTuristicoRecycle.add(ponto);
            }
        }

    return pontoTuristicoRecycle;
    }*/

    public static void inicia() {
        usuario = new ArrayList<>();
        pontoTuristico = new ArrayList<>();
        favorito = new ArrayList<>();
        medalha = new ArrayList<>();
        estrela = new ArrayList<>();

        pontoTuristico.add(new PontoTuristico(1, 4, "Cachoeira do Tatete", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, cons ectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.", "-27.020943", "-49.820392", "Localidade da Onça", R.drawable.tatete78, R.drawable.tatete280, 0, 0, null, null, null, null, null, null));
        pontoTuristico.add(new PontoTuristico(2, 3, "Boteco do Gel", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi Lorem ipsum dolor sit amet, cons ectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.", "-27.037314", "-49.6285276", "Rua. 1º de Maio, 222-340 - Pinheiro, Pres. Getúlio - SC, 89150-000", R.drawable.buteco78, R.drawable.buteco280, 0, 1, "(47) 99785-0958", "(47) 99785-0958", "https://www.facebook.com/botecodogel", "https://www.instagram.com/botecodogel/", null, null));

    }


    public static boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }

    public static Usuario getUsuarioAutenticado() {
        return usuarioAutenticado;
    }

    public void setUsuarioAutenticado(Usuario usuario) {
        this.usuarioAutenticado = usuarioAutenticado;
    }


}
