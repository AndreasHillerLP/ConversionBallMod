package net.andreashiller.minecraft.conversionball.misc;

import net.andreashiller.minecraft.conversionball.ConversionBall;
import net.minecraft.util.ChatComponentText;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class CBEventListener {
	
	@SubscribeEvent
	public void onPlayerLogin(PlayerLoggedInEvent event) {
		if (Version.hasNewVersion) {
			event.player.addChatComponentMessage(new ChatComponentText("A new version of the ConversionBall Mod is available. You can download it from Curse.com. The new version is: "+Version.remoteVersion));
		}
	}
}
