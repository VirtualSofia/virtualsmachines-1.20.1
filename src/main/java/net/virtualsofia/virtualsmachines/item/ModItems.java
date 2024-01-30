package net.virtualsofia.virtualsmachines.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.network.packet.s2c.play.PositionFlag;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.virtualsofia.virtualsmachines.VirtualsMachines;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build())));

    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new FabricItemSettings()));



    public static void addItemToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(RUBY);
        entries.add(TIN_INGOT);
        entries.add(RAW_TIN);

    }

    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(VirtualsMachines.MOD_ID, name), item);
    }

    public static void registerModItems(){
        VirtualsMachines.LOGGER.info("Registering Mod Items for" + VirtualsMachines.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIngredientItemGroup);
    }

 /*
     public void test(PlayerEntity player){
        player.teleport()

        );
    }
  */
}
