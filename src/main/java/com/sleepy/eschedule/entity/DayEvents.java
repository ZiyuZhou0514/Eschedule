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
@TableName("day_events")
public class DayEvents extends BaseEntity {


    private Integer userName;

    private String name;

    private LocalDate beginDate;

    private LocalDate endDate;

    private String repeated;

    private Integer repetitionStep;

    private String repeatedMonthlyOn;

    private String repeatedUntil;

    private String repeatedUntilDate;

    private Integer repeatedReps;


}
