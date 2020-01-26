package robot.services.bilibili;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import robot.mapper.provider.PhotoMapper;
import robot.model.Photo;

import java.util.List;

@Service
public class PhotoService {

    @Autowired
    private PhotoMapper photoMapper;

    public List<Photo> findPhotoList(){
        return photoMapper.findAll();
    }
}
