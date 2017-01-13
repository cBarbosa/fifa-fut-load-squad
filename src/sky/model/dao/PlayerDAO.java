package sky.model.dao;

import java.sql.Connection;
import java.sql.SQLException;

import sky.model.bo.Player;

public interface PlayerDAO {
	
	void inserirPlayer(Player player,Connection conexao) throws SQLException;

	void limpaTabelaPlayer(Connection conexao) throws SQLException;

}
