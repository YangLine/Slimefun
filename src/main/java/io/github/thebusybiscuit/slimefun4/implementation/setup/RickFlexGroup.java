package io.github.thebusybiscuit.slimefun4.implementation.setup;

import io.github.bakedlibs.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.FlexItemGroup;
import io.github.thebusybiscuit.slimefun4.api.player.PlayerProfile;
import io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuideMode;
import io.github.thebusybiscuit.slimefun4.utils.ChatUtils;
import java.time.LocalDate;
import java.time.Month;
import javax.annotation.Nonnull;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;

/**
 * 中国电信超级定制物品
 * 让你话费倒扣
 * 网速倒转
 * 由Yang Line提供独家技术支持
 *
 * @author TheBusyBiscuit
 *
 */
class RickFlexGroup extends FlexItemGroup {

    // Never instantiate more than once.
    RickFlexGroup(@Nonnull NamespacedKey key) {
        super(key, new CustomItemStack(Material.NETHER_STAR, "&6&l中国电信定制卡"), 1);
    }

    // Gonna override this method
    @Override
    public boolean isVisible(Player p, PlayerProfile profile, SlimefunGuideMode layout) {
        // Give me the current date
        LocalDate date = LocalDate.now();

        // You can see where this is going
        return date.getMonth() == Month.APRIL && date.getDayOfMonth() == 1;
    }

    @Override
    public void open(Player p, PlayerProfile profile, SlimefunGuideMode layout) {
        // Up the game with this easter egg
        ChatUtils.sendURL(p, "https://www.bilibili.com/video/BV1GJ411x7h7");
        p.closeInventory();
    }
}
