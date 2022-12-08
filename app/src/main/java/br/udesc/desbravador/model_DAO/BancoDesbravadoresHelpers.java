package br.udesc.desbravador.model_DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public  class BancoDesbravadoresHelpers extends SQLiteOpenHelper {

    private static final int DATA_VERSION = 1;
    private static final String NAME_DB = "bancodesbravadores.db";
    static final String TB_USUARIO = "tb_usuario";
    static final String TB_PONTO_TURISTICO = "tb_ponto_turistico";
    static final String TB_TIPO_TURISMO = "tb_tipo_turismo";
    static final String TB_FAVORITO = "tb_favorito";
    static final String TB_ESTRELA = "tb_estrela";
    static final String TB_MEDALHA_USUARIO = "tb_medalha_usuario";
    static final String TB_MEDALHA = "tb_medalha";

    public BancoDesbravadoresHelpers(Context context) {
        super(context, NAME_DB, null, DATA_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String sql = "CREATE TABLE IF NOT EXISTS " +  TB_USUARIO +
                " (id_usuario INTEGER PRIMARY KEY AUTOINCREMENT , " +
                "nome TEXT not null ," +
                "email TEXT UNIQUE not null , " +
                "senha TEXT not null); ";

        try{
            sqLiteDatabase.execSQL(sql);
        } catch (Exception e) {
            Log.i("ERROR", "Erro ao criar a tabela: " + e.getMessage());
        }

        String sql1 = "CREATE TABLE IF NOT EXISTS " +  TB_PONTO_TURISTICO +
                " (id_ponto_turistico INTEGER PRIMARY KEY AUTOINCREMENT , " +
                "id_tipo_turismo INTEGER not null ," +
                "nome TEXT not null , " +
                "descricao TEXT not null ," +
                "latitude TEXT not null , " +
                "longitude TEXT not null , " +
                "endereco TEXT not null, " +
                "imagem_pequena TEXT not null , " +
                "imagem_grande TEXT not null , " +
                "e_util INT not null , " +
                "e_cnpj INT not null , " +
                "telefone TEXT , " +
                "whatsapp TEXT , " +
                "facebook TEXT , " +
                "instagram TEXT , " +
                "email TEXT , " +
                "funcionamento TEXT , " +
                "FOREIGN KEY(id_tipo_turismo) REFERENCES TB_TIPO_TURISMO(id_tipo_turismo)); ";

        try{
            sqLiteDatabase.execSQL(sql1);
        } catch (Exception e) {
            Log.i("ERROR", "Erro ao criar a tabela: " + e.getMessage());
        }

        String sql2 = "CREATE TABLE IF NOT EXISTS " +  TB_TIPO_TURISMO +
                " (id_tipo_turismo INTEGER PRIMARY KEY AUTOINCREMENT , " +
                "descricao TEXT not null); ";

        try{
            sqLiteDatabase.execSQL(sql2);
        } catch (Exception e) {
            Log.i("ERROR", "Erro ao criar a tabela: " + e.getMessage());
        }

        String sql3 = "CREATE TABLE IF NOT EXISTS " +  TB_FAVORITO +
                "(id_usuario INTEGER PRIMARY KEY not null , " +
                "id_ponto_turistico INTEGER PRIMARY KEY not null , " +
                "FOREIGN KEY(id_usuario) REFERENCES TB_USUARIO(id_usuario) , " +
                "FOREIGN KEY(id_ponto_turistico) REFERENCES TB_TIPO_TURISMO(id_ponto_turistico));";

        try{
            sqLiteDatabase.execSQL(sql3);
        } catch (Exception e) {
            Log.i("ERROR", "Erro ao criar a tabela: " + e.getMessage());
        }

        String sql4 = "CREATE TABLE IF NOT EXISTS " +  TB_ESTRELA +
                "(id_usuario INTEGER PRIMARY KEY not null, " +
                "id_ponto_turistico INTEGER PRIMARY KEY not null , " +
                "estralas INTERGER not null , " +
                "FOREIGN KEY(id_usuario) REFERENCES TB_USUARIO(id_usuario) , " +
                "FOREIGN KEY(id_ponto_turistico) REFERENCES TB_TIPO_TURISMO(id_ponto_turistico)); ";
        try{
            sqLiteDatabase.execSQL(sql4);
        } catch (Exception e) {
            Log.i("ERROR", "Erro ao criar a tabela: " + e.getMessage());
        }

        String sql5 = "INSERT INTO [TB_TIPO_TURISMO] ([id_tipo_turismo], [descricao]) VALUES " +
                "(1,'História'), " +
                "(2,'Hotelaria'), " +
                "(3,'Gastronomia'), " +
                "(4,'Natureza'), " +
                "(5,'Praças'), " +
                "(6,'Religioso'), " +
                "(7,'Esportivo'), " +
                "(8,'Rural'), " +
                "(9,'Saúde'), " +
                "(10,'Monumentos'), " +
                "(11,'Artesanato'), " +
                "(12,'Eventos') ";

        try{
            sqLiteDatabase.execSQL(sql5);
        } catch (Exception e) {
            Log.i("ERROR", "Erro ao preencher a tabela: " + e.getMessage());
        }

        String sql6 = "INSERT INTO [TB_PONTO_TURISTICO] ([id_ponto_turistico], [id_tipo_turismo], [nome], [descricao], [latitude], [longitude], [endereco], [imagem_pequena], [imagem_grande], [e_util], [e_cnpj], [telefone], [whatsapp], [facebook], [instagram], [email], [funcionamento]) VALUES " +
                "(1, 4, 'Cachoeira do Tatete', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, cons ectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', '-27.020943', '-49.820392', 'Localidade da Onça', 'R.Drawble.tatete78', 'R.Drawble.tatete280', 0, 0, null, null, null, null, null, null), " +
                "(2, 3, 'Boteco do Gel', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi Lorem ipsum dolor sit amet, cons ectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', '-27.037314', '-49.6285276', 'Rua. 1º de Maio, 222-340 - Pinheiro, Pres. Getúlio - SC, 89150-000', 'R.Drawble.buteco78', 'R.Drawble.buteco280', 0, 1, '(47) 99785-0958', '(47) 99785-0958', 'https://www.facebook.com/botecodogel', 'https://www.instagram.com/botecodogel/', null, null), " +
                "(3, 6, 'Igreja São Roque', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, cons ectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', '-27.068091', '-49.708676', 'Estrada Geral do Mirador', 'R.Drawble.igrejamirador78', 'R.Drawble.igrejamirador280', 0, 0, null, null, null, null, null, null), " +
                "(4, 3, 'Deck Pizzaria', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, cons ectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', '-27.041605', '-49.615409', 'Rua Mirador, 588 - Centro, Pres. Getúlio - SC, 89150-000', 'R.Drawble.deck78', 'R.Drawble.deck280'' 0, 1, ''(47) 3352-2452', null, 'https://www.facebook.com/deckpizzariaechopperia', 'https://www.instagram.com/deck.pizzaria/', null, 'Quarta, Quinta, Sexta, Sábado e Domingo das 19h ás 00h'), " +
                "(5, 4, 'Salto Gharl', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, cons ectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', '-27.053491', '-49.680029', 'Estradar Geral do Mirador', 'R.Drawble.saltograhl78', 'R.Drawble.saltograhl280', 0, 0, null, null, null, null, null, null), " +
                "(6, 6, 'Igreja da Serra dos Índios', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, cons ectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', '-27.087605', '-49.812860', 'Estrada Geral Serra dos Índios', 'R.Drawble.igrejaserra78', 'R.Drawble.igrejaserra280', 0, 0, null, null, null, null, null, null), " +
                "(7, 4, 'Cachoeira da Santa', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, cons ectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', '-27.052892', '-49.710304', 'Estrada Geral da Urucurana', 'R.Drawble.cachoeirasanta78', 'R.Drawble.cachoeirasanta28', 0, 0, null, null, null, null, null, null), " +
                "(8, 6, 'Igreja da Papanduva', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, cons ectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', '-27.038086', '-49.827639', 'Estrada Geral da Papanduva', 'R.Drawble.igrejapapanduva78', 'R.Drawble.igrejapapanduva280', 0, 0, null, null, null, null, null, null), " +
                "(9, 3, 'Avancini Gastro Bar', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, cons ectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', '-27.044041', '-49.621327', 'Rua 25 de Julho, 38-116 - Centro, Pres. Getúlio - SC - 89150-000', 'R.Drawble.avancini78', 'R.Drawble.avancini280', 0, 1, '(47) 99166-8631', '(47) 99166-8631', 'https://www.facebook.com/RestauranteCayora', 'https://www.instagram.com/avancinigastrobar/', null, null), "  +
                "(10, 12, 'Prefeitura', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, cons ectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', '-27.046990', '-49.627808', 'Praça Otto Müller, 10 - Centro, Pres. Getúlio - SC, 89150-000', 'R.Drawble.prefeitura78', 'R.Drawble.prefeitura280', 1, 1, '(47) 3352-5500', null, 'https://www.facebook.com/prefeiturapresidentegetulio', 'https://www.instagram.com/prefeiturapresidentegetulio', null, 'Segunda à sexta das 08:00 às 12:00 e das 13:30 às 16:30'), " +
                "(11, 12, 'Hospital', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, cons ectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', '-27.0515719', '-49.6218075', 'Rua Padre Adalberto Ortmann, 197 - Centro, Pres. Getúlio - SC, 89150-000', 'R.Drawble.hospital78', 'R.Drawble.hospital280', 1, 1, '(47) 3352-1234', null, 'https://www.facebook.com/hospitalmariauxiliadorapg', null, null, 'Sempre aberto'), " +
                "(12, 12, 'Bombeiros', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, cons ectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', '-27.0423343', '-49.6116218', 'Rua Rodrigo Cidade Bonetti Tobias, 55 - Primavera, Pres. Getúlio - SC, 89150-000', 'R.Drawble.bombeiro78', 'R.Drawble.bombeiro280', 1, 1, '193', null, null, null, null, 'Sempre aberto'), " +
                "(13, 4, 'Cachoeira Tabarelli', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, cons ectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', '-27.094350', '-49.781771', 'Estrada Geral do Mirador' ,'R.Drawble.cachoeira_tabarelli', 'R.Drawble.topod', 0, 0, null, null, null, null, null, null) " ;

        try{
            sqLiteDatabase.execSQL(sql6);
        } catch (Exception e) {
            Log.i("ERROR", "Erro ao preencher a tabela: " + e.getMessage());
        }

        String sql7 = "CREATE TABLE IF NOT EXISTS " +  TB_MEDALHA +
                "(id_medalha INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nome TEXT not null , " +
                "ativada TEXT not null , " +
                "desativada TEXT not null , " +
                "descriacao TEXT not null); ";
        try{
            sqLiteDatabase.execSQL(sql7);
        } catch (Exception e) {
            Log.i("ERROR", "Erro ao criar a tabela: " + e.getMessage());
        }

        String sql8 = "INSERT INTO [TB_MEDALHA] ([id_medalha], [nome], [ativada], [desativada], [descricao]) VALUES " +
                "(1,'CurtidaBronze', 'curtirbronze', 'curtirnormal'), " +
                "(2,'CurtidaPrata', 'curtirprata','curtirnormal'), " +
                "(3,'CurtidaOuro', 'curtirdourada', 'curtirnormal'), " +
                "(4,'FavotiroBronze', 'coracaobronze','coracaonomral'), " +
                "(5,'FavotiroPrata', 'coracaoprata','coracaonomral'), " +
                "(6,'FavotiroOuro', 'coracaodourado', 'coracaonomral')" ;

        try{
            sqLiteDatabase.execSQL(sql8);
        } catch (Exception e) {
            Log.i("ERROR", "Erro ao preencher a tabela: " + e.getMessage());
        }

        String sql9 = "CREATE TABLE IF NOT EXISTS " +  TB_MEDALHA_USUARIO +
                "(id_usuario INTEGER PRIMARY KEY not null, " +
                "id_tipo_medalha INTEGER PRIMARY KEY not null , " +
                "ativa BOOLEAN not null , " +
                "FOREIGN KEY(id_usuario) REFERENCES TB_USUARIO(id_usuario) , " +
                "FOREIGN KEY(id_medalha) REFERENCES TB_MEDALHA(id_medalha)); ";

        try{
            sqLiteDatabase.execSQL(sql9);
        } catch (Exception e) {
            Log.i("ERROR", "Erro ao criar a tabela: " + e.getMessage());
        }
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
