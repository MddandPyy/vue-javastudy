package com.study.demo.designpattern.composite.composite1;

/**
 * 组织，组合模式中所有节点的统一模板，里面的方法即包含叶子店铺需要实现的打扫卫生方法，也包含，各级店铺，管理添加和关闭店铺的方法
 */
public interface Organization {

    /**
     * 定义所有方法，但是提供默认实现，这样叶子店铺可以不用重写，类似店铺添加和关闭的方法，因为叶子店铺没有下级店铺。
     */

    void tongzhi();

    void zhixing();

    default void add(Organization organization){
        throw new UnsupportedOperationException();
    }

    default void remove(Organization organization){
        throw new UnsupportedOperationException();
    }

}
