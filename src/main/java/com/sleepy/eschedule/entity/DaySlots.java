package com.sleepy.eschedule.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDate;

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
@TableName("day_slots")
public class DaySlots extends BaseEntity {


    private Integer dayEventId;

    private LocalDate theDate;

    private Integer isSkipped;


}
