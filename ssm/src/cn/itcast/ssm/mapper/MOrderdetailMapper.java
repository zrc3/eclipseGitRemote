package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.MOrderdetail;
import cn.itcast.ssm.po.MOrderdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MOrderdetailMapper {
    long countByExample(MOrderdetailExample example);

    int deleteByExample(MOrderdetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MOrderdetail record);

    int insertSelective(MOrderdetail record);

    List<MOrderdetail> selectByExample(MOrderdetailExample example);

    MOrderdetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MOrderdetail record, @Param("example") MOrderdetailExample example);

    int updateByExample(@Param("record") MOrderdetail record, @Param("example") MOrderdetailExample example);

    int updateByPrimaryKeySelective(MOrderdetail record);

    int updateByPrimaryKey(MOrderdetail record);
}