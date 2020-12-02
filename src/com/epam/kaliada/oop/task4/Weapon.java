package com.epam.kaliada.oop.task4;

public class Weapon extends Treasure{
    private WeaponType weaponType;

    public Weapon(String name, double value, String description, WeaponType weaponType) {
        super(name, value, description);
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return super.toString() + " " + weaponType;
    }
}
