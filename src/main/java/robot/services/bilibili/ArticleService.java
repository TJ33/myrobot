package robot.services.bilibili;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import robot.mapper.provider.ArticleMapper;
import robot.model.Article;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    public List<Article> findArticleList(){
        return articleMapper.findAll();
    }
}
