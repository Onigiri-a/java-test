package com.team.service;

import com.team.domain.Employee;
import com.team.domain.Programmer;

/**
 * @description�����ɾ��
 * @author: chenhz Email:chenhuaizhi800@163.com
 * @version: v
 * @time: 2023/2/15 11:37
 */


public class TeamService {
    private int counter=1;
    private static final int MAX_MEMBER=5;//����
    private Programmer[] team=new Programmer[MAX_MEMBER];//��Ա��Ϣ
    private int total;//ʵ������

    public TeamService() {
        super();
    }
    //��ȡ������Ա
    public  Programmer[] getTeam(){
        Programmer[] team= new Programmer[total];
        for(int i=0;i<team.length ;i++){
            team[i]=this.team[i];


        }


        return team;
    }
    //������Ա
    public void addMember(Employee e)throws TeamException{
        if(total>MAX_MEMBER){
            throw new TeamException("��Ա����");
        }
        if(!(e instanceof Programmer)){
            throw new TeamException("��Ա���ǿ�����Ա");
        }
        isExist(e);
    }
    //ɾ����Ա
    public void removeMember(int memberId){

    }

    private boolean isExist(Employee e){




        return false;
    }



}
