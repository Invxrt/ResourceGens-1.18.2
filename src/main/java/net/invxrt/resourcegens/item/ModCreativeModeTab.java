package net.invxrt.resourcegens.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.checkerframework.checker.units.qual.C;

public class ModCreativeModeTab {
    public static final CreativeModeTab RESOURCEGENS_TAB = new CreativeModeTab("resourcegenstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TIER1CATALYST.get());
        }
    };
}
