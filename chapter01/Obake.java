package chapter01;

public class Obake {
	String name;
	int hp;
	
	public Obake(String name,int hp) {
			this.hp = 200;//hpフィールドを100で初期化
			
			//引数の値でnameフィールドを初期化
			this.name = "おばけ";
	}
	
	public void birth() {
		System.out.print("おばけの" + this.name  + "が現れた！");
		System.out.println(this.name + "の初期のHPは、" + this.hp);
	}
	public void slip() {
		System.out.print( this.name + "は、転んだ！");
		this.hp -= 5;
		System.out.println("残りのhpが、" + hp +"ポイント");
	}

}
