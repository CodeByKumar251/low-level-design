package com.learn.problems.googleDoc1;

import com.learn.problems.googleDoc1.client.DocumentEditor;
import com.learn.problems.googleDoc1.document.DocumentElement;
import com.learn.problems.googleDoc1.persistance.SaveDocument;

public class Main {
    public static void main(String[] args) {

        DocumentElement documentElement=new DocumentElement();
        SaveDocument save=new SaveDocument(documentElement);
        DocumentEditor docs=new DocumentEditor(documentElement,save);

        docs.addText("Hello world!");
        docs.addImage("C/desktop/image.jpg");
        docs.addText("Bye world!");
        docs.renderDoc();
        docs.save();
    }
}
