package work.siro.mod.pvpparticles.classes;

import net.minecraft.world.World;

public class Location {

	public double x;
	public double y;
	public double z;
	public double eyeHeight;
	public World world;

	public Location(World world,double x, double y, double z,double eyeHeight) {
		this.world = world;
		this.x = x;
		this.y = y;
		this.z = z;
		this.eyeHeight = eyeHeight;
	}

}
