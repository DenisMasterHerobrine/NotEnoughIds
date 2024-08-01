package com.gtnewhorizons.neid;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = "neid",
        name = "NotEnoughIDs",
        version = "2.0.3",
        dependencies = "after:battlegear2@[1.3.0,);" + " required-after:gtnhlib@[0.2.1,);")
public class NEID {

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // try {
        // ConfigurationManager.registerConfig(NEIDConfig.class);
        // } catch (ConfigException e) {
        // throw new RuntimeException("Failed to register NotEnoughIDs config!");
        // }
    }

}
