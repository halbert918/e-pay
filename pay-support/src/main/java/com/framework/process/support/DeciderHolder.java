package com.framework.process.support;

import java.io.Serializable;

/**
 * Created by admin on 2017/1/10.
 * 选择器
 */
public class DeciderHolder implements Serializable {

    private String name;

    private String decide;

    private String expression;

    public DeciderHolder(String name, String decide) {
        this.name = name;
        this.decide = decide;
    }

    public DeciderHolder(String name, String decide, String expression) {
        this.name = name;
        this.decide = decide;
        this.expression = expression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecide() {
        return decide;
    }

    public void setDecide(String decide) {
        this.decide = decide;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
}
