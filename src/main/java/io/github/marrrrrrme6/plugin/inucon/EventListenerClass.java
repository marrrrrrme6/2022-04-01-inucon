package io.github.marrrrrrme6.plugin.inucon;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

import org.bukkit.Material.*;

import java.util.Objects;

public class EventListenerClass implements Listener {

    /*
    public void setCooldown(Material.SNOWBALL,10) {

    }
     */

    @EventHandler
    public void onHit(ProjectileHitEvent event) {
        Projectile p = event.getEntity();

        if(p instanceof Snowball){
            World w = p.getWorld();
            Location l = p.getLocation();
            String Name = p.getName();
            String CustomName = p.getCustomName();

            Bukkit.broadcastMessage(Name);
            Bukkit.broadcastMessage(Objects.requireNonNull(CustomName));
            w.createExplosion(l, 7.0f);
        }
    }
}
