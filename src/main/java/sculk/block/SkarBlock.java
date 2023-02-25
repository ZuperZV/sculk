
package sculk.block;

import sculk.init.SculkModFluids;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

public class SkarBlock extends LiquidBlock {
	public SkarBlock() {
		super(() -> SculkModFluids.SKAR.get(), BlockBehaviour.Properties.of(Material.LAVA).strength(100f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).noCollission().noLootTable());
	}
}
