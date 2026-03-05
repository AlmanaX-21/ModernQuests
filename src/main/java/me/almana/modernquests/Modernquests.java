package me.almana.modernquests;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(Modernquests.MODID)
public class Modernquests {

    public static final String MODID = "modernquests";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Modernquests(IEventBus modEventBus, ModContainer modContainer) {

    }
}
