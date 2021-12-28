package com.manuelr.jdp.builder.simple;

import lombok.Getter;
import lombok.Setter;

/**
 * HtmlBuilder
 */
@Getter
@Setter
public class HtmlBuilder {
    private String rootName;
    private HtmlElement root = new HtmlElement();

    public HtmlBuilder(String rootName) {
        this.rootName = rootName;
        root.setName(rootName);
    }

    public HtmlBuilder addChild(String name, String text) {
        HtmlElement e = new HtmlElement(name, text);
        root.getElements().add(e);
        return this;
    }

    public void clear() {
        root = new HtmlElement();
        root.setName(rootName);
    }

    @Override
    public String toString() {
        return root.toString();
    }
}
