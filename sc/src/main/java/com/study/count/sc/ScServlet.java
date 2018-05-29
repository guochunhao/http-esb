package com.study.count.sc;

import com.study.count.common.po.Ability;
import com.study.count.common.po.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

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

    @Resource
    private AbilityService abilityService;

    @RequestMapping(value = "/scReceive")
    @ResponseBody
    public Response scReceive(HttpServletRequest request) {

        logger.info("sc receive request:" + request);

        Ability ability = new Ability();
        ability.setAbilityId(123l);
        ability.setAbilityEnName("douyin");
        ability.setAbilityCnName("抖音");
        ability.setAbilityBelong("APASS");
        ability.setAbilityVersion("V1.0");
        ability.setCtrTime(new Date());

        abilityService.insertAbility(ability);

        return new Response("0000", "SC receive request from OSN successfully");
    }
}
