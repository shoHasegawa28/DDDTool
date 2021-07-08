# DDDクラス生成ツール
DDDで使用するValueObject,DTO,Entityを生成するプログラム

# 実行方法
javac -encoding utf-8 Main.java

# seedData.csvについて
作成する際にseedData.csvに必要な情報を記入する
フォーマットは以下の通り
name,type,valueFlg,valueObjctType

name: 変数名
type: 型
valueFlg: ValueObjectかどうか
valueObjectType: ValueObject内の型

# 注意
- 単体の値を持つValueObjectしか作成することが出来ない
- コマンドプロンプトでコンパイルする際はオプションで文字コードをutf-8に指定する必要がある。
