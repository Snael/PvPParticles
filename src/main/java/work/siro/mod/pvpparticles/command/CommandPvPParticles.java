package work.siro.mod.pvpparticles.command;

import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.network.play.server.S18PacketEntityTeleport;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import work.siro.mod.pvpparticles.PvPParticles;
import work.siro.mod.pvpparticles.gui.GuiPvPParticlesSetting;

public class CommandPvPParticles extends CommandBase {

	@Override
	public int getRequiredPermissionLevel() {
		return 0;
	}

	@Override
	public String getCommandName() {
		return "pvpparticles";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/pvpparticles";
	}

	@Override
	public void processCommand(final ICommandSender sender, String[] args) throws CommandException {
		new GuiPvPParticlesSetting().display();
	}

	@Override
	public List<String> getCommandAliases() {
		return Arrays.asList("pvpp");
	}

}
