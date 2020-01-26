package robot.mapper.provider;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import robot.model.UpUser;

import java.util.List;

@Mapper
public interface UpUserMapper {

    @Select("SELECT * FROM UPUSER")
    List<UpUser> findAll();
}
