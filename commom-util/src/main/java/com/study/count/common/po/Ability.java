package com.study.count.common.po;

import java.util.Date;

public class Ability {

    private Long abilityId;
    private String abilityEnName;
    private String abilityCnName;
    private String abilityVersion;
    private String abilityBelong;
    private Date ctrTime;

    public Long getAbilityId() {
        return abilityId;
    }

    public void setAbilityId(Long abilityId) {
        this.abilityId = abilityId;
    }

    public String getAbilityEnName() {
        return abilityEnName;
    }

    public void setAbilityEnName(String abilityEnName) {
        this.abilityEnName = abilityEnName;
    }

    public String getAbilityCnName() {
        return abilityCnName;
    }

    public void setAbilityCnName(String abilityCnName) {
        this.abilityCnName = abilityCnName;
    }

    public String getAbilityVersion() {
        return abilityVersion;
    }

    public void setAbilityVersion(String abilityVersion) {
        this.abilityVersion = abilityVersion;
    }

    public String getAbilityBelong() {
        return abilityBelong;
    }

    public void setAbilityBelong(String abilityBelong) {
        this.abilityBelong = abilityBelong;
    }

    public Date getCtrTime() {
        return ctrTime;
    }

    public void setCtrTime(Date ctrTime) {
        this.ctrTime = ctrTime;
    }
}
