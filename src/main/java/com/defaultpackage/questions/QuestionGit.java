package com.defaultpackage.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class QuestionGit implements Question {
    private static String name;
    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo();
        return null ;
    }
}
