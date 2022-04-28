package ru.ckateptb.commons.config.gson;

import ru.ckateptb.commons.config.AbstractConfig;
import org.spongepowered.configurate.BasicConfigurationNode;
import org.spongepowered.configurate.gson.GsonConfigurationLoader;
import org.spongepowered.configurate.loader.AbstractConfigurationLoader;

public abstract class GsonConfig extends AbstractConfig<BasicConfigurationNode> {
    @Override
    protected AbstractConfigurationLoader.Builder<? extends AbstractConfigurationLoader.Builder<?, ? extends AbstractConfigurationLoader<BasicConfigurationNode>>, ? extends AbstractConfigurationLoader<BasicConfigurationNode>> getBuilder() {
        return GsonConfigurationLoader.builder();
    }
}
