package robot.mapper.provider;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import robot.model.Audio;

import java.util.List;

@Mapper
public interface AudioMapper {

    @Select("SELECT * FROM AUDIO")
    List<Audio> findAll();
}
