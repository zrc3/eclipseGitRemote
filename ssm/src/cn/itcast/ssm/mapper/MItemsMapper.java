package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.MItems;
import cn.itcast.ssm.po.MItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MItemsMapper {
    long countByExample(MItemsExample example);

    int deleteByExample(MItemsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MItems record);

    int insertSelective(MItems record);

    List<MItems> selectByExample(MItemsExample example);

    MItems selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MItems record, @Param("example") MItemsExample example);

    int updateByExample(@Param("record") MItems record, @Param("example") MItemsExample example);

    int updateByPrimaryKeySelective(MItems record);

    int updateByPrimaryKey(MItems record);
}