public class Character {
    private CharacterType characterType;
    private Strategy attackStrategy;
    private Strategy defenseStrategy;

    public Character(CharacterType characterType, Strategy attackStrategy, Strategy defenseStrategy) {
        this.characterType = characterType;
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;
    }

    public void displayType() {
        characterType.displayType();
    }

    public void attack() {
        attackStrategy.execute();
    }

    public void defend() {
        defenseStrategy.execute();
    }
}