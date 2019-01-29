package com.nsccsz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nsccsz.common.ServerResponse;
import com.nsccsz.entity.Contract;
import com.nsccsz.mapper.ContractMapper;
import com.nsccsz.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kj on 2019/1/21.
 */
@Service("iContractService")
public class IContractServiceImpl implements IContractService {

    @Autowired
    private ContractMapper contractMapper;
    @Override
    public ServerResponse<PageInfo> getContractList(Integer pageNum, Integer pageNo){
        PageHelper.startPage(pageNum,pageNo);
        List<Contract> contractList = contractMapper.selectByExample(null);
        PageInfo pageResult =  new PageInfo(contractList);
        return ServerResponse.createBySuccess(pageResult);
    }

    @Override
    public ServerResponse saveOrUpdateProduct(Contract contract) {
        return null;
    }
}
