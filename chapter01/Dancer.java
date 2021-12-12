package chapter01;

public class Dancer extends Character{
	
	String name;
	int hp;
	
	public void birth() {
		System.out.println("ダンサーの" + this.name + "が現れた！");
	}
	
	
	public void dance() {
		System.out.println(this.name + "は情熱的に踊った");
	}
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		hp -= 3;
	}

}