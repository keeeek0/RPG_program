package chapter01;

//public final class Hero {
//宣言時にfinalが付けられているクラスは継承できない

public  class Hero {
String name; //名前の宣言
int hp;      //HPの宣言
static int money = 100000;

int slime_hp = 50;//スライムのHPの宣言
//Slime slime = new Slime(name, hp);
//インスタンス化（new)
//slime_hp =  slime.getHp();

int obake_hp = 200;
//String obake_name;
//int obake_hp;
//Obake obake = new Obake(obake_name, obake_hp);

//Sword sword;
String sword;

public void birth() {
	System.out.print("勇者" + this.name  + "を生み出しました！");
	System.out.println("現在の武器は" + this.sword);
	System.out.println("勇者の初期のHPは、" + this.hp);
}
public void sleep() {
	this.hp = 100;
	System.out.println(this.name + "は、眠って回復した！");
}
public void sit(int sec) {
	this.hp +=sec;
	System.out.print(this.name + "は、" + sec + "秒座った！");
	System.out.println("HPが" + sec + "ポイント回復した！" );
}
public final void slip() {//finalが付いているメソッドは子クラスでオーバーライド禁止
	this.hp -= 5;
	System.out.print(this.name + "は、転んだ！");
	System.out.println("5のダメージ！");
}
public void run() {
	System.out.println(this.name + "は、逃げ出した！");
	System.out.println("現在のHPは" + this.hp + "！");
}
public void attack() {
	System.out.print(this.name + "は、攻撃した！");
	System.out.println("スライムモンスターBに5ポイントのダメージを与えた！");
    slime_hp -= 5;
    System.out.println("スライムモンスターBの現在のHPは、" + slime_hp);
}
public void attack_obake() {
	System.out.print(this.name + "は、攻撃した！");
	System.out.println("ケバケバに5ポイントのダメージを与えた！");
    obake_hp -= 5;
    System.out.println("ケバケバの現在のHPは、" + obake_hp);
    
}

public void sword() {
	System.out.println(this.name + "は、" + sword + "で攻撃した！");
}	
public void attack_monster(int hp) {
	System.out.print(this.name + "の攻撃！");
	System.out.println("スライムモンスターに10ポイントのダメージを与えた！");
	slime_hp -= 10;
	//this.hp -=10;
	
}
public Hero(String name,int hp) {
//public Hero() {
	this.hp = 100;//hpフィールドを100で初期化
	
	//引数の値でnameフィールドを初期化
	this.name = "ヒーロー";  
}
private String hero_name = "エース";
public String getName() {
	return this.hero_name;
}
public void setName(String hero_name) {
	this.hero_name = hero_name;
}
}
