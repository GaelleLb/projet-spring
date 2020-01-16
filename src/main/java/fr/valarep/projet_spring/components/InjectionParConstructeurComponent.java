package fr.valarep.projet_spring.components;

import fr.valarep.projet_spring.services.ServiceBonjour;

public class InjectionParConstructeurComponent {
    
    private ServiceBonjour serviceBonjour;

    public InjectionParConstructeurComponent(ServiceBonjour serviceBonjour) {
        this.serviceBonjour = serviceBonjour; 
    }

    public String direBonjour() {
        return serviceBonjour.bonjour();
    }
}

