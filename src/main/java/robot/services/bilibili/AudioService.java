package robot.services.bilibili;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import robot.mapper.provider.AudioMapper;
import robot.model.Audio;

import java.util.List;

@Service
public class AudioService {

    @Autowired
    private AudioMapper audioMapper;

    public List<Audio> findAudioList(){
        return audioMapper.findAll();
    }
}
