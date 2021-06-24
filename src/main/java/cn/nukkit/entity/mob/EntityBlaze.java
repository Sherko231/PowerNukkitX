package cn.nukkit.entity.mob;

import cn.nukkit.Player;
import cn.nukkit.api.PowerNukkitOnly;
import cn.nukkit.api.Since;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

/**
 * @author PikyCZ
 */
public class EntityBlaze extends EntityMob {

    public static final int NETWORK_ID = 43;

    @Override
    public int getNetworkId() {
        return NETWORK_ID;
    }

    public EntityBlaze(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }

    @Override
    protected void initEntity() {
        super.initEntity();
        this.setMaxHealth(20);
    }

    @Override
    public float getWidth() {
        return 0.5f;
    }

    @Override
    public float getHeight() {
        return 1.8f;
    }

    @PowerNukkitOnly
    @Since("FUTURE")
    @Override
    public String getStaticName() {
        return "Blaze";
    }

    @Override
    public boolean isPreventingSleep(Player player) {
        return true;
    }
}
