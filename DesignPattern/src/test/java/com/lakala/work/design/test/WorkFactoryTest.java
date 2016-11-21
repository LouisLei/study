package com.lakala.work.design.test;

import org.junit.Test;

import com.lakala.work.design.workfactory.EmailSend;
import com.lakala.work.design.workfactory.EmailSendFactory;
import com.lakala.work.design.workfactory.MultiMethodFactory;
import com.lakala.work.design.workfactory.Send;
import com.lakala.work.design.workfactory.NormalSendFactory;
import com.lakala.work.design.workfactory.SmsSend;
import com.lakala.work.design.workfactory.SmsSendFactory;

/**
 * 工厂模式适用于有大量的产品需要创建，并且这些产品有一致的接口
 */
public class WorkFactoryTest {

	/**
	 * 1.普通工厂模式 如果要创建的类型多则需要新建很多，一方面要建很多的对应类，另外在factory里面需要些复杂的条件判断if else，而且还需要
	 * 传递相应的参数进去
	 * 2. 违反开闭原则，依赖工厂类，一旦要增加新的产品还需要修改工厂类
	 */
	@Test
	public void testNormalWorkFactory() {
		NormalSendFactory nsf = new NormalSendFactory();
		Send ns = nsf.send("email");
		ns.send();
	}

	/**
	 * 1.多个工厂方法 工厂里面不需要传递任何参数进来判断要输出何种类型，但是还是会有一旦类型很多的时候要写较多的工厂方法来对应各自的类型
	 * 2. 违反开闭原则，依赖工厂类，一旦要增加新的产品还需要修改工厂类
	 */
	@Test
	public void testMultiMthodFactory() {
		MultiMethodFactory mmf = new MultiMethodFactory();
		EmailSend es = mmf.emailSend();
		es.send();
	}
	
	/**
	 * 抽象方法工厂：如果要增加新的产品只需实现对应的接口进行扩张即可，不需要修改原来的代码，准守了开闭原则
	 */
	@Test
	public void testAbstractMethodFactory (){
		SmsSendFactory ssf = new SmsSendFactory();
		SmsSend ss = ssf.provider();
		ss.send();
		
		EmailSendFactory esf = new EmailSendFactory();
		EmailSend es = esf.provider();
		es.send();
	}

}
