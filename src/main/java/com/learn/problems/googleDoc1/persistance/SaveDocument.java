package com.learn.problems.googleDoc1.persistance;

import com.learn.problems.googleDoc1.document.DocumentElement;
import com.learn.problems.googleDoc1.input.Addable;

import java.util.List;

public class SaveDocument {

    private DocumentElement docEle;

    public SaveDocument(DocumentElement docEle){
        this.docEle=docEle;
    }

    public void save(){
        List<Addable> lst=docEle.getDocEle();
        System.out.println("saving document: "+ lst.toString());

    }
}
