//package com.springcloudify.cloudy.configserver.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.config.environment.Environment;
//import org.springframework.cloud.config.environment.PropertySource;
//import org.springframework.cloud.config.server.environment.EnvironmentRepository;
//import org.springframework.util.StringUtils;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * Created with IntelliJ IDEA.
// * User: Erasme
// * Date: 2018/5/15
// * Time: 18:12
// * Description:
// */
//public class ConfigEnvironmentRepository implements EnvironmentRepository {
//    @Autowired
//    private IConfigService service;
//
//    @Override
//    public Environment findOne(String application, String profile, String label) {
//        if (StringUtils.isEmpty(application) || StringUtils.isEmpty(profile)) return null;
//        List<ConfigInfo> configList = service.find(application, profile, label);
//        if(configList != null && configList.size()>0){
//            Environment environment = new Environment(application,
//                    StringUtils.commaDelimitedListToStringArray(profile),label,"version", "state");
//            Map map = new HashMap<>();
//            for(ConfigInfo configInfo:cconfigList){
//                map.put(configInfo.getKey(), configInfo.getValue());
//            }
//            environment.add(new PropertySource(application + "_" + profile + "_" + label, map));
//            return environment;
//        }
//        return new Environment(application,StringUtils.commaDelimitedListToStringArray(profile));
//    }
//}
