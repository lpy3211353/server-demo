package com.example.demo.server;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.RestData;
import com.lpy.command.CommandResponse;
import com.lpy.command.DefaultCommandResponse;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class IndexService {

    public CommandResponse test(){
        DefaultCommandResponse res=new DefaultCommandResponse();
        res.setRetCode("99");
        res.setRetMsg("oh no");
        return res;
    }

    public CommandResponse tranData(String data) {
        DefaultCommandResponse resp = new DefaultCommandResponse();
        if (data == null){
            resp.setRetCode("-1");
            resp.setRetMsg("no data");
        }
        resp.setRetCode("00");
        RestData restData = JSONObject.parseObject(data,RestData.class);
        resp.setRetMsg(restData.toString());
        return resp;
    }
}

