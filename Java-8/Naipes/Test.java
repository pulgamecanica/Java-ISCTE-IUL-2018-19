import java.util.*;

public class Test{

  public static void main(String[] args){

    Rank ppp = Rank.SETE;

    System.out.println(ppp);
    System.out.println("O ordinal é" + ppp.ordinal());

    System.out.println("Todos");
    for (Rank x: Rank.values())
      System.out.println(x.name());

    Rank ppp2 = Rank.valueOf("DEZ");
    Rank ppp3 = Rank.valueOf("DAMA");
    System.out.println(ppp2);
    System.out.println(ppp3);

    System.out.println("Valor: " + ppp2.getRankValue());

    //graus
    for (Rank y: Rank.values())
      System.out.println(y.getRankValue());

    System.out.println("*************************************************");
    Suit s1 = Suit.SPADES;
    Suit s2 = Suit.DIAMONDS;
    System.out.println(s1);
    System.out.println(s2);

    System.out.println("Todos");
    for (Suit x: Suit.values())
      System.out.println(x.name());
    Suit s3 = Suit.valueOf("HEARTS");
    System.out.println(s3);
    System.out.println("*************************************************");

    List<Rank> rankArray = new ArrayList<>();
    Rank p1 = Rank.SETE;
    Rank p2 = Rank.VALETE;
    Rank p3 = Rank.DAMA;
    Rank p4 = Rank.REI;
    Rank p5 = Rank.DEZ;
    Rank p6 = Rank.TRES;
    //
    rankArray.add(p1);
    rankArray.add(p2);
    rankArray.add(p3);
    rankArray.add(p4);
    rankArray.add(p5);
    rankArray.add(p6);
    System.out.println("The Sum of the list is: " + sumRankArray(rankArray));
    }

    // Valores de cartas de jogo B)
    public static int sumRankArray(List<Rank> arrayRank){
      int result = 0; 
      for(Rank x: arrayRank)
        result += x.getRankValue();
      return result;
    }

  }
