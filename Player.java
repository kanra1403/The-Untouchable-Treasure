class Player {

    //プレイヤーのステータス
    int hp;
    boolean poison;
    int poisonTurn;

    //カード枚数
    int battleCard;
    int swordCard;
    int shieldCard;
    int magicCard;

    //モーションフラグ
    boolean moveFrag;
    boolean battleFrag;
    boolean afterBattle;

    //アイテムフラグ
    boolean koukaton;
    boolean yakushin;
    boolean password;

    //プレーヤーの場所
    int[] myPoint;

    public Player() {

        hp = 10;
        poison = false;
        poisonTurn = 0;

        battleCard = 0;
        swordCard = 0;
        shieldCard = 0;
        magicCard = 0;

        moveFrag = false;

        battleFrag = false;

        afterBattle = false;

        koukaton = false;

        yakushin = false;

        password = false;

    }

    //毒関数
    public void SetPoison() {
        poison = true;
        poisonTurn = 3;
    }

    //HP変更関数
    public void SetHP(int value) {
        hp += value;
        if (hp > 10) {
            hp = 10;
        }

        if (value > 0) {
            System.out.println("HPが" + value + "回復した");
        } else if (value < 0) {
            System.out.println(Math.abs(value) + "ダメージ");
        } else {
            System.out.println("しかし何も起こらない");
        }
    }

    //現在地変更関数
    public void SetMyPoint(int[] point) {
        myPoint = point;
    }

    //現在地取得関数
    public int[] getMyPoint() {
        return myPoint;
    }
    
}
