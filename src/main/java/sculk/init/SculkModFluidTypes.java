
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package sculk.init;

import sculk.fluid.types.SkarFluidType;

import sculk.SculkMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

public class SculkModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, SculkMod.MODID);
	public static final RegistryObject<FluidType> SKAR_TYPE = REGISTRY.register("skar", () -> new SkarFluidType());
}
