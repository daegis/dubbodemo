package cn.aegisa.dubbodemo.api.impl;

import cn.aegisa.dubbodemo.api.TestApi;
import com.alibaba.dubbo.config.annotation.Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 8/27/2018 11:19 AM
 */
@Service(interfaceClass = TestApi.class, version = "1.0", owner = "xyd")
@Component
@Slf4j
public class TestApiImpl implements TestApi {
    @Override
    public String getTime() {
        log.info("访问到了服务提供者");
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
