package fr.valarep.projet_spring.components;

import fr.valarep.projet_spring.services.ServiceBonjour;

public class InjectionDirecteComponent {
    
    private ServiceBonjour serviceBonjour;

    public String direBonjour() {
        return serviceBonjour.bonjour();
    }
}
