package com.lakala.work.design.adapter;

import org.junit.Test;

import com.lakala.work.design.facade.Computer;
import com.lakala.work.design.facade.Cpu;
import com.lakala.work.design.facade.Disk;
import com.lakala.work.design.facade.Memory;

/**
 * 外观模式 避免类与类之间的依赖
 */
public class FecadeTest {

	@Test
	public void testFecade() {
		Cpu cpu = new Cpu();
		Disk disk = new Disk();
		Memory memory = new Memory();

		Computer computer = new Computer(cpu, disk, memory);
		computer.startUp();
	}

}
