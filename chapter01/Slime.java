package chapter01;

public class Slime extends Monster{
	String name;
	int hp;
			
	public void run() {
		System.out.println(this.name + "はササッと逃げ出した。");
		//System.out.println("現在のhpは、" + this.hp);
	}
	public Slime(String name,int hp) {
	this.hp = 50;
	this.name = "スライム";
	}
	
	
	public void birth() {
		System.out.print("敵の" + this.name  + "が現れた！");
		System.out.println("スライムの初期のHPは、" + this.hp);
	}
	private int slime_hp = 50;
	public int getHp() {
		return this.slime_hp;
	}
	public void setHp(int slime_hp) {
		this.slime_hp = slime_hp;
	}
}
