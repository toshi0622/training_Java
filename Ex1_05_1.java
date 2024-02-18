/*-< 演習：Ex1_05_1 >-------------------------------------------------------------------
以下①～⑤のデータを格納する変数を定義したい。
それぞれに適した型で変数宣言&初期化を行ってください。
なお、変数名はJavaの一般的に規則に従っていることはもちろん、
「どのようなデータが格納されているか一目でわかる名前」になるよう意識してつけてください。
  ① IT業界の生涯賃金（調べてください）
  ② IT業界の市場規模（調べてください）
  ③ 自分の好きな漢字1文字 ※char型を使いましょう
  ④ 自分のなりたい職業
  ⑤ 自分が既卒かどうか ※boolean型を使いましょう
--------------------------------------------------------------------------------------*/
class Ex1_05_1 {
  public static void main(String[] args) {
    // IT業界の生涯賃金
    int itIndustryLifetimeWage = 276000000;
    System.out.println(itIndustryLifetimeWage);

    // IT業界の市場規模
    long itIndustryMarketSize = 13550000000000L;
    System.out.println(itIndustryMarketSize);

    // 自分の好きな漢字1文字
    char favoriteKanji = '藤';
    System.out.println(favoriteKanji);

    // 自分のなりたい職業
    String dreamJob = "システムエンジニア";
    System.out.println(dreamJob);

    // 自分が既卒かどうか
    boolean previousGraduate = true;
    System.out.println(previousGraduate);

  }
}
