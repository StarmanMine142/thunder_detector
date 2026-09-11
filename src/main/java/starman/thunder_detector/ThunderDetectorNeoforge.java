package starman.thunder_detector;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.common.NeoForge;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(value = ThunderDetectorNeoforge.MOD_ID, dist = Dist.CLIENT)
public class ThunderDetectorNeoforge {
    public static final String MOD_ID = "thunder_detector";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public ThunderDetectorNeoforge() {
        NeoForge.EVENT_BUS.register(this);

        LOGGER.info("Hello NeoForge world!");
    }

    @SubscribeEvent
    public void onClientTick(ClientTickEvent.Post event) {
        ThunderChecker.check(net.minecraft.client.Minecraft.getInstance());
    }
}