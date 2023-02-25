package sculk.procedures;

import net.minecraft.world.entity.Entity;

public class SculkCrdherGuiWhileThisGUIIsOpenTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		SculkCrprProcedure.execute(entity);
	}
}
