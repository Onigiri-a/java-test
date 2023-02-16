package com.team.service;

import com.team.domain.Employee;
import com.team.domain.Programmer;

/**
 * @description：添加删除
 * @author: chenhz Email:chenhuaizhi800@163.com
 * @version: v
 * @time: 2023/2/15 11:37
 */


public class TeamService {
    private int counter=1;
    private static final int MAX_MEMBER=5;//人数
    private Programmer[] team=new Programmer[MAX_MEMBER];//人员信息
    private int total;//实际人数

    public TeamService() {
        super();
    }
    //获取开发人员
    public  Programmer[] getTeam(){
        Programmer[] team= new Programmer[total];
        for(int i=0;i<team.length ;i++){
            team[i]=this.team[i];


        }


        return team;
    }
    //新增成员
    public void addMember(Employee e)throws TeamException{
        if(total>MAX_MEMBER){
            throw new TeamException("成员已满");
        }
        if(!(e instanceof Programmer)){
            throw new TeamException("成员不是开发人员");
        }
        isExist(e);
    }
    //删除成员
    public void removeMember(int memberId){

    }

    private boolean isExist(Employee e){




        return false;
    }



}
