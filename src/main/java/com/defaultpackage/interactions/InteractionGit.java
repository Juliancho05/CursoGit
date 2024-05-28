package com.defaultpackage.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class InteractionGit implements Interaction {
    private final String name;

    public InteractionGit(String name) {
        this.name = name;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
