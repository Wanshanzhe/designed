package com.wsz.designed.principle.demeter;

/**
 * @author 完善者
 * @date 2024/4/8
 * @desc
 */
public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        JavaProgrammer javaProgrammer = new JavaProgrammer();
        PythonProgrammer pythonProgrammer = new PythonProgrammer();

        // 老板通知项目经理开会
        boss.meet(teamLeader);
        teamLeader.setProgrammer(pythonProgrammer);
        // 项目经理开完会，进行任务分配
        teamLeader.assignTask();

    }
}
