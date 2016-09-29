package com.parents;

public class Elf extends CharacterClass {
	
	protected int health = 0;

	public Elf() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Elf(int health, int magic, String name) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setHealth(int health) {
		// TODO Auto-generated method stub
		super.setHealth(health + 100);
	}

	@Override
	public void setMagic(int magic) {
		// TODO Auto-generated method stub
		super.setMagic(magic + 50);
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName("Legolas");
	}

}
