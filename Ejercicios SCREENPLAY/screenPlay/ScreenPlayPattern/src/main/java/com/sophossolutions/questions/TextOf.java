package com.sophossolutions.questions;

import org.openqa.selenium.WebElement;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class TextOf implements Question<String>{
	
	Target txtuser;
	

	public TextOf(Target txtuser) {
		this.txtuser = txtuser;
	}


	@Override
	public String answeredBy(Actor actor) {
		
		actor.wasAbleTo(WaitUntil.the(txtuser,WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds());
		return Text.of(txtuser).answeredBy(actor);
		
		
	}

	
	public static TextOf field(Target txtuser) {
		return new TextOf(txtuser);
	}

	
}
