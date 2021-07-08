
// Java 標準
import java.util.*;
import java.io.*;

// 自作パッケージ
import Repository.*;
import Models.*;
import CreateClass.*;

/**
 * 概要
 *  Domain駆動設計内で使うValueObject,Entity,DTOを一斉に生成するためのプログラム
 *
 * 使用方法
 *  test.csvファイルに作成するエンティティ情報をカンマ区切りで入力する
 * 書き方は
 * 変数名,型,ValueObjectフラグ,ValueObjectの順で書く
 * 
 * またコンパイル時にUtf-8でエンコードする必要がある
 * javac -encoding utf-8 Main.java で実行する。
 * 実行後エンティティ名を入力する。
 * 最後にOutputフォルダー内に該当するValueObject,エンティティ,DTOが生成される。
 *
 * 注意
 *  生成されるのは単一のValueObjectのみ複数値を持つValueObjectには非対応
 *
 * */
public class Main {
	public static void main(String[] args){
		
		OperateCsvFile test = new OperateCsvFile();
		ArrayList<ClassSheed> sheeds =  test.Read();

		System.out.print("エンティティ名を入力してください  ");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();

		ArrayList<AbstractCreateClass> classes = new ArrayList<AbstractCreateClass>(){ 
			{
				add(new CreateEntity(sheeds,fileName));
				add(new CreateDTO(sheeds,fileName));
				add(new CreateValueObject(sheeds,fileName));
			} 
		};
		
		for(AbstractCreateClass createClass : classes){
			try{
				createClass.Create();
			}catch(IOException ex){
				System.out.println(ex);
			}
		}

	}
}
