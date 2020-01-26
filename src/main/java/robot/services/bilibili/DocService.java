package robot.services.bilibili;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import robot.mapper.provider.DocMapper;
import robot.model.Doc;

import java.util.List;

@Service
public class DocService {

    @Autowired
    private DocMapper docMapper;

    public List<Doc> findDocList(){
        return docMapper.findAll();
    }
}
