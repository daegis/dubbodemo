package cn.aegisa.dubbodemo.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hnair.consumer.order.api.IOrderBaseApi;
import com.hnair.consumer.order.model.OrderMain;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedList;
import java.util.List;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 9/10/2018 10:16 PM
 */
@Controller
@Slf4j
public class TestController {

    @Reference(check = false, retries = 0,version = "1.0")
    private IOrderBaseApi orderBaseApi;

    @RequestMapping("/test")
    public String test() {
        List<OrderMain> orderMains = orderBaseApi.queryOrders(new LinkedList<>());
        System.out.println(orderMains);
        return "ok";
    }
}
