package dev.celestialfox.gamejam.utils.config;

public class Settings {
    public static String getIP() {
        return Configuration.getServerIp();
    }

    public static int getPort() {
        return Configuration.getServerPort();
    }
}