package com.nsccsz.controller;

import com.nsccsz.common.ServerResponse;
import com.nsccsz.entity.Contract;
import com.nsccsz.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 合同管理
 * Created by kj on 2019/1/18.
 */

@Controller
public class ContractController {

    @Autowired
    private IContractService iContractService;

    @RequestMapping("save.do")
    @ResponseBody
    public ServerResponse contractSave(Contract contract){
        //填充我们增加产品的业务逻辑
        return iContractService.saveOrUpdateProduct(contract);
    }
    @RequestMapping("/list.do")
    @ResponseBody
    public ServerResponse getContractList(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                          @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                                          Model model){
        return iContractService.getContractList(pageNum,pageSize);

    }

    @RequestMapping(value="/delete.do/{ids}")
    @ResponseBody
    public ServerResponse deleteContract(@PathVariable("ids") String ids){
        //填充我们增加产品的业务逻辑
        return iContractService.delete(ids);
    }

    /**
     * 登录跳转
     *
     * @param model
     * @return
     */
    @GetMapping("/")
    public String index(Model model) {
        return "login";
    }

}
