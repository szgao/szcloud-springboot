package com.nsccsz.vo;

import lombok.Data;

import java.util.Date;

/**
 * Created by kj on 2019/2/2.
 */
@Data
public class ContractVo {
    private String id;

    private String employer;

    private Integer userAid;

    private String laborer;

    private Integer userBid;

    private String coreness;

    private String monthly;

    private String hours;

    private String store;


    private String startTime;


    private String endTime;

    private String projectName;

    private String field;
}
