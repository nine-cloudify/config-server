package com.springcloudify.cloudify.configserver.repository;

import com.springcloudify.cloudify.configserver.entity.Properties;
import org.springframework.data.repository.CrudRepository;

/**
 * Created with IntelliJ IDEA.
 * User: Erasme
 * Date: 2018/5/17
 * Time: 00:22
 * Description:
 */
public interface PropRepository extends CrudRepository<Properties, Long> {

}
