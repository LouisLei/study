package com.lakala.work.design.facade;

/**
 * 外观模式 用于将不同的类组装起来，解决类与类之间的依赖性
 */
public class Computer {

	private Cpu cpu;
	private Disk disk;
	private Memory memory;

	public Computer() {

	}

	public Computer(Cpu cpu, Disk disk, Memory memory) {
		this.cpu = cpu;
		this.disk = disk;
		this.memory = memory;
	}

	public void startUp() {
		System.out.println("Start computer ... ");
		cpu.startUp();
		disk.startUp();
		memory.startUp();
		System.out.println("Start computer finish ... ");
	}

}
