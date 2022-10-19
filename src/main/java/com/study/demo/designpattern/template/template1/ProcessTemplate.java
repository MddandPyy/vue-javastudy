package com.study.demo.designpattern.template.template1;

public abstract class ProcessTemplate {
    private String name;

    void start(String processName){
        setName(processName);
        System.out.println(processName+"，已启动");
    }

    abstract void operation(String operType);

    void end(String processName){
        System.out.println(processName+"，已结束");
    }

    void auto(String processName){
        start(processName);
        operation("同意");
        end(processName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
