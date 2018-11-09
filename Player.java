class Player {
	public Player(){
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
		boolean afterBattle = false;
		
		//アイテムフラグ
		boolean koukaton = false;
		boolean yakushin = false;
		boolean password = false;
		
	}
	
	//毒関数
	public static void SetPoison(){
		poison = true;
		poisonTurn = 3;
	}
	
	//HP変更関数
	public static void SetHP(int value){
		hp += value;
		if(value > 0){
			System.out.println("HPが"+value+"回復した");
		}else if(value < 0){
			System.out.println(Math.abs(value)+"ダメージ");
		}	
	}
	
	//現在地変更関数
	public void SetMyPoint(int[][] point){
		mypoint = point;
	}
	
	//現在地取得関数
	public int[][] getMyPoint(){
	 return myPoint;	
	}
	
}
