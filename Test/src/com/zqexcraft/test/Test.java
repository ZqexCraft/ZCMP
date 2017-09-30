package com.zqexcraft.test;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin implements Listener {
	

	    public void onEnable() {
	    	this.getServer().getPluginManager().registerEvents(this, this);
			this.getLogger().info("har blitt startet!");
			
		}
		public void onDisable() {
			this.getLogger().info("er nå av stoppet!");
		}
	
       @EventHandler
		public void onArrowHit(ProjectileHitEvent event) {
			Projectile projectile = event.getEntity();
			World world = projectile.getWorld();
			Location loc = projectile.getLocation();
			
			world.createExplosion(loc, 10);
		}
}
