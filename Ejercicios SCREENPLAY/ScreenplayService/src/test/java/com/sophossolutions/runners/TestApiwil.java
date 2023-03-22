package com.sophossolutions.runners;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({
	PostApiwil.class , GetApiwil.class , DeleteApiwil.class
}
		
	)
public class TestApiwil {

}
