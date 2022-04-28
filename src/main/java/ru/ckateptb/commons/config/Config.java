package ru.ckateptb.commons.config;

import org.spongepowered.configurate.ConfigurateException;
import org.spongepowered.configurate.loader.ConfigurationLoader;
import org.spongepowered.configurate.objectmapping.ConfigSerializable;

import java.io.File;

@ConfigSerializable
public interface Config {
    void load();

    void save() throws ConfigurateException;

    File getFile();

}
