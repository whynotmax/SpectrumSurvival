package dev.cfox.gamejam.utils;

import dev.cfox.gamejam.utils.config.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class Checks {
    private static final Logger logger = LoggerFactory.getLogger(Checks.class);
    public static void worldFiles() {
        logger.info("Checking for world files...");
        logger.debug("(Placeholder) World 'lobby.polar' found");
    }
    public static void configFile() {
        File configFile = new File(Configuration.CONFIG_FILE);

        if (!configFile.exists()) {
            Configuration.createDefaultConfig();
        } else {
            Configuration.loadConfig();
        }
    }
}