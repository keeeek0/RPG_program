package chapter01;

public class Wizard extends Character{
	
	
	int mp;
	String weapon;
	
	public void birth() {
		System.out.print("魔法使い" + this.name  + "を生み出しました！");
		System.out.println("現在の武器は" + this.weapon);
		System.out.println("魔法使いの初期のHPは、" + this.hp);
	}
	
	public void heal(Hero hero) {
		hero.hp +=10;
		System.out.println(this.name + "が" + hero.name + "のHPを10回復した！");
	}
	public void attack (Matango m){
		System.out.println(this.name + "の攻撃!");
		System.out.println("お化けキノコ1に3ポイントのダメージ　");
	}
	public void fireball(Matango m) {
		System.out.println(this.name + "は火の玉を放った！");
		System.out.println("お化けキノコ2に20ポイントのダメージ");
		hp -= 20;
		this.mp -= 5;
	}
	public void heal(Slime slime) {
		slime.hp +=10;
		System.out.println(this.name + "が" + slime.name + "のHPを10回復した！");
		System.out.println("スライムの現在のHPは、" + slime.hp);
}
}