package me.randomhashtags.auctionhouse;

import org.bukkit.plugin.java.JavaPlugin;

public final class AuctionHouseSpigot extends JavaPlugin {

    public static AuctionHouseSpigot getPlugin;

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
        AuctionHouseAPI.INSTANCE.load();
    }
    public void disable() {
        AuctionHouseAPI.INSTANCE.unload();
    }

    public void reload() {
        disable();
        enable();
    }
}
