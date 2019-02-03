package com.nsccsz.controller;

import com.nsccsz.common.ServerResponse;
import com.nsccsz.entity.Contract;
import com.nsccsz.service.IContractService;
import com.nsccsz.vo.ContractVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * 合同管理
 * Created by kj on 2019/1/18.
 */

@Controller
@RequestMapping("/contract")
public class ContractController {

    @Autowired
    private IContractService iContractService;

    @RequestMapping("save")
    @ResponseBody
    public ServerResponse contractSave(Contract contract){
        //填充我们增加产品的业务逻辑
        return iContractService.saveOrUpdateProduct(contract);
    }
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable("id") String id,ModelMap map){

        ContractVo contract = iContractService.find(id);
        map.put("contract",contract);
        return "contract/contractEdit";
    }
    @RequestMapping("/list")
    @ResponseBody
    public ServerResponse getContractList(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                          @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                                          Model model){
        return iContractService.getContractList(pageNum,pageSize);

    }

    @RequestMapping(value="/delete/{id}")
    @ResponseBody
    public ServerResponse deleteContract(@PathVariable("id") String id){
        //填充我们增加产品的业务逻辑
        return iContractService.delete(id);
    }

    /**
     * 登录跳转
     *
     * @param model
     * @return
     */
    @GetMapping("/listContract")
    public String contractManage(Model model) {
        return "contract/contractManage";
    }

    @GetMapping("/index")
    public String index(Model model) {
        return "contract/contractManage";
    }
}
