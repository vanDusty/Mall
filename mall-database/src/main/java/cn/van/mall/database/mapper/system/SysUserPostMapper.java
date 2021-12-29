package cn.van.mall.database.mapper.system;

import cn.van.mall.database.entity.system.SysUserPostDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户与岗位关联表 Mapper 接口
 * </p>
 *
 * @author VanFan
 * @since 2021-12-29
 */
@Mapper
public interface SysUserPostMapper extends BaseMapper<SysUserPostDO> {

}
