package com.learn.problems.googleDoc1.client;

import com.learn.problems.googleDoc1.document.DocumentElement;
import com.learn.problems.googleDoc1.input.Addable;
import com.learn.problems.googleDoc1.input.Image;
import com.learn.problems.googleDoc1.input.Text;
import com.learn.problems.googleDoc1.persistance.SaveDocument;

public class DocumentEditor {
    DocumentElement docEle;
    SaveDocument saveDoc;

    public DocumentEditor(DocumentElement docEle, SaveDocument saveDoc){
        this.docEle=docEle;
        this.saveDoc=saveDoc;
    }

    public void addText(String content){
        docEle.addElement(new Text(content));
    }

    public void addImage(String path){
        docEle.addElement(new Image(path));
    }

    public void renderDoc(){
        docEle.render();
    }

    public void save(){
        saveDoc.save();
    }

}
