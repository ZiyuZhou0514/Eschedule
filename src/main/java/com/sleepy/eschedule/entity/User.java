package com.sleepy.eschedule.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;

import java.time.LocalDate;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.sleepy.eschedule.entity.BaseEntity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author generator@ZiyuZhou
 * @since 2024-10-08
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("user")
public class User extends BaseEntity {


    @TableId(value = "phone_number", type = IdType.AUTO)
    @NotEmpty(message = "电话号码不能为空！")
    private String phoneNumber;

    @NotEmpty(message="用户名不能为空!")
    private String userName;

    @NotEmpty(message="密码不能为空")
    @Size(min=8,message="密码长度不能小于8位!")
    private String password;

    private String salt;

    private String authorization;

    private String email;

    private LocalDate birthday;

    @TableField("firstLogin")
    private LocalDate firstLogin;

    private String picture;


}
