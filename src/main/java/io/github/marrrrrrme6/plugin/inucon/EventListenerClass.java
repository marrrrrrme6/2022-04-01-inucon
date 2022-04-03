package io.github.marrrrrrme6.plugin.inucon;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class EventListenerClass implements Listener {
    @EventHandler
    public void onHit(ProjectileHitEvent event) {
        Projectile p = event.getEntity();

        if(p instanceof Snowball && p.getName().equals("グレネード")){
            World w = p.getWorld();
            Location l = p.getLocation();

            w.createExplosion(l, 5.0f);
        }
    }
}
