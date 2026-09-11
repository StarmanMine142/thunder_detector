package starman.thunder_detector;

import net.minecraft.network.chat.Component;
import javax.swing.*;
import java.awt.*;

public class ThunderWindow extends JFrame {

    public ThunderWindow() {
        setTitle(Component.translatable("notification.thunder_detect.title").getString());

        setSize(350, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        String messageText = Component.translatable("notification.thunder_detect.message").getString();
        JLabel label = new JLabel(messageText, JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(label, BorderLayout.CENTER);

        JButton closeButton = new JButton(Component.translatable("notification.thunder_detect.button").getString());
        closeButton.addActionListener(e -> dispose());

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(closeButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        add(panel);
    }
}