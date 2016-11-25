package com.lakala.work.NIODemo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import org.junit.Test;

public class FileChannelTest {
	
	@Test
	public void testFileChannel() throws IOException{
		
		//定义channel
		RandomAccessFile raf = new RandomAccessFile("aa.txt", "r");
		FileChannel fileChannel = raf.getChannel();
		
		//定义buffer
		ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
		//将channel中的数据开始读入到buffer
		int readPosition = fileChannel.read(byteBuffer);
		System.out.println("readPosition:" + readPosition);
		//判断是否读完
		while(readPosition != -1){
			System.out.println("position:"+readPosition);
			//设置position重置为0
			byteBuffer.flip();
			while(byteBuffer.hasRemaining()){
				System.out.println(byteBuffer.get());
			}
			byteBuffer.clear();
			readPosition = fileChannel.read(byteBuffer);
		}
		fileChannel.close();
	}
	
	/**
	 * FileChannel 可以直接将一个文件的内容transfer 到另外一个文件
	 * @throws IOException
	 */
	@SuppressWarnings("resource")
	@Test
	public void transferTest() throws IOException{
		RandomAccessFile from = new RandomAccessFile("aa.txt", "rw");
		FileChannel fromChannel = from.getChannel();
		RandomAccessFile to = new RandomAccessFile("bb.txt", "rw");
		FileChannel toChannel = to.getChannel();
		toChannel.transferFrom(fromChannel, 0, fromChannel.size());
	}
	
}
