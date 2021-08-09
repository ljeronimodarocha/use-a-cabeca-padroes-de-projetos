package gameCharacter;

public abstract class CharacterGame {

    
    
    WeaponBehavioer weaponBehavioer;

    void setWeapon(WeaponBehavioer wb){
        this.weaponBehavioer = wb;
    }

    public void fight(){
        this.weaponBehavioer.useWeapon();
    }
}
