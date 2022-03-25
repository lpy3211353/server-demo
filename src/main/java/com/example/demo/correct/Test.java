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
@Service("test")
public class Test extends AbstractCommandServiceFactory<Test.Req> {
    private IndexService indexService;

    @Override
    protected CommandResponse executeCommand(Req commandRequest) throws Exception {
        return indexService.tranData(commandRequest.getData());
    }

    @Autowired
    public void setIndexService(IndexService indexService) {
        this.indexService = indexService;
    }

    public static class Req extends DefaultCommandRequest {
        private String data;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
    }
}
