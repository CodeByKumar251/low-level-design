package com.learn.problems.googleDoc1.input;

public class Image implements Addable{

    private String path;

    public Image(String path){
        this.path=path;
    }

    public String getPath() {
        return path;
    }


    @Override
    public void renderElement() {
        System.out.println("path:"+path);
    }

    @Override
    public String toString() {
        return "Image{" +
                "path='" + path + '\'' +
                '}';
    }
}
