package com.lakala.work.test_dubbox_api;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;

public class SerializationOptimizerImpl implements SerializationOptimizer {

	@Override
	public Collection<Class> getSerializableClasses() {
		List<Class> classes = new LinkedList<Class>();
        classes.add(User.class);
        return classes;
	}

}
