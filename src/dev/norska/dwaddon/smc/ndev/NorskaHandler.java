package dev.norska.dwaddon.smc.ndev;

import dev.norska.dwaddon.smc.ndev.handlers.CacheHandler;
import dev.norska.dwaddon.smc.ndev.handlers.ConfigHandler;
import lombok.Getter;

public class NorskaHandler {
	
	@Getter private CacheHandler cacheHandler = new CacheHandler();
	@Getter private ConfigHandler configurationHandler = new ConfigHandler();

}
