package com.go.ym.serviceimpl;

import com.go.ym.mapper.AcountMapper;
import com.go.ym.pojo.Acount;
import com.go.ym.service.AcountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



/**
 * @title: AcountServiceImpl
 * @Author Tan
 * @Date: 2021/6/22 11:20
 * @Version 1.0
 */
@Service
//事务控制，只读
@Transactional(readOnly = true)
public class AcountServiceImpl implements AcountService {
    @Autowired
    AcountMapper acountMapper;
    //重写根据姓名查账户的方法
    public Acount getAcountByName(String name) {
        return acountMapper.findAcountByName(name);
    }

    //重写转账的方法
    @Transactional(readOnly =false)
    public void transfer(String fromName, String toName, double money) {
        Acount from = acountMapper.findAcountByName(fromName);
        Acount to = acountMapper.findAcountByName(toName);
        from.setMoney(from.getMoney()-money);
        to.setMoney(to.getMoney()+money);
        //更改
        acountMapper.updateAcount(from);
        //int i  = 1/0;
        acountMapper.updateAcount(to);
    }
}
