package czerwcu.nerfaxe;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.ItemStack;

public class HitEvent implements Listener {
    @EventHandler
    public void OnAxeHitEvent(EntityDamageEvent event){
        if(event.getEntityType() == EntityType.PLAYER){
        Player p = (Player)event.getEntity();
        Material it = p.getInventory().getItemInMainHand().getType();
        if(it==Material.GOLD_AXE || it==Material.DIAMOND_AXE || it==Material.IRON_AXE || it==Material.STONE_AXE || it==Material.WOOD_AXE){
            event.setDamage(1);
        }
    }
    }

}
