package com.sleepy.eschedule.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;

import com.sleepy.eschedule.entity.BaseEntity;
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
@TableName("time_slots")
public class TimeSlots extends BaseEntity {


    private Integer timeEventId;

    private LocalDateTime beginLocalTime;

    private LocalDateTime endLocalTime;

    private Integer startTimezoneId;

    private Integer endTimezoneId;

    private Integer isSkipped;


}
