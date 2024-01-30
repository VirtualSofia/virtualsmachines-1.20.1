package net.virtualsofia.virtualsmachines.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.virtualsofia.virtualsmachines.VirtualsMachines;
import net.virtualsofia.virtualsmachines.block.ModBlocks;

public class ModItemGroups {


    public static final ItemGroup VIRTUALS_MACHINES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(VirtualsMachines.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.virtuals_machines"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {

                        //ADD ITEMS HERE

                        //MACHINES

                        //Ingots
                        entries.add(ModItems.TIN_INGOT);

                        //GEMS
                        entries.add(ModItems.RUBY);

                        //RAWS
                        entries.add(ModItems.RAW_TIN);

                        //Ingot/Gem Blocks
                        entries.add(ModBlocks.RUBY_BLOCK);

                        //ORES
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);







                    }).build());

    public static void registerItemGroups(){

        VirtualsMachines.LOGGER.info("Registering Mod Item Groups(creative tabs) for" + VirtualsMachines.MOD_ID);
    }
}
