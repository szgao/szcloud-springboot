package com.nsccsz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nsccsz.common.ServerResponse;
import com.nsccsz.entity.Contract;
import com.nsccsz.entity.ContractExample;
import com.nsccsz.mapper.ContractMapper;
import com.nsccsz.service.IContractService;
import com.nsccsz.util.DateTimeUtil;
import com.nsccsz.vo.ContractVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
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
        if(contract != null){
            if(contract.getId()!=null){
                int rowCount = contractMapper.updateByPrimaryKey(contract);
                if(rowCount > 0){
                    return ServerResponse.createBySuccess("合同信息更新成功");
                }
            }else{
               int rowCount = contractMapper.insert(contract);
               if(rowCount > 0){
                   return ServerResponse.createBySuccess("新增合同成功");
               }
                return ServerResponse.createBySuccess("新增合同失败");
            }
        }
        return ServerResponse.createByErrorMessage("新增或更新合同参数不正确");
    }

    @Override
    public ServerResponse delete(String ids) {
        if(ids != null){
            Contract contract =  new Contract();
            contract.setId(ids);
            contract.setStatus(0);
            contract.setCreateTime(new Date());
            if(ids.contains("-")){
                List<String> del_ids = new ArrayList<>();
                String[] str_ids = ids.split("-");
                for(String id : str_ids){
                    del_ids.add(id);
                }
                ContractExample example = new ContractExample();
                ContractExample.Criteria criteria = example.createCriteria();
                criteria.andIdIn(del_ids);
                int rowCount = contractMapper.updateByExampleSelective(contract,example);
                if(rowCount > 0){
                    return ServerResponse.createBySuccess("批量删除成功");
                }
                return ServerResponse.createBySuccess("批量删除失败");
            }else{
                int rowCount = contractMapper.updateByPrimaryKeySelective(contract);
                if(rowCount > 0){
                    return ServerResponse.createBySuccess("合同删除成功");
                }
                return ServerResponse.createBySuccess("合同删除失败");
            }
        }
        return ServerResponse.createByErrorMessage("合同删除失败");
    }

    @Override
    public ContractVo find(String id) {
        Contract contract = contractMapper.selectByPrimaryKey(id);
        ContractVo contractVo = assembleContractVo(contract);
        return contractVo;
    }

    private ContractVo assembleContractVo(Contract contract) {
        ContractVo contractVo =  new ContractVo();
        contractVo.setCoreness(contract.getCoreness());
        contractVo.setEmployer(contract.getEmployer());
        contractVo.setProjectName(contract.getProjectName());
        contractVo.setField(contract.getField());
        contractVo.setHours(contract.getHours());
        contractVo.setLaborer(contract.getLaborer());
        contractVo.setMonthly(contract.getMonthly());
        contractVo.setStore(contract.getStore());
        contractVo.setUserAid(contract.getUserAid());
        contractVo.setUserBid(contract.getUserBid());
        contractVo.setStartTime(DateTimeUtil.dateToStr(contract.getStartTime()));
        contractVo.setEndTime(DateTimeUtil.dateToStr(contract.getEndTime()));

        return contractVo;
    }
}
