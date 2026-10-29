package com.ab;

import net.fabricmc.api.ModInitializer;

public class Server implements ModInitializer {
	public static final String ID = "ab";
	@Override
	public void onInitialize() {
		Letters.register();
	}
}