package com.study.count.osn;

import com.study.count.common.util.HttpClientUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Description:osn接收请求
 *
 * @author GuoChunHao
 * @date 2018/05/27 22:50
 * @since 1.0
 */
@Controller
public class OsnServlet
{
    private static final Logger logger = LoggerFactory.getLogger(OsnServlet.class);

    @RequestMapping(value = "/osnReceive")
    @ResponseBody
    public String osnReceiveRequest(HttpServletRequest request)
    {
        logger.info("OSN receive request from User successfully");
        String result = HttpClientUtil.sendGet("http://localhost:8081/sc/scReceive", "");

        return result;
    }
}
