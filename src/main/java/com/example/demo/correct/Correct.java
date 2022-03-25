package com.example.demo.correct;

import com.example.demo.server.IndexService;
import com.lpy.command.AbstractCommandServiceFactory;
import com.lpy.command.CommandResponse;
import com.lpy.command.DefaultCommandRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liangpengyu
 */
@Service("correct")
public class Correct extends AbstractCommandServiceFactory<DefaultCommandRequest> {
    private IndexService indexService;

    @Autowired
    public void setIndexService(IndexService indexService){
        this.indexService=indexService;
    }

    @Override
    protected CommandResponse executeCommand(DefaultCommandRequest commandRequest) throws Exception {
        return indexService.test();
    }
}
