package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.MOrders;
import cn.itcast.ssm.po.MOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MOrdersMapper {
    long countByExample(MOrdersExample example);

    int deleteByExample(MOrdersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MOrders record);

    int insertSelective(MOrders record);

    List<MOrders> selectByExample(MOrdersExample example);

    MOrders selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MOrders record, @Param("example") MOrdersExample example);

    int updateByExample(@Param("record") MOrders record, @Param("example") MOrdersExample example);

    int updateByPrimaryKeySelective(MOrders record);

    int updateByPrimaryKey(MOrders record);
}