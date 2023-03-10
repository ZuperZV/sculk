
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package sculk.init;

import sculk.block.SkarBlock;
import sculk.block.SculkkillerPortalBlock;
import sculk.block.SculkCrusherBlock;

import sculk.SculkMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class SculkModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SculkMod.MODID);
	public static final RegistryObject<Block> SCULK_CRUSHER = REGISTRY.register("sculk_crusher", () -> new SculkCrusherBlock());
	public static final RegistryObject<Block> SKAR = REGISTRY.register("skar", () -> new SkarBlock());
	public static final RegistryObject<Block> SCULKKILLER_PORTAL = REGISTRY.register("sculkkiller_portal", () -> new SculkkillerPortalBlock());
}
