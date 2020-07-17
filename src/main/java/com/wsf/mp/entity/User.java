package com.wsf.mp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import java.util.Date;

@Data
@TableName("bjz_user_info")
public class User extends Model  {

    @TableId(type = IdType.ASSIGN_ID)
    private Long userId;
//    private Long stationId;
//    private String stationName;

    @TableLogic
    private Integer enabled;
}
