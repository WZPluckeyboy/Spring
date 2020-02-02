package com.ping.Service.impl;

import com.ping.Dao.IAccountDao;
import com.ping.Service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 用于创建对象的注解（和在xml中编写<bean>实现功能一样）
 *   //@Component:把当前类存入spring容器
 *          属性为 value
 *   //Controller（表现层）
 *   //Service（业务层）
 *   //Repository（持久层）(此三个注解与component的作用与属性一模一样，是 spring框架为我们提供
 *    三层架构明确使用）
 * 用于注入数据的注解（和property标签一样）
 *    AutoWired：自动按照类型注入
 *     可以在成员变量、方法上
 *     Qualifier:再按照类型注入的基础上按照名字注入
 *    Resource直接按照bean的id注入
 *    基本类型   @value注入基本类型与String类型
 *    集合类型只能通过xml实现
 * 用于改变作用范围的（和scope属性一样）@Scope 属性value
 *
0 * 用于生命周期的（和在bean标签使用init和destory一样）
 */
@Component(value = "accountService")
@Scope("propotype")
public class AccountServiceImpl implements IAccountService {
   /* @Autowired
    @Qualifier("acconutDao2")*/
   @Resource(name = "acconutDao2")
    private IAccountDao  accountDao=null;
    public void saveAccount() {
        accountDao.saveAccount();

    }
}
