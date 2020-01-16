// On ne peux pas instancier une interface

package fr.valarep.projet_spring.services;


public class ServiceBonjourimpl implements ServiceBonjour {

    @Override
    public String bonjour() {
        return "Salut tertous !";
    }

    
}