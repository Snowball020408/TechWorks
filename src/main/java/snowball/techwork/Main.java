package snowball.techwork;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import snowball.techwork.proxy.CommonProxy;
import snowball.techwork.util.Reference;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENTSIDE, serverSide = Reference.COMMON, modId = Reference.MODID)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {}
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {}
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {}
}
