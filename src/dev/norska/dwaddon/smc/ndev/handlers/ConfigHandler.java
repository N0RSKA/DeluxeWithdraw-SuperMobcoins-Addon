package dev.norska.dwaddon.smc.ndev.handlers;

import java.io.File;
import java.io.IOException;

import dev.norska.dwaddon.smc.SMCAddon;
import dev.norska.dwaddon.smc.config.CommentedConfiguration;
import lombok.Getter;

public class ConfigHandler {
	
	@Getter private CommentedConfiguration configFile;
	
	public void generateFiles(SMCAddon main) {
		File file = new File(main.getDataFolder(), "config.yml");

        if(!file.exists()) main.saveResource("config.yml", false);

        configFile = CommentedConfiguration.loadConfiguration(file);
        try {
			configFile.syncWithConfig(file, main.getResource("config.yml"), "no");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
