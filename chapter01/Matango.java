package chapter01;

public class Matango {
	String name;
	int hp;
	final int LEVEL = 10;
	char suffix;//同じ類のものを生成するときに使用
	
	public void birth() {
		System.out.println("敵のお化けキノコが現れた！");
	}
	
	public void run() {
		System.out.print("お化けキノコ" + this.suffix + "は逃げ出した！");
		this.hp -= 3;
		System.out.println("残りのhpが、" + hp +"ポイント");
	
	}
	public final void slip() {//finalが付いているメソッドは子クラスでオーバーライド禁止
		System.out.print("お化けキノコ" + this.suffix + "は、転んだ！");
		this.hp -= 20;
		System.out.println("残りのhpが、" + hp +"ポイント");
	}
}
