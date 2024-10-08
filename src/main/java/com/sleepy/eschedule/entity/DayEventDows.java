package com.sleepy.eschedule.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("day_event_dows")
public class DayEventDows extends BaseEntity {


    @TableId(value = "day_event_id", type = IdType.AUTO)
    private Integer dayEventId;

    private String dayOfWeek;


}
