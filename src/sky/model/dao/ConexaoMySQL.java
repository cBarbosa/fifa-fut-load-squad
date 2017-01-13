package sky.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import sky.Configuration;

public class ConexaoMySQL {
	static final Logger logger = LogManager.getLogger(ConexaoMySQL.class.getName());

	public ConexaoMySQL() {

	}

	public static Connection getConexaoMySQL() {
		Connection connection = null;
		try {
			String driverName = "com.mysql.jdbc.Driver";
			Class.forName(driverName).newInstance();
			connection = DriverManager.getConnection("jdbc:mysql://" + Configuration.MYSQL_SERVER + ":"+ Configuration.MYSQL_PORT +"/" + Configuration.MYSQL_DB
										,Configuration.MYSQL_USER
										,Configuration.MYSQL_PASS);
			connection.setAutoCommit(true);
			logger.info("====== [MYSQL Conectado] ======");
			logger.info("\t "+ Configuration.MYSQL_SERVER + ":" + Configuration.MYSQL_PORT +"/"+ Configuration.MYSQL_DB );
			logger.info("\t "+ connection.hashCode() );
			logger.info("====== [MYSQL] ======");
		} catch (InstantiationException | IllegalAccessException e) {
			logger.error(null, e);
		} catch (ClassNotFoundException e) {
			logger.error(null, e);
		} catch (SQLException e) {
			logger.error(null, e);
		} finally{
			
		}

		return connection;
	}

	public static boolean fechaConexao() {
		try {
			ConexaoMySQL.getConexaoMySQL().close();
			logger.info("====== [MYSQL Fechado] ======");
			logger.info("\t "+ Configuration.MYSQL_SERVER + ":" + Configuration.MYSQL_PORT +"/"+ Configuration.MYSQL_DB );
			logger.info("====== [MYSQL] ======");
			return true;
		} catch (SQLException e) {
			logger.error(null, e);
			return false;
		}
	}
	
	public static boolean fechaConexao(Connection conexao) {
		try {
			conexao.close();
			logger.info("====== [MYSQL Fechado] ======");
			logger.info("\t "+ Configuration.MYSQL_SERVER + ":" + Configuration.MYSQL_PORT +"/"+ Configuration.MYSQL_DB );
			logger.info("\t "+ conexao.hashCode() );
			logger.info("====== [MYSQL] ======");
			return true;
		} catch (SQLException e) {
			logger.error(null, e);
			return false;
		}
	}
}