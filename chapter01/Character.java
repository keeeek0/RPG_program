package chapter01;

public abstract class Character {//抽象クラスとしてCharacterを宣言
	String name;
	int hp;
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
		
	}
//戦う
	public abstract void attack(Matango m) ;//←Matango m
//		System.out.println(this.name + "の攻撃！");
//		hp -=  ;
//		System.out.println("敵に　　ポイントのダメージを与えた！");
		
	}
//}
