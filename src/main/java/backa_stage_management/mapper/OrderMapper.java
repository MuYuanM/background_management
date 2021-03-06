	
package backa_stage_management.mapper;

import java.util.List;

import backa_stage_management.pojo.Order;
import backa_stage_management.pojo.OrderExample;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}
	
