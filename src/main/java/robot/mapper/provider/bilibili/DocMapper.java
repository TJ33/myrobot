package robot.mapper.provider;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import robot.model.Doc;

import java.util.List;

@Mapper
public interface DocMapper {

    @Select("SELECT * FROM DOC")
    List<Doc> findAll();

}
