package starman.thunder_detector;

import net.minecraft.client.Minecraft;

public class ThunderChecker {
    private static boolean wasThundering = false;

    public static void check(Minecraft client) {
        if (client.level == null) {
            wasThundering = false;
            return;
        }

        boolean isCurrentlyThundering = client.level.isThundering();

        if (isCurrentlyThundering && !wasThundering) {
            javax.swing.SwingUtilities.invokeLater(() -> {
                new ThunderWindow().setVisible(true);
            });
        }

        wasThundering = isCurrentlyThundering;
    }
}