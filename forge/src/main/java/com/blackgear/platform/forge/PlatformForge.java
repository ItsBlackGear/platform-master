package com.blackgear.platform.forge;

import com.blackgear.platform.Platform;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Platform.MOD_ID)
public class PlatformForge {
    public PlatformForge() {
        Platform.init();
    }
}