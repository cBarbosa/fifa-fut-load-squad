package sky.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import sky.model.bo.Player;
import sky.model.dao.ConexaoMySQL;
import sky.model.dao.PlayerDAO;
import sky.model.dao.impl.PlayerDAOImpl;

public class PlayerController {
	
	PlayerDAO dao = new PlayerDAOImpl();
	
	public void salvarPlayerAll(List<Player> players) {
		Connection conexao = ConexaoMySQL.getConexaoMySQL();
		try{
			dao.limpaTabelaPlayer(conexao);
			for(Player p : players){
				dao.inserirPlayer(p,conexao);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConexaoMySQL.fechaConexao();
		}
	}
}
