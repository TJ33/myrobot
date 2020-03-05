package robot.services.bilibili;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import robot.mapper.provider.bilibili.ArticleMapper;
import robot.model.Article;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    public List<Article> findArticleList(){
        System.out.println("11111111--------");
        System.out.println("22222222--------"+articleMapper.findAll());
        return articleMapper.findAll();
    }
}
