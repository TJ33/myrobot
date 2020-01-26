package robot.mapper.provider;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import robot.model.Vedio;

import java.util.List;

@Mapper
public interface VedioMapper {

    @Select("SELECT * FROM VEDIO")
    List<Vedio> findAll();
}
