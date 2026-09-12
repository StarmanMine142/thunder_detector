package starman.thunder_detector;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThunderDetectorFabric implements ClientModInitializer {
	public static final String MOD_ID = "thunder_detector";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitializeClient() {
		System.setProperty("java.awt.headless", "false");

		ClientTickEvents.END_CLIENT_TICK.register(ThunderChecker::check);

		LOGGER.info("Hello Fabric world!");
	}
}
