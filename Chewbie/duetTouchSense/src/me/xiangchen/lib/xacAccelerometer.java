package me.xiangchen.lib;

public class xacAccelerometer {
	
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
}
