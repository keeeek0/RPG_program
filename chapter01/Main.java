package chapter01;

public class Main {
	public static void main(String[] args) {
		String name = "gggg";
		int hp = 1247;
		//コンストラクタに渡すべき引数をnewするときに指定
		Hero hero1 = new Hero(name,hp);
//		Hero hero2 = new Hero(name,hp);
//		System.out.println("ヒーロー1の現在のHPは、" + hero1.hp);
//		System.out.println("現在の所持金は、" + Hero.money + "円");
		
		hero1.name = "ヒーロー";
		hero1.hp = 100;
		//インスタンス生成と同時にコンストラクタによってHPに100が代入される
		
		//魔法使い
		Wizard wizard = new Wizard();
		wizard.name = "サリー";
		wizard.hp = 80;

		//フィールドに初期値をセット
		Sword sword = new Sword();
		sword.name = "炎の剣";
		sword.damage = 10;
		
		Weapon weapon = new Weapon();
		weapon.name = "ななしの剣";
		weapon.damage = 5;

		hero1.sword = "炎の剣";
		hero1.birth();
		wizard.weapon = "ななしの剣";
		wizard.birth();
		

		//お化けキノコの1.2のHPを宣言する
		Matango matango1 = new Matango();
		matango1.hp = 40;
		matango1.suffix = '1';
		matango1.name = "お化けキノコ";

		Matango matango2 = new Matango();
		matango2.hp = 40;
		matango2.suffix = '2';

		System.out.println("--------------");
		matango1.birth();
		wizard.attack(matango1);//変数を入れる
		matango1.run();
		//matango2.birth();
		wizard.fireball(matango2);
		matango2.slip();
		System.out.println("--------------");

		//勇者のメソッドを呼び出していく
		
		//Slime slime = new Slime("すらいむ",77);
				Slime slime = new Slime(name, hp);
				slime.name = "スライム";
		
		slime.birth();
		hero1.slip();
		wizard.heal(hero1);
		hero1.sit(25);
		hero1.attack();
		hero1.sword();
		hero1.run();

		System.out.println("--------------");
		//ヒーロークラスを継承したスーパーヒーロークラスを呼び出し
		SuperHero superhero = new SuperHero(name, hp);
		superhero.name = "えーす";
		superhero.hp = 222;
		superhero.birth();
		superhero.fly();
		superhero.sit(8);
		superhero.attack();
		
		
		//slime.hp = 50;
		//wizard.heal(slime);
		slime.run();
		System.out.println("--------------");
		
		hero1.attack_monster(7);
		System.out.println("--------------");
		superhero.run();
		System.out.println("--------------");
		
		Obake obake =new Obake(name, hp);
		obake.name = "ケバケバ";
		//obake.hp = 88;
		obake.birth();
		hero1.attack_obake();
		obake.slip();
		
		System.out.println("--------------");
		//ダンサー
		Dancer dancer = new Dancer();
		dancer.name ="すてっぷさん";
		dancer.hp = 131;
		dancer.birth();
		dancer.dance();


	}
}