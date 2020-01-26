package robot.mapper.provider;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import robot.model.Photo;

import java.util.List;

@Mapper
public interface PhotoMapper {

    @Select("SELECT * FROM PHOTO")
    List<Photo> findAll();
}
