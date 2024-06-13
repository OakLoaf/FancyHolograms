package de.oliver.fancyholograms.hologram.version;

import de.oliver.fancyholograms.api.data.*;
import de.oliver.fancyholograms.hologram.nms.MappingKeys1_19_4;
import de.oliver.fancyholograms.hologram.nms.NMSHologram1_19_4;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import org.bukkit.World;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public final class Hologram1_20_6 extends NMSHologram1_19_4 {

    public Hologram1_20_6(@NotNull final HologramData data) {
        super(data, new HashMap<>(){
            {
                put(MappingKeys1_19_4.DISPLAY__DATA_TRANSFORMATION_INTERPOLATION_DURATION_ID, "DATA_TRANSFORMATION_INTERPOLATION_DURATION_ID");
                put(MappingKeys1_19_4.DISPLAY__DATA_TRANSFORMATION_INTERPOLATION_START_DELTA_TICKS_ID, "DATA_TRANSFORMATION_INTERPOLATION_START_DELTA_TICKS_ID");
                put(MappingKeys1_19_4.TEXT_DISPLAY__DATA_LINE_WIDTH_ID, "DATA_LINE_WIDTH_ID");
                put(MappingKeys1_19_4.TEXT_DISPLAY__DATA_BACKGROUND_COLOR_ID, "DATA_BACKGROUND_COLOR_ID");
            }
        });
    }

    @Override
    public ServerPlayer getServerPlayer(Player player) {
        return ((CraftPlayer) player).getHandle();
    }

    @Override
    public ServerLevel getServerLevel(World world) {
        return ((CraftWorld) world).getHandle();
    }
}
