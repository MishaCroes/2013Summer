package me.xiangchen.lib;

public class xacAccelerometer {
	
	final public static int NUMACCELAXES = 3;
	
	public xacAccelerometer() {
		
	}
	
	float x;
	float y;
	float z;
	
	public void update(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public float getZ() {
		return z;
	}
}
