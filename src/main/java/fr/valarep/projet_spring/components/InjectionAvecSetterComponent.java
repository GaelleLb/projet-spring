package fr.valarep.projet_spring.components;

import fr.valarep.projet_spring.services.ServiceBonjour;

public class InjectionAvecSetterComponent {

    private ServiceBonjour serviceBonjour; 

    public String direBonjour() {
        return serviceBonjour.bonjour();
    
    }

    public void setServiceBonjour(ServiceBonjour service) {
        serviceBonjour = service; 
    }
}