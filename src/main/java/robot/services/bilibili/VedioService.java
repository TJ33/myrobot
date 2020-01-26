package robot.services.bilibili;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import robot.mapper.provider.VedioMapper;
import robot.model.Vedio;

import java.util.List;

@Service
public class VedioService {

    @Autowired
    private VedioMapper vedioMapper;

    public List<Vedio> findVedioList(){
        return vedioMapper.findAll();
    }
}
