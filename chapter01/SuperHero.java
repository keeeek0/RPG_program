package chapter01;

public class SuperHero extends Hero{
	int slime_hp;
	
	public SuperHero(String name,int hp) {
//		this.name = "keiko";
//		this.hp = 200;//hpフィールドを100で初期化
		super("エース",200);
	}
	Slime slime = new Slime(name, hp) ;
		
	public void birth() {
		System.out.println("スーパー勇者が現れた!その名は、" + getName());//getName()
		System.out.println("スーパー勇者のhpは、" + this.hp);
	}
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した!");
	}
	public void run() {
		System.out.println(getName() + "は撤退した");//親クラスのメンバを子クラスで上書きすることをオーバーライドと言う
	}
//	public void slip() {  final継承できない
//	}
	public void attack() {
		super.attack();
		if(this.flying) {
			super.attack();
		}
		slime_hp =  slime.getHp();
		//System.out.println("スライムの初期hpは、" + slime_hp);
		
		System.out.print(getName() + "の攻撃！");
		
		slime_hp -= 5;	
	System.out.println("スライムモンスターAに5ポイントのダメージをあたえた！");
	if(this.flying) {
		System.out.print(getName() + "の攻撃！");
		slime_hp -= 5;
		System.out.println("スライムモンスターAに5ポイントのダメージをあたえた！");
		
	
	}
	System.out.println("現在のスライムモンスターAのhpは、" + slime_hp);
		
//	private int  monster_hp;
////	public String getName() {
////		return this.hero_name;
////	}
//	public void setHp(int monster_hp) {
//		this.monster_hp = slime_hp;
//	}
	
//	public void attack() {
//		super.attack();
//		if(this.flying) {
//			super.attack();
//		}
//	}
	
}
}