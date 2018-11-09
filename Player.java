class Player {
	public static Player(){
		//プレイヤーのステータス
		int hp = 10;
		boolean poison = false;
		int poisonTurn = 0;
		
		//カード枚数
		int battleCard = 0;
		int swordCard　= 0;
		int shieldCard = 0;
		int magicCard = 0;
		
		//プレーヤーの場所
		int[] myPoint;
		
		//モーションフラグ
		boolean moveFrag = false;
		boolean battleFrag = false;
		
		//アイテムフラグ
		boolean koukaton = false;
		boolean yakushin = false;
		boolean password = false;
		
	}
	//毒ダメージ関数
	public Poison(){
		hp--;
	}
}
