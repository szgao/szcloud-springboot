package com.nsccsz.service;

import com.github.pagehelper.PageInfo;
import com.nsccsz.common.ServerResponse;
import com.nsccsz.entity.Contract;

/**
 * Created by kj on 2019/1/18.
 */
public interface IContractService {
    ServerResponse<PageInfo> getContractList(Integer pageNum, Integer pageSize);

    ServerResponse saveOrUpdateProduct(Contract contract);
}
