package grifferthrydwy.transmutation;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.entity.BlockEntityType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main implements ModInitializer {
	public static final String MOD_ID = "transmutation";
	public static final Logger LOGGER = LogManager.getLogger("transmutation");
	//logger sends text to the console
	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		RegisterBlocks.register();
		RegisterItems.register();

		//on initialize of code, does these methods^^^
	}
}




