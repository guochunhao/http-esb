package com.study.count.hsn;

import com.study.count.common.po.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Description:hsn接收请求
 *
 * @author GuoChunHao
 * @date 2018/05/27 22:50
 * @since 1.0
 */
@Controller
public class HsnServlet
{
    private static final Logger logger = LoggerFactory.getLogger(HsnServlet.class);

    @RequestMapping(value = "/hsnReceive")
    @ResponseBody
    public Response hsnReceiveRequest(HttpServletRequest request)
    {
        logger.info("hsn receive request");
        return new Response("0000", "hsn receive request from sc successfully");
    }
}
