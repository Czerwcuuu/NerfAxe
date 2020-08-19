package czerwcu.nerfaxe;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class NerfAxe extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new HitEvent(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
