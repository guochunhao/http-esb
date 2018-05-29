package com.study.count.sc;

import com.study.count.common.mapper.AbilityMapper;
import com.study.count.common.po.Ability;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AbilityServiceImpl implements AbilityService {

    @Resource
    private AbilityMapper abilityMapper;

    public int insertAbility(Ability ability) {
        return abilityMapper.insertAbility(ability);
    }
}
