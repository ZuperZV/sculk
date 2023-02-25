
package sculk.fluid;

import sculk.init.SculkModItems;
import sculk.init.SculkModFluids;
import sculk.init.SculkModFluidTypes;
import sculk.init.SculkModBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

public abstract class SkarFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> SculkModFluidTypes.SKAR_TYPE.get(), () -> SculkModFluids.SKAR.get(), () -> SculkModFluids.FLOWING_SKAR.get()).explosionResistance(100f)
			.bucket(() -> SculkModItems.SKAR_BUCKET.get()).block(() -> (LiquidBlock) SculkModBlocks.SKAR.get());

	private SkarFluid() {
		super(PROPERTIES);
	}

	public static class Source extends SkarFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SkarFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
