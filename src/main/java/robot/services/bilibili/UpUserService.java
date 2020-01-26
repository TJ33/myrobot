package robot.services.bilibili;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import robot.mapper.provider.UpUserMapper;
import robot.model.UpUser;

import java.util.List;

@Service
public class UpUserService {

    @Autowired
    private UpUserMapper upUserMapper;

    public List<UpUser> findPhotoList(){
        return upUserMapper.findAll();
    }
}
