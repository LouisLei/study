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
 * ����ģʽ�������д����Ĳ�Ʒ��Ҫ������������Щ��Ʒ��һ�µĽӿ�
 */
public class WorkFactoryTest {

	/**
	 * 1.��ͨ����ģʽ ���Ҫ���������Ͷ�����Ҫ�½��ܶ࣬һ����Ҫ���ܶ�Ķ�Ӧ�࣬������factory������ҪЩ���ӵ������ж�if else�����һ���Ҫ
	 * ������Ӧ�Ĳ�����ȥ
	 * 2. Υ������ԭ�����������࣬һ��Ҫ�����µĲ�Ʒ����Ҫ�޸Ĺ�����
	 */
	@Test
	public void testNormalWorkFactory() {
		NormalSendFactory nsf = new NormalSendFactory();
		Send ns = nsf.send("email");
		ns.send();
	}

	/**
	 * 1.����������� �������治��Ҫ�����κβ��������ж�Ҫ����������ͣ����ǻ��ǻ���һ�����ͺܶ��ʱ��Ҫд�϶�Ĺ�����������Ӧ���Ե�����
	 * 2. Υ������ԭ�����������࣬һ��Ҫ�����µĲ�Ʒ����Ҫ�޸Ĺ�����
	 */
	@Test
	public void testMultiMthodFactory() {
		MultiMethodFactory mmf = new MultiMethodFactory();
		EmailSend es = mmf.emailSend();
		es.send();
	}
	
	/**
	 * ���󷽷����������Ҫ�����µĲ�Ʒֻ��ʵ�ֶ�Ӧ�Ľӿڽ������ż��ɣ�����Ҫ�޸�ԭ���Ĵ��룬׼���˿���ԭ��
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
