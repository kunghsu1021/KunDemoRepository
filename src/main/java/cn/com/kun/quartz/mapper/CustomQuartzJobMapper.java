package cn.com.kun.quartz.mapper;

import cn.com.kun.quartz.common.CustomQuartzJob;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CustomQuartzJobMapper {

    List<CustomQuartzJob> query(Map map);

}
