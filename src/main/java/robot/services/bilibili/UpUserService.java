package robot.services.bilibili;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import robot.mapper.provider.bilibili.UpUserMapper;
import robot.model.bilibili.UpUser;

import java.util.List;

@Service
public class UpUserService {

    @Autowired
    private UpUserMapper upUserMapper;

    public List<UpUser> findUpUserList(){
        System.out.println("service+++++++++++++++++++++++++++++++++++++");
        return upUserMapper.findAll();
    }

    public String test(){
        System.out.println("test+++++++++++++++++++++++++++++++++++++");
        return "test";
    }


}
