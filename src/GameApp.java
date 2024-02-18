public class GameApp {
    public static void main(String[] args) {
        CharacterType knightType = new Knight();
        CharacterType wizardType = new Wizard();
        CharacterType archerType = new Archer();

        Character knight = new Character(knightType, new SwingSwordAttack(), new ShieldDefense());
        knight.displayType();
        knight.attack();
        knight.defend();

        Character wizard = new Character(wizardType, new CastSpellAttack(), new CreateMagicDefense());
        wizard.displayType();
        wizard.attack();
        wizard.defend();

        Character archer = new Character(archerType, new ShootArrowAttack(), new DodgeDefense());
        archer.displayType();
        archer.attack();
        archer.defend();
    }
}