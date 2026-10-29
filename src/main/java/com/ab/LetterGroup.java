package com.ab;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class LetterGroup {
    public static final ItemGroup Letters_Group = FabricItemGroupBuilder.build(new Identifier(Server.ID, "letters"), () -> new ItemStack(Letters.A_LETTER));
}
