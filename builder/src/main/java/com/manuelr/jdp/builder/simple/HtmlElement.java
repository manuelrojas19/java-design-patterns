package com.manuelr.jdp.builder.simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * HtmlElement
 */
@Getter
@Setter
@NoArgsConstructor
public class HtmlElement {
    private final int indentSize = 2;
    private final String newLine = System.lineSeparator();

    private String name;
    private String text;
    private List<HtmlElement> elements = new ArrayList<>();

    public HtmlElement(String name, String text) {
        this.name = name;
        this.text = text;
    }

    private String toStringImpl(int indent) {
        StringBuilder sb = new StringBuilder();
        String i = String.join("", Collections.nCopies(indent * indentSize, " "));
        sb.append(String.format("%s<%s>%s", i, name, newLine));
        if (text != null && !text.isEmpty()) { 
            sb.append(String.join("", Collections.nCopies(indentSize * (indent+1), " ")))
                .append(text)
                .append(newLine);
        }
        for (HtmlElement e : elements)
            sb.append(e.toStringImpl(indent + 1));

        sb.append(String.format("%s</%s>%s", i, name, newLine));
        return sb.toString();
  }

    @Override
    public String toString() {
        return toStringImpl(0);
    }  
}
