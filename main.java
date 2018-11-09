class main{
	
	//勝利条件を満たしているか
	public boolean vic_con = false;
	//敗北条件を満たしているか
	public boolean def_con = false;

	public static void main(String[] args) {
		//5*5の部屋のダンジョンを作成
		int[] dangeon = new int[5,5];
		//プレイヤーを作成
		Player player = new Player();

	}
	
	//プレイヤーの移動
	//神崎
	public int[] move(String direction){
		//現在地を取得
		int[] mp = getMYPoint();
		//入力された値を大文字に変換
		String d = direction.toUpperCase;
		//1マス移動
		//W:上(北) / S:下(南) / A:左(西) / D:右(東)
		if (d.equals('W')) {
			mp[1] -= 1;
		}else if (d.equals('S')) {
			mp[1] += 1;
		}else if (d.equals('A')) {
			mp[0] -= 1;
		}else if (d.equals('D')) {
			mp[0] += 1;
		}else{
			System.out.println("WASDで1文字入力してください");
		}
		player.setMyPoint(mp);
	}
}
