package org.dongDesignMode.StaticProxy;

public class UserDaoProxy implements IUserDao{

    private IUserDao target;

    public UserDaoProxy(IUserDao target){
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("开始代理：先执行业务逻辑");
        target.save();
        System.out.println("完成代理：执行保存后逻辑");
    }
}