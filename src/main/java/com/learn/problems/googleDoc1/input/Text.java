package com.learn.problems.googleDoc1.input;

public class Text implements Addable{

    private String content;

    public Text(String content){
        this.content=content;
    }

    @Override
    public void renderElement() {
        System.out.println("text:"+content);
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Text{" +
                "content='" + content + '\'' +
                '}';
    }
}
