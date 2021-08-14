package io.github.tanghuibo.fastjsondemo.config;

import com.sun.jndi.rmi.registry.ReferenceWrapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.naming.NamingException;
import javax.naming.Reference;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author tanghuibo
 * @date 2021/8/15上午1:06
 */
@Configuration
public class RimServerConfig {

    @Value("${rmi.port:9999}")
    Integer rmiPort;

    @Value("${rmi.className}")
    String rmiClassName;

    @Value("${server.port:8080}")
    Integer serverPort;

    @PostConstruct
    public void init() throws RemoteException, NamingException, AlreadyBoundException {
        Registry registry = LocateRegistry.createRegistry(rmiPort);
        Reference reference = new Reference(rmiClassName, rmiClassName, "http://127.0.0.1:" + serverPort + "/");
        ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
        registry.bind(rmiClassName, referenceWrapper);
    }
}
