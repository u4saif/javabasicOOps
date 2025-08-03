package com.javabasics;

public class TextBox extends UIControl {

    private  String text = "";

//    public TextBox(String text) {
//        super(true);
//        System.out.println("TextBox class");
//        this.text = text;
//    }

    //Method Overriding example
    @Override
    public String toString(){
        return text;
    }

    @Override
    public void render(){
        System.out.println("Text box render");
    }
    public void setText(String text ){ this.text = text;}

    public void clear() { text = "";}

}
