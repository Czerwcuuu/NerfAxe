package czerwcu.nerfaxe;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.ItemStack;

public class HitEvent implements Listener {
    @EventHandler
    public void OnAxeHitEvent(EntityDamageByEntityEvent event){
        Player p = (Player)event.getDamager();
        Material it = p.getInventory().getItemInMainHand().getType();
        if(it==Material.GOLD_AXE || it==Material.DIAMOND_AXE || it==Material.IRON_AXE || it==Material.STONE_AXE || it==Material.WOOD_AXE){
            event.setDamage(1);
        }
    }
    }

