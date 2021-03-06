package com.nsccsz.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.util.Date;

@Data
@JsonSerialize(include =  JsonSerialize.Inclusion.NON_NULL)
public class Contract {
    private String id;

    private String employer;

    private Integer userAid;

    private String laborer;

    private Integer userBid;

    private String coreness;

    private String monthly;

    private String hours;

    private String store;


    private Date startTime;


    private Date endTime;

    private String projectName;

    private String field;

    private Integer status;

    private Date createTime;

}