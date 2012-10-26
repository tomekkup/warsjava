package jug.warsjavaqx.services.impl;

import com.avaje.ebean.EbeanServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public abstract class AbstractEbeanService {
    
    @Autowired
    protected EbeanServer ebeanServer;

    @Required
    public void setEbeanServer(EbeanServer ebeanServer) {
        this.ebeanServer = ebeanServer;
    }
}
