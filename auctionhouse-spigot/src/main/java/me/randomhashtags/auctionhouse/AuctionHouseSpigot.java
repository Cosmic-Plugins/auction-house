package me.randomhashtags.auctionhouse;

import me.randomhashtags.auctionhouse.supported.Vault;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AuctionHouseSpigot extends JavaPlugin {

    public static AuctionHouseSpigot getPlugin;
    public boolean placeholderapi;

    @Override
    public void onEnable() {
        getPlugin = this;
        getCommand("auctionhouse").setExecutor(AuctionHouseAPI.INSTANCE);
        enable();
    }

    @Override
    public void onDisable() {
        disable();
    }

    public void enable() {
        saveDefaultConfig();
        placeholderapi = Bukkit.getPluginManager().isPluginEnabled("PlaceholderAPI");
        Vault.getVault().setupEconomy();
        AuctionHouseAPI.INSTANCE.load();
    }
    public void disable() {
        AuctionHouseAPI.INSTANCE.unload();
        placeholderapi = false;
    }

    public void reload() {
        disable();
        enable();
    }
}
