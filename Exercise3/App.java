public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "T'challa";
        knight.sayMyName();
        knight.Attack();

        Character mage = new Character();

        mage.strength = 10;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Jewel";
        mage.sayMyName();
        mage.Attack();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Loki";
        thief.sayMyName();
        thief.Attack();

        Character ranger = new Character();

        ranger.strength = 10;
        ranger.agility = 5;
        ranger.intelligence = 5;
        ranger.name = "Hawkeye";
        ranger.sayMyName();
        ranger.Attack();

        Weapon sword = new Weapon();

        sword.name = "Dagger";
        sword.damage = 999;
        sword.rarity = "Legendary";
        sword.addDamage(1);
        System.out.println(sword.nameRarity());
        
        Weapon gun = new Weapon();

        gun.name = "AK 47";
        gun.damage = 1000;
        gun.rarity = "Rare";
        gun.addDamage(1000);
        System.out.println(gun.nameRarity());

        Weapon grenade = new Weapon();

        grenade.name = "Molotov Cocktail";
        grenade.damage = 3899;
        grenade.rarity = "Epic";
        grenade.addDamage(21);
        System.out.println(grenade.nameRarity());
    }
}
