package com.liw.apollo.listener;

import com.ctrip.framework.apollo.model.ConfigChange;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import org.springframework.context.annotation.Configuration;

/**
 * 描述：阿婆罗监听
 * create by Liw
 * create on 2020/2/19 0019
 **/

@Configuration
public class ApolloConfigListener {

    @ApolloConfigChangeListener("TEST1.namespace")
    private void anotherOnChange(ConfigChangeEvent changeEvent) {
        ConfigChange change = changeEvent.getChange("test1");
        System.out.println(String.format("Found change - key: %s, oldValue: %s,"
                + " newValue: %s, changeType: %s", change.getPropertyName(), change.getOldValue(), change.getNewValue(), change.getChangeType()));
    }
}
