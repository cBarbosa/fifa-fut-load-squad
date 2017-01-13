package sky.main;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import sky.controller.PlayerController;
import sky.model.PlayerModel;
import sky.model.bo.Player;

public class UpdateSquad {
	private static final Logger logger = LogManager.getLogger(UpdateSquad.class.getName());

	public static void main(String[] args)	{
		List<Player> players = new ArrayList<Player>();
		
		logger.info("====================[ INÍCIO DA ATUALIZAÇÃO DE SQUAD ]====================");

		try {
			
			players = PlayerModel.AtualizaSquad();
			
			//Fake
			/*Player p1 = new Player();
			Player p2 = new Player();
			p1.setName("Charles Cabelinho");
			p2.setName("Vitalzila Daiane dos Santos ");
			players.add(p1);
			players.add(p2);*/
			//Final Fake
			
			PlayerController playerController = new PlayerController();
			
			playerController.salvarPlayerAll(players);
			
			//ImageUrlUtil.getImagem("");
		} catch (Exception e)	{
			e.printStackTrace();
			logger.error("Nenhum dado a ser atualizado");
		}

		logger.info("====================[ FINAL DA ATUALIZAÇÃO DE SQUAD ]====================");
	}
}
