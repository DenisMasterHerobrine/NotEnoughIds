package com.gtnewhorizons.neid.core;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.gtnewhorizon.gtnhmixins.IEarlyMixinLoader;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

@IFMLLoadingPlugin.MCVersion("1.7.10")
@IFMLLoadingPlugin.TransformerExclusions({ "com.gtnewhorizons.neid.asm" })
@IFMLLoadingPlugin.Name("NotEnoughIDs Core")
public class NEIDCore implements IFMLLoadingPlugin, IEarlyMixinLoader {

    private static boolean isObfuscated;

    @Override
    public String getMixinConfig() {
        return null;
    }

    @Override
    public List<String> getMixins(Set<String> loadedCoreMods) {
        return null;
    }

    @Override
    public String[] getASMTransformerClass() {
        return null;
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {
        isObfuscated = false;
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }

    public static boolean isObfuscated() {
        return false;
    }
}
