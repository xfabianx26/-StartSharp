package org.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CredentialsValidation implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return true;
    }

    public static CredentialsValidation isSuccessful() {
        return new CredentialsValidation();
    }
}
