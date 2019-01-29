package com.nsccsz;

import com.nsccsz.mapper.ContractMapper;
import com.nsccsz.service.IContractService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SzcloudSpringbootApplicationTests {

	@Autowired
	private ContractMapper contractMapper;

	@Autowired
	private IContractService iContractService;
	@Test
	public void contextLoads() {
	}

	@Test
	public void testInsert(){
		String uid = UUID.randomUUID().toString().substring(0,5);
		//contractMapper.insertSelective(new Contract(uid,"gaochao",2,"chao",3,"1核","1月","1小时","8G",new Date(),new Date(),"超算中心","大数据"));
		//System.out.println("helloworld");
//		System.out.println(iContractService.getContractList());
//		PageHelper.startPage(3, 5);
//		List<Contract> contractList = iContractService.getContractList();
//		PageInfo page = new PageInfo(contractList, 5);
	}

}

