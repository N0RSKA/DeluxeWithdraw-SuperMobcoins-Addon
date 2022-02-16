package dev.norska.dwaddon.smc.addon;

import java.util.List;

import org.bukkit.entity.Player;

import dev.norska.dw.api.DWAddonInterface;
import dev.norska.dwaddon.smc.SMCAddon;
import me.swanis.mobcoins.MobCoinsAPI;

public class SMCInterface implements DWAddonInterface {

	@Override
	public void add(Player p, Double amount) {
		MobCoinsAPI.getProfileManager().getProfile(p).setMobCoins((long) (MobCoinsAPI.getProfileManager().getProfile(p).getMobCoins() + amount));
	}

	@Override
	public void add(Player p, Integer amount) {
		MobCoinsAPI.getProfileManager().getProfile(p).setMobCoins((long) (MobCoinsAPI.getProfileManager().getProfile(p).getMobCoins() + amount));
	}

	@Override
	public String adminCreator() {
		return SMCAddon.getInstance().getNHandler().getCacheHandler().getCreatorForAdminItems();
	}

	@Override
	public int currencyFormat() {
		return SMCAddon.getInstance().getNHandler().getCacheHandler().getCurrencyFormat();
	}

	@Override
	public String currencyString() {
		return SMCAddon.getInstance().getNHandler().getCacheHandler().getCurrencyName();
	}

	@Override
	public Double getCurrent(Player p) {
		return (double) MobCoinsAPI.getProfileManager().getProfile(p).getMobCoins();
	}

	@Override
	public Boolean has(Player p, Double amount) {
		return MobCoinsAPI.getProfileManager().getProfile(p).getMobCoins() >= amount;
	}

	@Override
	public Boolean has(Player p, Integer amount) {
		return MobCoinsAPI.getProfileManager().getProfile(p).getMobCoins() >= amount;
	}

	@Override
	public String layout() {
		return SMCAddon.getInstance().getNHandler().getCacheHandler().getItemLayout();
	}

	@Override
	public Double maxWithdraw() {
		return SMCAddon.getInstance().getNHandler().getCacheHandler().getMaxWithdraw();
	}

	@Override
	public Double minWithdraw() {
		return SMCAddon.getInstance().getNHandler().getCacheHandler().getMinWithdraw();
	}

	@Override
	public void set(Player p, Double arg1) {
		
		
	}

	@Override
	public void set(Player p, Integer amount) {
		
	}

	@Override
	public void take(Player p, Double amount) {
		MobCoinsAPI.getProfileManager().getProfile(p).setMobCoins((long) (MobCoinsAPI.getProfileManager().getProfile(p).getMobCoins() - amount));
	}

	@Override
	public void take(Player p, Integer amount) {
		MobCoinsAPI.getProfileManager().getProfile(p).setMobCoins((long) (MobCoinsAPI.getProfileManager().getProfile(p).getMobCoins() - amount));
	}

	@Override
	public List<String> withdrawCommands() {
		return SMCAddon.getInstance().getNHandler().getCacheHandler().getCommands();
	}

}
