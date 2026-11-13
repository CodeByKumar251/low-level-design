package com.learn.problems.googleDoc1.document;

import com.learn.problems.googleDoc1.input.Addable;

import java.util.ArrayList;
import java.util.List;

public class DocumentElement {

    private List<Addable> docEle;

    public DocumentElement(){
        docEle=new ArrayList<>();
    }

    public void addElement(Addable addable){
        docEle.add(addable);
    }

    public void render(){
        for(Addable addable: docEle){
            addable.renderElement();
        }
    }

   public List<Addable> getDocEle(){
        return docEle;
    }
}
