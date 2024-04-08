package com.wsz.designed.principle.demeter;

/**
 * @author 完善者
 * @date 2024/4/8
 * @desc
 */
public class TeamLeader implements Manager {

    private Programmer programmer;

    public void setProgrammer(Programmer programmer) {
        this.programmer = programmer;
    }

    public void assignTask() {
        System.out.println("给下属分配任务");
        if (programmer instanceof JavaProgrammer) {
            // 如果是java程序员，分配的是java开发任务
            ((JavaProgrammer) programmer).work();
        } else if (programmer instanceof PythonProgrammer) {
            // 如果是python程序员，分配的是python开发任务
            ((PythonProgrammer) programmer).work();
        }

    }
}
