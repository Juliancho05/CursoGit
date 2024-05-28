package com.defaultpackage.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class TaskGit implements Task {
    private final String prueba;

    public TaskGit(String prueba) {
        this.prueba = prueba;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
