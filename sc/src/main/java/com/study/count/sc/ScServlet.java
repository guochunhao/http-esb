package com.study.count.sc;

import com.study.count.common.po.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Description:sc接收请求
 *
 * @author GuoChunHao
 * @date 2018/05/27 22:50
 * @since 1.0
 */
@Controller
public class ScServlet {
    private static final Logger logger = LoggerFactory.getLogger(ScServlet.class);

    @RequestMapping(value = "/scReceive")
    @ResponseBody
    public Response scReceive(HttpServletRequest request) {

        logger.info("sc receive request:" + request);

        return new Response("0000", "SC receive request from OSN successfully");
    }
}
