import java.util.Random;

class Item{
	public Item(){
		RandomItem();

	}

	public Item(int i){
		SelectItem(i);
	}

	public RandomItem(){
		Random rand = new Random();
		int num = rand.nextInt(7);
		SelectItem(num);
	}

	public SelectItem(int j){
		if(j==0){
			Potion();
		}else if(j==1){
			Koukaton();
		}else if(j==2){
			Yakushin();
		}else if(J==3){
			Light();
		}else if(J>3&&J<7){
			GetBattleCard();
		}else if(J==7){
			GetPassword();
		}else{
			System.out.println("Item errar");
		}
	}

	private Portion(){
		return();
	}

	private Koukaton(){
		return();
	}

	private Yakushin(){
		return();
	}

	public GetBattleCard(){
		return();
	}

	public GetPassword(){
		return();
	}

}
