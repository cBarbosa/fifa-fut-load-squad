package sky.model.dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import sky.model.bo.Player;
import sky.model.dao.PlayerDAO;

public class PlayerDAOImpl implements PlayerDAO {

	@Override
	public void inserirPlayer(Player player,Connection conexao) throws SQLException {
		final String INSERT = "INSERT INTO PLAYER (name) VALUES (?)";//cada atributo novo inserir ",?"
		PreparedStatement ps;
		ps = conexao.prepareStatement(INSERT);
		ps.setString(1, player.getName());
		//daqui pra baixo incluir um atributo da tabela para cada "?"
		ps.execute();
	}
	@Override
	public void limpaTabelaPlayer(Connection conexao) throws SQLException {
		PreparedStatement psDelete;
		psDelete = conexao.prepareStatement("delete FROM fifa.player where idplayer>0");
		psDelete.execute();
	}
}
