package de.epiceric.shopchest.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import de.epiceric.shopchest.shop.Shop;

public abstract class ShopEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    /**
     * @return Shop which is involved in this event
     */
    public abstract Shop getShop();

    /**
     * @return Player who is involved in this event
     */
    public abstract Player getPlayer();

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

}
