package com.ab;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Arrays;
import java.util.List;

public class Letters {
    public static final Item A_LETTER = registerLetter("a");
    private static List<String> letters = Arrays.asList("b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v", "w", "x", "y", "z");
    public static void register(){
        for (String letter : letters){
            registerLetter(letter);
        }
    }
    private static Item registerLetter(String letter){
        final String name = letter + "_letter";
        final Block BLOCK = registerBlock(new Block(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(2.0F)), name);
        return registerItem(new BlockItem(BLOCK, new Item.Settings().group(LetterGroup.Letters_Group)), name);
    }
    private static Block registerBlock(Block block, String name){
        return Registry.register(Registry.BLOCK, new Identifier(Server.ID, name), block);
    }
    private static Item registerItem(Item item, String name){
        return Registry.register(Registry.ITEM, new Identifier(Server.ID, name), item);
    }
}

