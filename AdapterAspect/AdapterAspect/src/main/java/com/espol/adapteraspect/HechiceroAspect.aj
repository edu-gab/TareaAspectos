package com.espol.adapteraspect;

public aspect HechiceroAspect {
	private Hechicero hechicero = new Hechicero();
    
    pointcut atacar() : execution(void Guerrero.atacar());
    pointcut defenderse() : execution(void Guerrero.defenderse());
    pointcut escapar() : execution(void Guerrero.escapar());
    
    before() : atacar() {
        hechicero.castearHechizoDestructivo();
    }
    
    before() : defenderse() {
        hechicero.escudo();
    }
    
    before() : escapar() {
        hechicero.portal();
    }
}
