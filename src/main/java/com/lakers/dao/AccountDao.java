package com.lakers.dao;

import com.lakers.domain.Account;
import com.lakers.vo.QueryVo;

import java.util.List;

/**
 * @Author: panyusheng
 * @Date: 2020/5/9 10:35
 * @Version 1.0
 */
public interface AccountDao {

    List<Account> findAll();

    Account findByName(String name);

    void saveAccount(Account account);

    List<Account> findByCondition(Account account);

    List<Account> findByPwd(QueryVo vo);

}
