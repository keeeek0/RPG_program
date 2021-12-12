package chapter01;

public class Fool extends Character implements Human {
	//Characterからhp,nameなどのフィールドを継承している
	//Characterから継承した抽象メソッドattack()を実装
	public void attack(Matango m) {//←Matango m
		System.out.println(this.name + "は戦わず遊んでいる");
	}
	//さらにhumanから継承した4つの抽象メソッドを実装
	public void talk() {
		System.out.println(this.name + "は話している");
		}
	
	public void watch() {
		System.out.println(this.name + "は見ている");
		}
	
	public void hear() {
		System.out.println(this.name + "は聞いている");
		}
	
	public void run() {
		System.out.println(this.name + "は逃げる");
		}
	}
	


