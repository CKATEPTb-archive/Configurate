package ru.ckateptb.commons.config.jackson;

import ru.ckateptb.commons.config.AbstractConfig;
import org.spongepowered.configurate.BasicConfigurationNode;
import org.spongepowered.configurate.jackson.JacksonConfigurationLoader;
import org.spongepowered.configurate.loader.AbstractConfigurationLoader;

public abstract class JacksonConfig extends AbstractConfig<BasicConfigurationNode> {
    @Override
    protected AbstractConfigurationLoader.Builder<? extends AbstractConfigurationLoader.Builder<?, ? extends AbstractConfigurationLoader<BasicConfigurationNode>>, ? extends AbstractConfigurationLoader<BasicConfigurationNode>> getBuilder() {
        return JacksonConfigurationLoader.builder();
    }
}
