package me.randomhashtags.auctionhouse;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
        id = "auctionhouse",
        name = "AuctionHouse",
        description = "Virtual market where you can buy, sell, and bid on other player's auctions.",
        authors = {
                "RandomHashTags"
        }
)
public class AuctionHouseSponge {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
    }
}
