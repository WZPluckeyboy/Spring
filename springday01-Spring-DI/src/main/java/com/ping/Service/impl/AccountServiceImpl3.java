package com.ping.Service.impl;
import com.ping.Service.IAccountService;
import java.util.*;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl3 implements IAccountService {
  private  String[] myStr;
  private List<String> mylist;
  private Set<String> myset;
  private Map<String,String> mymap;
  private Properties myprp;

    public void setMyStr(String[] myStr) {
        this.myStr = myStr;
    }

    public void setMylist(List<String> mylist) {
        this.mylist = mylist;
    }

    public void setMyset(Set<String> myset) {
        this.myset = myset;
    }

    public void setMymap(Map<String, String> mymap) {
        this.mymap = mymap;
    }

    public void setMyprp(Properties myprp) {
        this.myprp = myprp;
    }

    public void saveAccount() {
        System.out.println(Arrays.toString(myStr));
        System.out.println(mylist);
        System.out.println(mymap);
        System.out.println(myprp);
        System.out.println(myset);
    }
}
