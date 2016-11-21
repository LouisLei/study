package com.lakala.work.design.facade;

/**
 * ���ģʽ ���ڽ���ͬ������װ���������������֮���������
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
