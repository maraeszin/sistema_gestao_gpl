package model.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySql implements Conexao {

    private final String USUARIO = System.getenv("DB_USUARIO");
    private final String SENHA = System.getenv("DB_SENHA");
    private final String URL = System.getenv("DB_URL");
    private Connection conectar;

    @Override
    public Connection obterConexao() throws SQLException {
        if (conectar == null) {
            conectar = DriverManager.getConnection(URL, USUARIO, SENHA);
        }

        return conectar;
    }
}
