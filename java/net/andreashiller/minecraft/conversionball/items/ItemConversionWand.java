package net.andreashiller.minecraft.conversionball.items;

import net.andreashiller.minecraft.conversionball.ConversionBall;
import net.andreashiller.minecraft.conversionball.handlers.ItemHandler;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class ItemConversionWand extends Item {
	
	public Block curBlock = Blocks.grass;
	
	public ItemConversionWand() {
		setCreativeTab(ConversionBall.tabConversionBall);
		setUnlocalizedName("ItemConversionWand");
		setTextureName(ConversionBall.MODID+":itemconversionwand");
		setMaxStackSize(1);
		setMaxDamage(511);
		canRepair = true;
		canItemEditBlocks();
	}
	
	
	public boolean onItemUse(ItemStack tool,EntityPlayer player, World world, int x, int y, int z, int par7, float xFloat, float yFloat, float zFloat)
	{	
		if (player.isSneaking() && !world.isRemote)
		{
			curBlock = world.getBlock(x, y, z);
			player.addChatMessage(new ChatComponentText("Selected Block: "+curBlock.getLocalizedName()));
			return false;
		} 
		else
		{
			if (!player.canPlayerEdit(x, y, z, par7, tool))
			{
				return false;
			}
			else
			{  
				if(tool.getItemDamage() < tool.getMaxDamage())
				{
					world.setBlock(x, y, z, curBlock);
					this.setDamage(tool, tool.getItemDamage()+1);
				}
				else
				{
					if(!world.isRemote)
					{
						player.addChatMessage(new ChatComponentText("The Conversion Wand is damaged. Please repair it with Red Coal in an anvil!"));
					}
				}
				
			}
		}
			return true;
		}
	
	
	@Override
	public boolean getIsRepairable(ItemStack par1, ItemStack par2)
    {
        return ItemHandler.itemRedCoal == par2.getItem() ? true : super.getIsRepairable(par1, par2);
    }
}