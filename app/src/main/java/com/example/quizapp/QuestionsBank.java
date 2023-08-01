package com.example.quizapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {


    private static List<QuestionsList> javaQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //create object of QuestionsLists class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("Which component is used to compile, debug and execute the java programs","JRE","JIT","JDK","JVM","JDK","");
        final QuestionsList question2 = new QuestionsList("Which one of the following is not a Java feature?","Object-oriented","Use of pointers","Portable","Dynamic and Extensible","Use of pointers","");
        final QuestionsList question3 = new QuestionsList("What is the extension of java code files?",".js",".txt",".class",".java",".java","");
        final QuestionsList question4 = new QuestionsList("Which of the following is not an OOPS concept in Java?","Polymorphism","Inheritance","Compilation","Encapsulation","Compilation","");
        final QuestionsList question5 = new QuestionsList("What is the extension of compiled java classes?",".txt"," .js"," .class"," .java"," .class","");
        final QuestionsList question6 = new QuestionsList("Which of these keywords is used to define interfaces in Java?","intf","Intf"," interface","Interface"," interface","");

        //add all questions to List<QuestionList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> phpQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //create object of QuestionsLists class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("What does PHP stand for?","PHP stands for Preprocessor Home Page","PHP stands for Pretext Hypertext Processor","PHP stands for Hypertext Preprocessor","PHP stands for Personal Hyper Processor","PHP stands for Hypertext Preprocessor","");
        final QuestionsList question2 = new QuestionsList("Which of the following is the correct way to add a comment in PHP code?"," #","//"," /* */","All of the mentioned","All of the mentioned","");
        final QuestionsList question3 = new QuestionsList("Which is the right way of declaring a variable in PHP?","$3hello","$_hello","$this","$5_Hello","$_hello","");
        final QuestionsList question4 = new QuestionsList("What does PDO stand for?","PHP Database Orientation","PHP Data Orientation","PHP Data Object","PHP Database Object","PHP Data Object","");
        final QuestionsList question5 = new QuestionsList("Which variable is used to collect form data sent with both the GET and POST methods?","$_BOTH","$REQUEST","$_REQUEST","$BOTH","$_REQUEST","");
        final QuestionsList question6 = new QuestionsList("A function in PHP which starts with double underscore is known as __________","Default Function","User Defined Function","Inbuilt Function","Magic Function","Magic Function","");

        //add all questions to List<QuestionList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> htmlQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //create object of QuestionsLists class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("What is HTML?","HTML describes the structure of a webpage","HTML is the standard markup language","consists of a set of elements that helps the browser how to view the content","All of the mentioned","All of the mentioned","");
        final QuestionsList question2 = new QuestionsList("Who is the father of HTML?","Rasmus Lerdorf","Tim Berners-Lee","Brendan Eich","Sergey Brin","Tim Berners-Lee","");
        final QuestionsList question3 = new QuestionsList("HTML stands for __________","HyperText Markup Language","HyperText Machine Language","HyperText Marking Language","HighText Marking Language","HyperText Markup Language","");
        final QuestionsList question4 = new QuestionsList("What is the correct syntax of doctype in HTML5?","</doctype html>","<doctype html>","<doctype html!>","<!doctype html>","<!doctype html>","");
        final QuestionsList question5 = new QuestionsList("Which of the following is used to read an HTML page and render it?","Web server","Web network","Web browser","Web matrix","Web browser","");
        final QuestionsList question6 = new QuestionsList("Which element is used to get highlighted text in HTML5?","<u>","<mark>","<highlight>","<b>","<mark>","");

        //add all questions to List<QuestionList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> androidQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //create object of QuestionsLists class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("Android is ?","an operating system","a web browser","a web server","None of the above","an operating system","");
        final QuestionsList question2 = new QuestionsList("Under which of the following Android is licensed?","OSS","Sourceforge","Apache/MIT","None of the above","Apache/MIT","");
        final QuestionsList question3 = new QuestionsList("For which of the following Android is mainly developed?","Servers","Desktops","Laptops","Mobile devices","Mobile devices","");
        final QuestionsList question4 = new QuestionsList("Which of the following virtual machine is used by the Android operating system?","JVM","Dalvik virtual machine","Simple virtual machine","None of the above","Dalvik virtual machine","");
        final QuestionsList question5 = new QuestionsList("Android is based on which of the following language?","Java","C++","C","None of the above","Java","");
        final QuestionsList question6 = new QuestionsList("APK stands fort","Android Phone Kit","Android Page Kit","Android Package Kit","None of the above","Android Package Kit","");

        //add all questions to List<QuestionList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "java" :
                return javaQuestions();
            case "php" :
                return phpQuestions();
            case "android" :
                return androidQuestions();
            default:
                return htmlQuestions();
        }
    }
}
