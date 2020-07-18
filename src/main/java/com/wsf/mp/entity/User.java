package com.wsf.mp.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import java.util.Date;

@Data
@TableName("bjz_user_info")
public class User extends Model  {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private Long userId;
    private Long stationId;
    private String stationName;

    @TableLogic
    private Integer enabled = 1;

    @Version
    private Integer version = 1;
}
