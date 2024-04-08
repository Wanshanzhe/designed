package com.wsz.designed.principle.demeter;

/**
 * @author 完善者
 * @date 2024/4/8
 * @desc
 */
public class Boss implements Manager {

    public void meet(TeamLeader teamLeader) {
        System.out.println("老板开会，分布任务");
        teamLeader.assignTask();
    }

}
