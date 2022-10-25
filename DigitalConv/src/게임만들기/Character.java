package 게임만들기;
public class Character {
    String name; // 캐릭터 이름
    int type; // 1이면 탱커, 2이면 원딜, 3이면 근딜, 4이면 힐러
    int hp; // 체력
    int pPower; // 피지컬 파워
    int mPower; // 마법 파워
    double pHit; // 물리 공격력에 대한 적중률
    double mHit; // 마법 공격력에 대한 적중률

    public Character(String name, int type, int hp, int pPower, int mPower, double pHit, double mHit) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.pPower = pPower;
        this.mPower = mPower;
        this.pHit = pHit;
        this.mHit = mHit;
    }
    // 물리 공격력에 대한 메소드
    double pAttack() {
        return pPower * pHit;
    }
    double mAttack() {
        return mPower * mHit;
    }
    void infoCharacter() {
        String[] charType = {"", "탱커", "원거리 딜러", "근접 딜러", "힐러"};
        System.out.println("이름 : " + name);
        System.out.println("타입 : " + charType[type]);
        System.out.println("체력 : " + hp);
        System.out.printf("물리 공격력 : %.2f\n", pAttack());
        System.out.printf("마법 공격력 : %.2f\n", mAttack());
    }
}
