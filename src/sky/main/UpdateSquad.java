package sky.main;

import java.util.ArrayList;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import sky.model.PlayerModel;
import sky.model.bo.Player;
import sky.util.ImageUrlUtil;

public class UpdateSquad {
	private static final Logger logger = LogManager.getLogger(UpdateSquad.class.getName());

	public static void main(String[] args)	{
		ArrayList<Player> players = null;

		logger.info("====================[ INÍCIO DA ATUALIZAÇÃO DE SQUAD ]====================");

		try {
			players = PlayerModel.AtualizaSquad();
			//ImageUrlUtil.getImagem("");
		} catch (Exception e)	{
			logger.error("Nenhum dado a ser atualizado");
		}

		logger.info("====================[ FINAL DA ATUALIZAÇÃO DE SQUAD ]====================");
	}
}
