package com.nsccsz.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Contract implements Serializable {
    private String id;

    private String employer;

    private Integer userAid;

    private String laborer;

    private Integer userBid;

    private String coreness;

    private String monthly;

    private String hours;

    private String store;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date startTime;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date endTime;

    private String projectName;

    private String field;

}