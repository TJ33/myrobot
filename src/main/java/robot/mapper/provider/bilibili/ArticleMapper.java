package robot.mapper.provider.bilibili;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import robot.model.Article;

import java.util.List;

@Mapper
public interface ArticleMapper {

    @Select("SELECT * FROM ARTICLE")
    List<Article> findAll();
}
