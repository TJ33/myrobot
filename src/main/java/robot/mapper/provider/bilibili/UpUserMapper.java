package robot.mapper.provider.bilibili;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import robot.model.bilibili.UpUser;

import java.util.List;

@Mapper
public interface UpUserMapper {

    @Select("SELECT * FROM user")
    List<UpUser> findAll();
}
