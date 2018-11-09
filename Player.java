class Player {
	public static Player(){
		//プレイヤーのステータス
		int Hp = 10;
		boolean Poison = false;
		int Poisonturn = 0;
		
		//カード枚数
		int BattleCard = 0;
		int SwordCard　= 0;
		int ShieldCard = 0;
		int MagicCard = 0;
		
		//プレーヤーの場所
		int[] MyPoint;
		
		//モーションフラグ
		boolean MoveFrag = false;
		boolean BattleFrag = false;
		
		//アイテムフラグ
		boolean Koukaton = false;
		boolean Yakushin = false;
		boolean password = false;
		
	}
	//毒ダメージ関数
	public Poison(){
		Player.Hp--;
	}
}
